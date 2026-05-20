import java.util.Scanner;
import java.util.Arrays;

public class StackArray {
    static int top = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        push(arr, 10);
        push(arr, 40);
        push(arr, 50);
        System.out.println(Arrays.toString(arr));
        print(arr);
        int popedVaue = pop(arr);
        System.out.println("After the pop method ");
        print(arr);
        System.out.println("The value pop in the array: " +popedVaue );
    }

    public static void push(int arr[], int data) {
        if (top == arr.length) {
            System.out.println("Stack is overflow u Can't insert the value in the stack");
            return;
        } else {
            arr[top] = data;
            top++;
        }

    }

    public static int pop(int arr[]) {

        if (top <= 0) {
            System.out.println("Stack is underflow, First fill the stack");
            return -1;
        } else {

            int temp = arr[top - 1];
            top--;
            return temp;
        }
    }

    public static void print(int arr[]) {
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
