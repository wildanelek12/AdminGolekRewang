package com.codes.admingolekrewang.ui.dashboard;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.codes.admingolekrewang.Adapter.AdapterPesanan;
import com.codes.admingolekrewang.Adapter.AdapterUser;
import com.codes.admingolekrewang.Model.Pesanan;
import com.codes.admingolekrewang.Model.User;
import com.codes.admingolekrewang.R;
import com.codes.admingolekrewang.ui.dashboard.DashboardViewModel;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

import cn.pedant.SweetAlert.SweetAlertDialog;

public class DashboardFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;
    private RecyclerView rvUser;
    ArrayList<User> userArrayList;
    AdapterUser adapterUser;
    DatabaseReference databaseReference2;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);

        rvUser = (RecyclerView) root.findViewById(R.id.rv_user);
        userArrayList = new ArrayList<>();
        rvUser.setHasFixedSize(true);
        rvUser.setLayoutManager(new LinearLayoutManager(getContext()));

        databaseReference2 = FirebaseDatabase.getInstance().getReference("user");
        SweetAlertDialog pDialog = new SweetAlertDialog(getContext(), SweetAlertDialog.PROGRESS_TYPE);
        pDialog.getProgressHelper().setBarColor(Color.parseColor("#A5DC86"));
        pDialog.setTitleText("Loading");
        pDialog.setCancelable(false);
        pDialog.show();

        final DatabaseReference reference2 = FirebaseDatabase.getInstance().getReference("user");
        reference2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                userArrayList.clear();
                if (dataSnapshot.exists()) {
                    for (DataSnapshot npsnapshot : dataSnapshot.getChildren()) {
                        User l = npsnapshot.getValue(User.class);
                        userArrayList.add(l);
                    }
                    pDialog.dismissWithAnimation();
                    adapterUser = new AdapterUser(getContext(), userArrayList);
                    adapterUser.notifyDataSetChanged();
                    rvUser.setAdapter(adapterUser);
                } else {
                    pDialog.dismissWithAnimation();
                    new SweetAlertDialog(getContext(), SweetAlertDialog.WARNING_TYPE)
                            .setTitleText("Perhatian")
                            .setContentText("Tidak ada data !")
                            .show();
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        return root;
    }


}