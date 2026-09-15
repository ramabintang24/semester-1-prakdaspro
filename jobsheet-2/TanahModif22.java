import java.util.Scanner;
public class TanahModif22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lebarTanah, panjangTanah, luasTanah, sisiTaman, luasTaman, luasTanahYangTidakDigunakan;
        double phi, diameterKolam, jariKolam, luasKolam;

        phi = 3.14;
        
        // luas tanah seluruhnya
        System.out.println("Masukkan lebar tanah: ");
        lebarTanah = sc.nextInt();
        System.out.println("Masukkan panjang tanah: ");
        panjangTanah = sc.nextInt();

        luasTanah = lebarTanah * panjangTanah;

        System.out.println("Luas tanah seluruhnya: " + luasTanah);

        // luas kolam
        System.out.println("Masukkan diameter kolam: ");
        diameterKolam = sc.nextInt();
        jariKolam = diameterKolam / 2;

        luasKolam = phi * jariKolam * jariKolam;

        System.out.println("Luas kolam: " + luasKolam);

        // luas taman
        System.out.println("Masukkan sisi taman: ");
        sisiTaman = sc.nextInt();
        luasTaman = sisiTaman * sisiTaman;

        System.out.println("Luas taman: " + luasTaman);

        // luas tanah yang tidak digunakan
        luasTanahYangTidakDigunakan = (int) (luasTanah - luasKolam - luasTaman);

        System.out.println("Luas tanah yang tidak digunakan: " + luasTanahYangTidakDigunakan);

        sc.close();
    }
}
