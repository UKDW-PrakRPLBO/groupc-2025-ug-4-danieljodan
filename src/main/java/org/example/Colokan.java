package org.example;

public abstract class Colokan {
    private String merk;
    private double promisedBandwidth;
    private int harga;

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public double getPromisedBandwidth() {
        return promisedBandwidth;
    }

    public double setPromisedBandwidth(double promisedBandwidth) {
        this.promisedBandwidth = promisedBandwidth;
        return promisedBandwidth;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public Colokan(int harga, double promisedBandwidth, String merk) {
        setHarga(harga);
        setPromisedBandwidth(promisedBandwidth);
        setMerk(merk);
    }

    public abstract double getRealBandwidth();
}
