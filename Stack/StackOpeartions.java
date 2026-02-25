//stack using array
import java.util.Scanner;

public class StackOpeartions {
    int max=5;
    int[] St = new int[max];
    int top=-1;
    void push(int e){
        ++top;
        St[top]=e;
    }
    int pop(){
        return St[top--];
    }
    void peek(){
        System.out.print(St[top]);
    }
    boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }
    boolean isFull(){
        if(top==max-1){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackOpeartions s = new StackOpeartions();
        boolean c=true;
        int choice;
        while (c){
            System.out.println("choose the below options:");
            System.out.println("1.push");
            System.out.println("2.pop");
            System.out.println("3.peek");
            System.out.println("4.check is Empty");
            System.out.println("5.check is Full");
            System.out.print("Enter your choice");
            choice=scan.nextInt();

            switch (choice){
                case 1:
                    System.out.print("enter the element you want to push:");
                    int e=scan.nextInt();
                    s.push(e);
                    System.out.println("do you want to continue(true/false):");
                    c=scan.nextBoolean();
                    break;
                case 2:
                    System.out.println("Element at top:" +s.pop());
                    break;
                case 3:
                    s.peek();
                    break;
                case 4:
                    System.out.println(s.isEmpty());
                    break;
                case 5:
                    System.out.println(s.isFull());
                    break;
            }
        }

    }
}
