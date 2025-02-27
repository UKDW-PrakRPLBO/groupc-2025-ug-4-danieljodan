package org.example;

public class HDMI extends Colokan{
    public HDMI(int harga, double promisedBandwidth, String merk) {
        super(harga, promisedBandwidth, merk);
    }

    @Override
    public double getRealBandwidth() {
        int harga = super.getHarga();
        double rasioHarga = (double) harga / 50000;
        double hasil = 0;
        if (rasioHarga < 1) {
            hasil = rasioHarga * super.getPromisedBandwidth();
        } else {
            hasil = super.getPromisedBandwidth();
        }
        return hasil;
    }
}
