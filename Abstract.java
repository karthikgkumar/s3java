
    
abstract class Shape{
    public abstract void numberOfSides();
    }
    class Rectangle extends Shape{
    public void numberOfSides(){
    System.out.println("Number of Sides = 4");
    } }
    class Triangle extends Shape{
    public void numberOfSides(){
    System.out.println("Number of Sides = 3");
    } }
    class Hexagon extends Shape{
    public void numberOfSides(){
    System.out.println("Number of Sides = 6");
    } }
    class Test2{
    public static void main(String args[]){
    Rectangle r = new Rectangle(); 
    Triangle t = new Triangle();
     Hexagon h = new Hexagon(); 
     r.numberOfSides(); 
     t.numberOfSides(); 
     h.numberOfSides();
    } }
    
