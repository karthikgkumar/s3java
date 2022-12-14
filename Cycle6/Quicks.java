
import java.util.Scanner;

class Quicksort {
    String A[];
    public static void quickSort(String B[], int lb, int ub) {
        if (lb < ub) {
            int q = partition(B, lb, ub);
            quickSort(B, lb, q - 1);
            quickSort(B, q + 1, ub);
        }
    }

    public static int partition(String A[], int lb, int ub) {
        String x = A[lb];
        int start = lb;
        int end=ub;
        while(start<end){
            while(A[start].compareTo(x)<=0){
                start++;

            }
            while(A[end].compareTo(x)>0){
                end--;
            }
            swap(String A[],start,end);
        }
        int i = p - 1;
        for (int j = p; j <= r - 1; j++) {
            if (A[j].compareTo(x) <= 0) {
                i = i + 1;
                String temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        String temp = A[i + 1];
        A[i + 1] = A[r];
        A[r] = temp;
        return i + 1;
    }
    public void swap(A[],int i, int j) {
        String temp = this.A[i];
        this.A[i] = this.A[j];
        this.A[j] = temp;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n = sc.nextInt();
        sc.nextLine();
        String A[] = new String[n];
        System.out.println("Enter the names");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextLine();
        }
        quickSort(A, 0, n - 1);
        System.out.println("After Quick Sort");
        for (int i = 0; i < n; i++)
            System.out.println(A[i]);

    }

}
