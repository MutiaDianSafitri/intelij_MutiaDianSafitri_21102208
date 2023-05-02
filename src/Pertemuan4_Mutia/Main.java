package Pertemuan4_Mutia;

public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager();
        pegawai pegawai = new pegawai();

        manager.nip  = 21102208;
        manager.nama = "Mutia";

        pegawai.nip = 123456789;
        pegawai.nama = "Putri";

        manager.showinfo();
        manager.extrainfo();
        manager.bonus(1000000);

        pegawai.showinfo();
        pegawai.extrainfo();

    }
}
