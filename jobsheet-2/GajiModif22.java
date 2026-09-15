import java.util.Scanner;
public class GajiModif22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gajiPokok, tunjanganPerAnak, jumlahAnak, totalTunjangan, potonganPensiun, gajiBersih;
        double prosentasePensiun = 0.10;

        System.out.println("Masukkan gaji pokok: ");
        gajiPokok = sc.nextInt();
        System.out.println("Masukkan tunjangan per anak: ");
        tunjanganPerAnak = sc.nextInt();
        System.out.println("Masukkan jumlah anak: ");
        jumlahAnak = sc.nextInt();

        totalTunjangan = jumlahAnak * tunjanganPerAnak;
        potonganPensiun = (int) (prosentasePensiun * gajiPokok);
        gajiBersih = gajiPokok + totalTunjangan - potonganPensiun;

        System.out.println("Gaji bersih yang diterima adalah " + gajiBersih);

        sc.close();
    }
}