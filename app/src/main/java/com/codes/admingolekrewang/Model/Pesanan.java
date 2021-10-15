package com.codes.admingolekrewang.Model;

public class Pesanan {
    String jenis_layanan,alat_kebersihan, lama_berlangganan,
            preferensi_pekerja, jumlah_pekerja, foto_rumah, pesan, code, user_id, status, nama_pekerja,child,metode_bayar,waktu_mulai,alamat,nama;
    int total;

    public Pesanan(String jenis_layanan,String alat_kebersihan, String lama_berlangganan, String preferensi_pekerja, String jumlah_pekerja, String foto_rumah, String pesan, String code, String user_id, String status, String nama_pekerja, int total,String child,String metode_bayar,String waktu_mulai,String alamat,String nama) {
        this.alat_kebersihan = alat_kebersihan;
        this.lama_berlangganan = lama_berlangganan;
        this.preferensi_pekerja = preferensi_pekerja;
        this.jumlah_pekerja = jumlah_pekerja;
        this.foto_rumah = foto_rumah;
        this.pesan = pesan;
        this.code = code;
        this.user_id = user_id;
        this.status = status;
        this.nama_pekerja = nama_pekerja;
        this.total = total;
        this.child = child;
        this.metode_bayar = metode_bayar;
        this.jenis_layanan = jenis_layanan;
        this.waktu_mulai = waktu_mulai;
        this.alamat = alamat;
        this.nama = nama;
    }

    public Pesanan(){}

    public String getNama() {
        return nama;
    }

    public String getJenis_layanan() {
        return jenis_layanan;
    }

    public String getWaktu_mulai() {
        return waktu_mulai;
    }

    public String getMetode_bayar() {
        return metode_bayar;
    }

    public String getChild() {
        return child;
    }

    public String getAlat_kebersihan() {
        return alat_kebersihan;
    }

    public String getLama_berlangganan() {
        return lama_berlangganan;
    }

    public String getPreferensi_pekerja() {
        return preferensi_pekerja;
    }

    public String getJumlah_pekerja() {
        return jumlah_pekerja;
    }

    public String getFoto_rumah() {
        return foto_rumah;
    }

    public String getPesan() {
        return pesan;
    }

    public String getCode() {
        return code;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getStatus() {
        return status;
    }

    public String getNama_pekerja() {
        return nama_pekerja;
    }

    public int getTotal() {
        return total;
    }

    public String getAlamat() {
        return alamat;
    }
}


