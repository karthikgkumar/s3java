import java.util.Scanner;

public class Binarysearch {
    static int index = -1;

    public static int binarySearch(int A[], int lb, int ub, int key) {
        if (lb <= ub) {
            int mid = (lb + ub) / 2;
            if (A[mid] == key)
                index = mid;
            else if (A[mid] > key)
                binarySearch(A, lb, mid - 1, key);
            else
                binarySearch(A, mid + 1, ub, key);

        }
        return index;
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

    }

    public static void main(String args[]) {
        System.out.println("Enter array size");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter array");
        for (int i = 0; i < n; i++)
            A[i] = sc.nextInt();
        int[] B =new int[A.length];
        for (int i = 0; i < A.length; i++)
            B[i] = A[i];
        for (int i = 0; i < n; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println("Enter key");
        int key = sc.nextInt();
        bubbleSort(A);
        System.out.println("Array After Sorting");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
        int index = binarySearch(A, 0, n - 1, key);
        int pos = -1;
        for (int i = 0; i < n; i++) {
            if (A[index] == B[i]) {
                pos = i;
                break;
            }
        }
        if (pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index " + pos);

    }
}