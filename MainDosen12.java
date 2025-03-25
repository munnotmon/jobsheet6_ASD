import java.util.Scanner;

public class MainDosen12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen12 dataDosen = new DataDosen12();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Dosen");
            System.out.println("3. Sorting ASC (Usia Muda ke Tua - Bubble Sort)");
            System.out.println("4. Sorting DSC (Usia Tua ke Muda - Selection Sort)");
            System.out.println("5. Sorting DSC (Usia Tua ke Muda - Insertion Sort)");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Kode: ");
                    String kode = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (L = Laki-laki, P = Perempuan): ");
                    String jkInput = sc.nextLine();
                    boolean jk = jkInput.equalsIgnoreCase("L"); 
                    System.out.print("Usia: ");
                    int usia = sc.nextInt();
                    dataDosen.tambah(new Dosen12(kode, nama, jk, usia));
                    break;
                case 2:
                    dataDosen.tampil();
                    break;
                case 3:
                    dataDosen.SortingASC();
                    break;
                case 4:
                    dataDosen.SortingDSC();
                    break;
                case 5:
                    dataDosen.InsertionDSC();
                    break;
                case 6:
                    System.out.println("Terima kasih!");
                    sc.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
