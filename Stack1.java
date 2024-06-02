import java.util.Scanner;

//Array implementation;
public class assignment_6 {
    public static final int MAX=10;
    //push
    public static int push(int s[], int top){
        if (isFull(top)){
            System.out.println("Stack overflow!");
            return top;
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter element to push");
        int data= sc.nextInt();
        top++;
        s[top]=data;
        return top;
    }

    //pop
    public static int pop(int s[], int top){
        if (isEmpty(top)){
            System.out.println("Cannot pop. Stack is empty");
            return top;
        }
        int x= s[top];
        top--;
        return top;
    }

    //display
    public static void display(int s[], int top){
        if (isEmpty(top)){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Elements of stack are: ");
        for (int i=0; i<=top; i++){
            System.out.println(s[i]);
        }
    }

    //isEmpty
    public static boolean isEmpty(int top){
        return top==-1;
    }

    //isFull
    public static boolean isFull(int top){
        return top== MAX-1;
    }

    //main
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int stack[]=new int[MAX];
        int top=-1;
        while (true){
            System.out.println("Menu");
            System.out.println("0: Exit");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Display");
            System.out.println("Enter your choice");
            int choice= sc.nextInt();
            switch (choice){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    top=push(stack,top);
                    break;
                case 2:
                    top=pop(stack,top);
                    break;
                case 3:
                    display(stack,top);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
