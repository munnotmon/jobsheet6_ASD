import java.util.Scanner;
public class MahasiswaDemo12 {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);
        System.out.print("\nMasukkan jumlah mahasiswa: ");
        int jumlah = sc12.nextInt();
        sc12.nextLine();

        MahasiswaBerprestasi12 list = new MahasiswaBerprestasi12(jumlah);

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMasukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim = sc12.nextLine();
            System.out.print("Nama: ");
            String nama = sc12.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc12.nextLine();
            System.out.print("IPK: ");
            double ipk = sc12.nextDouble();
            sc12.nextLine();

            list.tambah(new Mahasiswa12(nim, nama, kelas, ipk));
        }

        System.out.println("\nData mahasiswa sebelum sorting:");
        list.tampil();

        System.out.println("\nData mahasiswa setelah sorting berdasarkan IPK (DESC):");
        list.bubbleSort();
        list.tampil();

        System.out.println("\nData yang sudah terurut menggunakan SELECTION SORT (ASC): ");
        list.SelectionSort();
        list.tampil();

        System.out.println("\nData yang sudah terurut menggunakan INSERTION SORT (ASC): ");
        list.insertionSort();
        list.tampil();
    }
}