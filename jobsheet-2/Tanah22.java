public class Tanah22 {
    public static void main(String[] args) {
        int lebarTanah, panjangTanah, luasTanah, sisiTaman, luasTaman, luasTanahYangTidakDigunakan;
        double phi, diameterKolam, jariKolam, luasKolam;

        phi = 3.14;
        
        // luas tanah seluruhnya
        lebarTanah = 30;
        panjangTanah = 100;

        luasTanah = lebarTanah * panjangTanah;

        System.out.println("Luas tanah seluruhnya: " + luasTanah);

        // luas kolam
        diameterKolam = 5;
        jariKolam = diameterKolam / 2;

        luasKolam = phi * jariKolam * jariKolam;

        System.out.println("Luas kolam: " + luasKolam);

        // luas taman
        sisiTaman = 2;
        luasTaman = sisiTaman * sisiTaman;

        System.out.println("Luas taman: " + luasTaman);

        // luas tanah yang tidak digunakan
        luasTanahYangTidakDigunakan = (int) (luasTanah - luasKolam - luasTaman);

        System.out.println("Luas tanah yang tidak digunakan: " + luasTanahYangTidakDigunakan);
    }
}
