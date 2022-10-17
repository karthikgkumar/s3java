import java.io.*;
import java.util.Scanner;
public class Multiply {
     public static void main(String[] args) 
    {
        int i, j, k;
        int r1,c1, a[][];
        int r2,c2, b[][];
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter r1 and c1");
        int r1= scanner.nextInt();
        int c1= scanner.nextInt();
        System.out.println("enter r1 and c1");
        int r2= scanner.nextInt();
        int c2= scanner.nextInt();
        System.out.println("\nMatrix A:");
        for(i=0;i<r1;i++){
            for(j=0;j<c1;j++){
                int n= scanner.nextInt();
                a[i][j]=n;
            }
        }
        System.out.println("\nMatrix B:");
        for(i=0;i<r2;i++){
            for(j=0;j<c2;j++){
                int n= scanner.nextInt();
                b[i][j]=n;
            }
        }
        
    

        if (r2 != c1) {
 
            System.out.println(
                "\nMultiplication Not Possible");
        }

        int c[][] = new int[r1][c2];
 
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c2; j++) {
                c[i][j]=0;
            }
        }
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c2; j++) {
               c[i][j] += a[i][j] * b[i][j];
            }
        }
 
        System.out.println("\nResultant Matrix:");
         for(i=0;i<r2;i++){
            for(j=0;j<c2;j++){
               System.out.println(a[i][j]);
            }
        }
    }  
}
