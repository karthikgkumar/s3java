import java.util.Scanner;
import java.util.StringTokenizer;

public class Token {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("enter the limit");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("enter the "+ n +"number");
        String numList = sc.nextLine();
        StringTokenizer st= new StringTokenizer(numList," ");
        int sum = 0;
        while(st.hasMoreTokens()){
            sum=sum+ Integer.parseInt(st.nextToken());
        }
        System.out.println("sum="+sum);
   }
}
