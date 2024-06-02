import java.util.Scanner;
//LinkedList implementation
class Node {
    int info;
    Node next;

    Node(int info){
        this.info=info;
        next=null;
    }
}
public class assignment_6{
    //push
    public static Node push(Node top){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an element to push: ");
        int x=sc.nextInt();
        Node newNode=new Node(x);
        top=newNode;
        return top;
    }

    //pop
    public static Node pop(Node top){
        if (top == null) {
            System.out.println("Stack is empty. Cannot pop.");
            return top;
        }
        System.out.println("Popped element: " + top.info);
        top = top.next;
        return top;
    }

    //display
    public static void display(Node top){
        if (top == null) {
            System.out.println("Stack is empty.");
            return;
        }
        Node current = top;
        System.out.println("Stack elements are:");
        while (current != null) {
            System.out.print(current.info + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node top = null;

        while (true) {
            System.out.println("****MENU****");
            System.out.println("0: Exit");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Display");
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();

            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    top = push(top);
                    break;
                case 2:
                    top = pop(top);
                    break;
                case 3:
                    display(top);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}
