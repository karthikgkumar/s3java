  import java.util.Scanner;

public class Employee { 
    private String name; 
    private int age;
    private String phone; 
    private String address; 
    private double salary; 
    public void printSalary(){
    System.out.println("Salary="+ salary);
    }
    public Employee(String name,int age,String phone,String address,double salary){ 
        this.name = name;
        this.age = age; 
        this.phone = phone; 
        this.address = address; 
        this.salary = salary;
    }
    public void displayEmployee(){
    System.out.println("Name = "+name); 
    System.out.println("Age = "+age); 
    System.out.println("Phone Number = "+phone); 
    System.out.println("Address = "+address); 
    System.out.println("Salary = "+salary);
    } 

}
    class Manager extends Employee{ 
        private String specialization;
        private String department;
        public Manager(String name,int age,String phone,String address,double salary,String specialization,String department)
        { super(name,age,phone,address,salary);
        this.specialization = specialization; 
        this.department = department;
        }
    public void displayManager(){ 
        displayEmployee();
        System.out.println("Specilization ="+specialization); 
        System.out.println("Department ="+department);
    }
}
    class Officer extends Employee{
    private String specialization;
    private String department;
    public Officer(String name,int age,String phone,String address,double salary,
    String specialization,String department){ 
        super(name,age,phone,address,salary);
        this.specialization = specialization; 
        this.department = department;
    }
    public void displayOfficer(){
    displayEmployee(); 
    System.out.println("Specilization ="+specialization); 
    System.out.println("Department ="+department);
    } 
}
    
    class Test{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter Manager Details"); 
    System.out.print("Name:");
    String name = sc.nextLine(); 
    System.out.print("Age:");
    int age = sc.nextInt();
    sc.nextLine(); 
    System.out.print("Phone Number:"); 
    String phone = sc.nextLine(); 
    System.out.print("Address:");
    String addr = sc.nextLine(); 
    System.out.print("Salary:");
    double salary = sc.nextDouble();
    sc.nextLine(); 
    System.out.print("Specialization:");
    String spec = sc.nextLine(); 
    System.out.print("Department:");
    String dept = sc.nextLine();

    Manager m = new Manager(name,age,phone,addr,salary,spec,dept);
     m.displayManager();
    System.out.println("Enter Officer Details"); 
    System.out.print("Name:");
    String name1 = sc.nextLine(); 
    System.out.print("Age:");
    int age1 = sc.nextInt();sc.nextLine(); 
    System.out.print("Phone Number:"); 
    String phone1 = sc.nextLine(); 
    System.out.print("Address:");
    String addr1 = sc.nextLine(); 
    System.out.print("Salary:");
    double salary1 = sc.nextDouble();
    sc.nextLine(); 
    System.out.print("Specialization:");
    String spec1 = sc.nextLine(); 
    System.out.print("Department:");
    String dept1 = sc.nextLine();
    Officer o = new Officer(name1,age1,phone1,addr1,salary1,spec1,dept1); o.displayOfficer();
    
    } }
