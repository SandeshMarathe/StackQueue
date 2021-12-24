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
            System.out.println("1.PUSH\n2.POP\n3.EnQueue\n4.DeQueue\n5.Print-Stack\n6.Print-Queue\n7.Exit");
            System.out.println("Enter Your Choice :");
            choice = UserInputs.intVal();

            switch (choice) {
                case 1:
                    System.out.println("Enter the Data :");
                    stackQueueOperation.push(UserInputs.intVal());
                    break;
                case 2:
                    stackQueueOperation.pop();
                    break;
                case 3:
                    System.out.println("Enter the Element :");
                    stackQueueOperation.enQueue(UserInputs.intVal());
                    break;
                case 4:
                    break;
                case 5:
                    stackQueueOperation.print();
                    break;
                case 6:
                    stackQueueOperation.printQueue();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Invalid Choice..!");
                    break;
            }
        } while (choice != 7);
    }
}

class StackQueueOperation {

    int[] myStack = new int[5];
    int[] myQueue = new int[5];
    int top = -1, rear = -1, front = -1;

    public boolean isFull() {
        if (top == myStack.length-1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (top == -1) {
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

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty..!");
        }
        else {
            System.out.println("POP :"+top);
            top--;
        }
    }

    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(myStack[i]);
        }
    }

    public boolean isQueueFull() {
        if (front == 0 && rear == myQueue.length-1) { //|| front >= rear
            return true;
        }
        return false;
    }

    public void enQueue(int ele) {
        if (isQueueFull()) {
            System.out.println("Stack Queue is Full..!");
        }
        else {
            if (front == -1) {
                front = 0;
                rear = 0;
            }
            else {
                rear++;
            }
            myQueue[rear] = ele;
        }
    }

    public void printQueue() {
        for (int i = front; i <= rear; i++) {
            System.out.println(myQueue[i]);
        }
    }
}
