import java.util.HashMap;
import java.util.Scanner;

public class Latihan1 {
    static Scanner input = new Scanner(System.in);
    String nama, kelas, subject;
    int nim;

    public Latihan1(String nama, String kelas, String subject, int nim) {
        this.nama = nama;
        this.kelas = kelas;
        this.subject = subject;
        this.nim = nim;
    }

    public static void main(String[] args) {
        HashMap<String, Latihan1> hLat = new HashMap<>();
        String user_input;
        Latihan1 data;

        hLat.put("1", new Latihan1("Putri", "3A", "Struktur Data", 2020201));
        hLat.put("2", new Latihan1("Agus", "3H", "Basis Data", 2020202));
        hLat.put("3", new Latihan1("Ario", "3I", "Pemrograman", 2020203));

        System.out.print("Masukkan ID: ");
        user_input = input.nextLine();
        data = hLat.get(user_input);

        if (data != null) {
            System.out.println("Data Mahasiswa : " + data.nama + ", Kelas : " + data.kelas + ", Matkul : "
                    + data.subject + ", NIM : " + data.nim);
        }

    }
}
