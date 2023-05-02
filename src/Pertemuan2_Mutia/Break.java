package Pertemuan2_Mutia;

public class Break {

    public static void main(String[] args) {
        int p = 0;
        while (p <=100) {
            System.out.println("Perulanan ke-" +p);
            if (p == 50) {
                System.out.println("Capek Bang !");
                break;
            }
            p +=10;
        }
    }
}
