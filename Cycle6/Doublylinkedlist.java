
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

    public void insert(int data) {
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

    public void appendAtEnd(int data) {
        // Create a new node
        Node newNode = new Node(data);
        // Check if the list is empty
        if (head == null) {
            head = tail = newNode;
            head.left = null;
            tail.right = null;
        }
        // Append newNode as new tail of the list
        else {
            // newNode will be added after tail such that tail's next will point to newNode
            tail.right = newNode;
            // newNode's previous will point to tail
            newNode.left = tail;
            // newNode will become new tail
            tail = newNode;
            // As it is last node, tail's next will point to null
            tail.right = null;
        }
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
        while (!choice.equals("4")) {
            System.out.print("1. Insert at End \n2. Delete From Front \n3. Display \n4.Exit\n");

            System.out.println("Enter the choice:");
            choice = sc.nextLine();
            switch (choice) {
                case "1":
                    System.out.print("Enter the number to insert:");

                    int data = sc.nextInt();
                    sc.nextLine();
                    list.insert(data);

                    System.out.println("Data inserted Successfully");

                    break;
                case "2":
                    list.delete();
                    break;
                case "3":
                    list.display();
                    break;
                case "4":
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
