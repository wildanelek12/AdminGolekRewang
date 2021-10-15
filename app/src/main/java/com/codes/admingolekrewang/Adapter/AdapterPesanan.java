package com.codes.admingolekrewang.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.codes.admingolekrewang.Model.Pesanan;
import com.codes.admingolekrewang.R;

import java.util.ArrayList;

public class AdapterPesanan extends RecyclerView.Adapter<com.codes.admingolekrewang.Adapter.AdapterPesanan.PesananViewHolder> {
    ArrayList<Pesanan> pesananList;
    Context context;


    public AdapterPesanan(Context context, ArrayList<Pesanan> pesananList) {
        this.pesananList = pesananList;
        this.context = context;
    }

    @NonNull
    @Override
    public PesananViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pesanan, parent, false);
        PesananViewHolder holder = new PesananViewHolder(v); //inisialisasi ViewHolder
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull PesananViewHolder holder, int position) {
        Pesanan pesanan = pesananList.get(position);
        holder.tvCode.setText(pesanan.getCode());
        holder.tvBiaya.setText("Rp "+String.valueOf(pesanan.getTotal()));
        holder.tvJenisLayanan.setText(pesanan.getJenis_layanan());
        holder.tvStatus.setText(pesanan.getStatus());
        holder.tvTime.setText(pesanan.getWaktu_mulai());
        holder.tv_alamat.setText(pesanan.getAlamat());
        holder.tv_nama.setText(pesanan.getNama());

    }

    @Override
    public int getItemCount() {
        return pesananList.size();
    }


    public class PesananViewHolder extends RecyclerView.ViewHolder {
        private TextView tvCode;
        private TextView tvJenisLayanan;
        private TextView tvTime;
        private TextView tvBiaya;
        private TextView tvStatus;
        private TextView tv_alamat;
        private TextView tv_nama;
        private Button showDetail;


        public PesananViewHolder(@NonNull View itemView) {
            super(itemView);
            tvCode = (TextView) itemView.findViewById(R.id.tv_code);
            tvJenisLayanan = (TextView) itemView.findViewById(R.id.tv_jenis_layanan);
            tvTime = (TextView) itemView.findViewById(R.id.tv_time);
            tvBiaya = (TextView) itemView.findViewById(R.id.tv_biaya);
            tvStatus = (TextView) itemView.findViewById(R.id.tv_status);
            tv_alamat = (TextView) itemView.findViewById(R.id.tv_alamat);
            tv_nama = (TextView) itemView.findViewById(R.id.tv_nama);
        }
    }
}