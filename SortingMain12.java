public class SortingMain12 {
    
    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};
    
        Sorting12 dataurut1 = new Sorting12(a, a.length);
        
        System.out.println("\nData awal 1");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("\nData sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataurut1.tampil();
    }    
}

