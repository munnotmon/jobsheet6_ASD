public class MahasiswaBerprestasi12 {
    Mahasiswa12 [] listMhs = new Mahasiswa12 [5];
    int idx;

    void tambah (Mahasiswa12 m){
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil () {
        for (Mahasiswa12 m : listMhs) {
            m.tampilInformasi();
            System.out.println("-----------------------");
        }
    }

    void bubblesort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    Mahasiswa12 tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }
}
