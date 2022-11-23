
import java.util.Scanner;

class LinkedList {
    // private Node head;

    class Node {
        private int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    Node head, tail = null;
    public void insertfront(int data){  
        Node newNode = new Node(data);   
        if(head == null) { 
            head = tail = newNode;  
            head.left = null;  
            tail.right = null;
        }
        else {  
            head.left= newNode;  
            newNode.right = head;  
            newNode.left = null;    
            head = newNode; 
        }  
    }

    public void insertend(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
        } else {
            Node ptr = head;
            while (ptr.right != null) {
                ptr = ptr.right;
            }
            ptr.right = temp;
            temp.left = ptr;
        }
    }
// public void insertany (int data, int item)
//   {
//     Node ptr = head;
//     while(ptr.data != data && ptr.right !=null){
//         ptr=ptr.right;
//     }
//     if(ptr.data==data){
//         Node node = new Node (data);
//         node.data = item;
//         Node ptr1 = ptr.right;
//         node.right=ptr1;
//         node.left=ptr;
//         ptr.right=node;
//         ptr1.left=node;
//         System.out.println("Data inserted Successfully");

//     }
//     else{
//         System.out.println("data is not in the list");
//     }

//   }

  public void insertany (int data, int item)
  {
      int pos=1;
    Node ptr = head;
    if(data==1){
        insertfront(item);
    }
    while(ptr.right !=null && (pos)!=data){
        ptr=ptr.right;
        pos++;
    }if(pos==1){

    }
     else{
         Node node = new Node (data);
        node.data = item;
        Node ptr1 = ptr.right;
        node.right=ptr1;
        node.left=ptr;
        ptr.right=node;
        ptr1.left=node;
        System.out.println("Data inserted Successfully");

     }  
    // }
    // else{
    //     System.out.println("data is not in the list");
    // }

  }
   

    public void delete() {
        int x = head.data;
        head = head.right;
        head.left = null;
        System.out.println("Element " + x + " got deleted");
    }

    public void display() {
        if (head == null)
            System.out.println("List is Empty");
        else {
            Node ptr = head;
            while (ptr != null) {
                System.out.print(ptr.data + "\t");
                ptr = ptr.right;
            }
            System.out.println();
        }
    }
}

class Test {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        String choice = "";
        while (!choice.equals("6")) {
            System.out.print("1. Insert at Front \n2.Insert at end\n3.Insert at any position\n4. Delete From Front \n5. Display \n6.Exit\n");

            System.out.println("Enter the choice:");
            choice = sc.nextLine();
            switch (choice) {
                case "1":
                    System.out.print("Enter the number to insert at front:");

                    int data = sc.nextInt();
                    sc.nextLine();
                    list.insertfront(data);

                    System.out.println("Data inserted Successfully");

                    break;
                case "2":
                    System.out.print("Enter the number to insert at end:");
                    data = sc.nextInt();
                    sc.nextLine();
                    list.insertend(data);
                    System.out.println("Data inserted Successfully");
                    break;
                case "3":
                    System.out.print("Enter the position:");
                    data = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter the number to be inserted:");
                    int item = sc.nextInt();
                    sc.nextLine();
                    list.insertany(data, item);
                    
                    break;      

                case "4":
                    list.delete();
                    break;
                case "5":
                    list.display();
                    break;
                case "6":
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
