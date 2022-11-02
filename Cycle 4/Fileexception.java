import java.io.FileInputStream;

import java.io.*;
public class Fileexception {
   public static void main(String[] args) {
       try{
           FileInputStream fin = new FileInputStream("hello1.txt");
           FileOutputStream fout = new FileOutputStream("copy.txt");
           int i;
           while((i=fin.read()) != -1){
               System.out.println((char)i);
               fout.write(i);
           }
           fin.close();
           fout.close();
       }
       catch(FileNotFoundException e){
           System.out.println(e.getMessage());
       }
       catch(IOException e){
           System.out.println(e.getMessage());
       }
   } 
}
