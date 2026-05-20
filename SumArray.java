import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;

public class SumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];

        sumarray(arr);
        // minElementArray(arr);
        // secondMax(arr);
        // average(arr);
        // oddMaxIndex(arr);
        // halfArray(arr);
        // MinMaxHalfArray(arr);
        // averagehalf(arr);
        // reverseArray(arr);
        // EvenOddReverse(arr);
        // SpecificElement(arr);
        // OddToEven(arr);
        // RightShift(arr);
        // LeftShift(arr);
        halfRotateArray(arr);

    }

    public static void sumarray(int arr[]) {
        int sum = 0;
        int oddsum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element u have stored in array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            // sum = sum + arr[i];
        }
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] == 6) {
        //         System.out.println("First index present in : " + i);

        //     }
        // }

        System.out.println(sum);
        // System.out.println(oddsum);
    }

    public static void minElementArray(int arr[]) {
        int minValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (minValue < arr[i]) {
                minValue = arr[i];
            }

        }
        System.out.println(minValue);
    }

    public static void secondMax(int arr[]) {
        int MaxValue = arr[0];
        int secondMaxValue = 0;
        for (int i = 0; i < arr.length; i++) {
            if (MaxValue < arr[i]) {
                MaxValue = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (secondMaxValue < arr[i] && arr[i] != MaxValue) {
                secondMaxValue = arr[i];
            }
        }
        System.out.println("---------------------------------");
        System.out.println("The Second max value in the given array  : " + secondMaxValue);
    }

    public static void average(int arr[]) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double average = sum / arr.length;

        System.out.println(sum);
        System.out.println(average);
    }

    public static void oddMaxIndex(int arr[]) {
        int oddIndex = arr[1];
        int evenIndex = arr[0];

        for (int i = 0; i < arr.length; i = i + 1) {
            if (i % 2 == 1) {

                if (oddIndex > arr[i]) {
                    oddIndex = arr[i];
                }
            } else {
                if (evenIndex > arr[i]) {

                    evenIndex = arr[i];
                }
            }
        }
        double oddAverage = (double) oddIndex / arr.length;
        double evenAverage = (double) evenIndex / arr.length;
        System.out.println("----------------");
        System.out.println(oddIndex);
        System.out.println(evenIndex);
        System.out.println(oddAverage);
        System.out.println(evenAverage);

    }

    public static void halfArray(int arr[]) {
        int firstsum = 0;
        int secondsum = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            firstsum += arr[i];
        }
        System.out.println("----------------------");
        System.out.println("First Sum is : " + firstsum);
        for (int i = arr.length / 2; i < arr.length; i++) {
            secondsum += arr[i];
        }
        System.out.println("SecondHalf sum is : " + secondsum);
    }

    public static void MinMaxHalfArray(int arr[]) {
        int minValue = arr[0];
        int MaxValue = arr.length / 2;
        for (int i = 0; i < MaxValue; i++) {
            if (minValue > arr[i]) {
                minValue = arr[i];
            }
        }
        for (int i = MaxValue; i < arr.length; i++) {

            if (MaxValue > arr[i]) {
                MaxValue = arr[i];
            }
        }

        System.out.println(minValue);
        System.out.println(MaxValue);

    }

    public static void averagehalf(int arr[]) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            sum += arr[i];
            count++;
        }
        double averageFirsthalf = sum / count;
        System.out.println(averageFirsthalf + "  " + arr.length / 2);
        sum = 0;
        count = 0;
        for (int i = arr.length / 2; i < arr.length; i++) {
            sum += arr[i];
            count++;
        }
        double averageSecondhalf = sum / count;
        System.out.println(averageSecondhalf + "  " + count);

    }

    public static void reverseArray(int arr[]) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
        System.out.println("First Half of the reverse Array");
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
        System.out.println("Second Half of the reverse Array");
        for (int i = arr.length - 1; i >= arr.length / 2; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void EvenOddReverse(int arr[]) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                System.out.println(arr[i]);
            }
            if (i % 2 == 1) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void SpecificElement(int arr[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Element your Want know the index");
        int find = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (find == arr[i]) {
                System.out.println("Your Element presented Index is: " + i);
                break;
            }
        }
        System.out.println();
    }

    public static void OddToEven(int arr[]) {
        int temp = 0;
        for (int i = 1; i < arr.length; i++) {
            if (i % 2 == 1) {
                temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void RightShift(int arr[]) {
        int temp = 0;
        System.out.println("How many times you want to shift");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        temp = arr[arr.length - 1];
        for (int j = 0; j < size; j++) {
            temp = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = temp;

        }
        System.out.println(Arrays.toString(arr));

    }

    public static void LeftShift(int arr[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many times u want to lift shift");
        int size = sc.nextInt();
        int temp;
        for (int i = 0; i < size; i++) {
            temp = arr[arr.length - 1];
            for (int j = arr.length - 2; j >= 0; j--) {
                arr[j + 1] = arr[j];

            }
            arr[0] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void halfRotateArray(int[] arr) {
        int temp = arr[0];;
           for(int i=0;i<arr.length/2;i++){
               arr[i] = arr[i+1];
           }
           arr[arr.length/2] = temp;
           System.out.println(Arrays.toString(arr));
    }
}
