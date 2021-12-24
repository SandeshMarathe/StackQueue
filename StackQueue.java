import java.util.Scanner;
class UserInputs {
    private static Scanner scanner = new Scanner(System.in);
    public static int intVal(){return scanner.nextInt();};
}

public class StackQueue {

    public static void main(String[] args) {
        StackQueueOperation stackQueueOperation = new StackQueueOperation();
        int choice = 0;
        do {
            System.out.println("1.PUSH\n2.POP\n3.EnQueue\n4.DeQueue\n5.Print\n6.Exit");
            System.out.println("Enter Your Choice :");
            choice = UserInputs.intVal();

            switch (choice) {
                case 1:
                    System.out.println("Enter the Data :");
                    stackQueueOperation.push(UserInputs.intVal());
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    stackQueueOperation.print();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Invalid Choice..!");
                    break;
            }
        } while (choice != 6);
    }
}

class StackQueueOperation {

    int[] myStack = new int[5];
    int top = -1;
    public boolean isFull() {
        if (top == myStack.length-1) {
            return true;
        }
        return false;
    }

    public void push(int ele) {
        if (isFull()) {
            System.out.println("Stack is FULL..");
        }
        else {
            top++;
            myStack[top] = ele;
        }
    }

    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(myStack[i]);
        }
    }
}
