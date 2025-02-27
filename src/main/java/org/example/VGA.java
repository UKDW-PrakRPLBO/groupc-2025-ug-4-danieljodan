package org.example;

public class VGA extends Colokan{
    public VGA(int harga, double promisedBandwidth, String merk) {
        super(harga, promisedBandwidth, merk);
    }

    @Override
    public double getRealBandwidth() {
        int harga = super.getHarga();
        double rasioHarga = (double) harga / 30000;
        double hasil = 0;
        if (rasioHarga < 1) {
            hasil = rasioHarga * super.getPromisedBandwidth();
        } else {
            hasil = super.getPromisedBandwidth();
        }
        return hasil;
    }
}
