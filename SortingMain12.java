public class SortingMain12 {
    
    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};
        int b[] = {30, 20, 2, 8, 14};

        Sorting12 dataurut1 = new Sorting12(a, a.length);
        
        System.out.println("\nData awal 1");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("\nData sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataurut1.tampil();

        Sorting12 dataurut2 = new Sorting12(b, b.length);
        
        System.out.println("\nData awal 2");
        dataurut2.tampil();
        dataurut2.SelectionSort();
        System.out.println("\nData sudah diurutkan dengan SELECTION SORT (ASC)");
        dataurut2.tampil();
    }    
}

