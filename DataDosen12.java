public class DataDosen12 {
    Dosen12[] dataDosen = new Dosen12[10];
    int idx = 0;

    void tambah(Dosen12 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx++] = dsn;
        } else {
            System.out.println("Data sudah penuh.");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }

    void SortingASC() { 
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen12 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
        System.out.println("Data berhasil diurutkan ASC (Usia Muda ke Tua - Bubble Sort).");
    }

    void SortingDSC() { 
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[maxIdx].usia) {
                    maxIdx = j;
                }
            }
            Dosen12 temp = dataDosen[maxIdx];
            dataDosen[maxIdx] = dataDosen[i];
            dataDosen[i] = temp;
        }
        System.out.println("Data berhasil diurutkan DSC (Usia Tua ke Muda - Selection Sort).");
    }

    void InsertionDSC() { 
        for (int i = 1; i < idx; i++) {
            Dosen12 temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j - 1].usia < temp.usia) {
                dataDosen[j] = dataDosen[j - 1];
                j--;
            }
            dataDosen[j] = temp;
        }
        System.out.println("Data berhasil diurutkan DSC (Usia Tua ke Muda - Insertion Sort).");
    }
}
