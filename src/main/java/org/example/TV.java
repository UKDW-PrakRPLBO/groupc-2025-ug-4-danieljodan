package org.example;

public class TV {
    private int maxResolusi;
    private Colokan colokan;

    public int getResolution(){
        int resolusiAkhir = 0;
        if (colokan.getRealBandwidth() < maxResolusi && colokan.getRealBandwidth() >= 10){
            if (colokan.getRealBandwidth() >= 10 && colokan.getRealBandwidth() <= 35) {
                resolusiAkhir = 480;
            } else if(colokan.getRealBandwidth() > 35 && colokan.getRealBandwidth() <= 100) {
                resolusiAkhir = 720;
            } else {
                resolusiAkhir = 1080;
            }
        }
        return resolusiAkhir;
    }

    public TV(int maxResolusi){
        this.maxResolusi = maxResolusi;
    }

    public void connect(Colokan colokan) {
        this.colokan = colokan;
        System.out.println("Berhasil Connect ke " + colokan.getMerk());
    }
}
