import java.io.*;
import java.util.Scanner;

public class Palindrome{
    public static void main(String args[]){
        int flag=1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string as an input to check whether it is palindrome or not");
        String str= scanner.nextLine();
     
        int start = 0, fin = str.length() - 1;
        
        while(start < fin)
        {
            if(str.charAt(start) != str.charAt(fin))
            {
                flag=0;
                break;
            }
            start++;
            fin--;
        }
        if(flag==1)
        {
            System.out.println(str+" is a palindrome string");
        }
        else
        {
            System.out.println(str+" is not a palindrome string");
        }
    }
    
}