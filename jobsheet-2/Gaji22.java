public class Gaji22 {
    public static void main(String[] args) {
        int gajiPokok, jumlahAnak, tunjanganPerAnak, totalTunjangan, potonganPensiun, gajiBersih;
        double prosentasePensiun = 0.10;

        gajiPokok = 5000000;
        tunjanganPerAnak = 100000;
        jumlahAnak = 4;

        totalTunjangan = jumlahAnak * tunjanganPerAnak;
        potonganPensiun = (int) (prosentasePensiun * gajiPokok);
        gajiBersih = gajiPokok + totalTunjangan - potonganPensiun;

        System.out.println("Gaji bersih yang diterima adalah " + gajiBersih);
    }
}