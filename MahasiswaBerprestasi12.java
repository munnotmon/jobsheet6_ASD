public class MahasiswaBerprestasi12 {
    Mahasiswa12[] listMhs;
    int idx = 0;

    MahasiswaBerprestasi12(int jumlah) {
        listMhs = new Mahasiswa12[jumlah];
    }

    void tambah(Mahasiswa12 m) {
        if (idx < listMhs.length) {
            listMhs[idx++] = m;
        } else {
            System.out.println("Data sudah penuh.");
        }
    }

    void tampil() {
        for (Mahasiswa12 m : listMhs) {
            if (m != null) {
                m.tampilInformasi();
                System.out.println("-----------------------");
            }
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    Mahasiswa12 temp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = temp;
                }
            }
        }
    }
}