/*Write a Java program that implements a multi-threaded program which has three
threads. First thread generates a random integer every 1 second. If the value is even,
second thread computes the square of the number and prints. If the value is odd 
the third thread will print the value of cube of the number */
import java.util.Random;
class RandonThread extends Thread{
    public void run(){
    Random r = new Random();
    for(int i=0;i<20;i++){
        int n = r.nextInt(100); 
            if(n % 2 == 0){
                new Even(n).start();
            }
            else{
                new Odd(n).start();

            }
        }
    }
}
class Even extends Thread{
    private int num;
    public Even(int num){
    this.num = num;
    }
    public void run(){
        System.out.println("Square of "+num+" ="+num*num);
    }
}
class Odd extends Thread{
    private int num;
    public Odd(int num){
    this.num = num;
    }
    public void run(){
        System.out.println("Cube of "+num +" ="+ num*num*num);
    }
}
public class Threads {
    public static void main(String args[]){
    RandonThread r = new RandonThread();
    r.start();
    }
}
