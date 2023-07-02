package June06;

import java.util.Arrays;

public class ArrayManipulations {
    public void largestSmallestElement(int[] inputArr) {
        int[] arr = inputArr;

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("The maximum element is " + max);
        System.out.println("The minimum element is " + min);
    }

    public void reverseArray(int[] inputArr) {
        int[] array = inputArr;
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void leftRotateArray(int[] inputArr, int x) {

        int[] arr = inputArr;
        int[] copy = Arrays.copyOf(arr, arr.length);

        // Rotate the original array by x positions
        for (int i = 0; i < x; i++) {
            arr[i] = copy[arr.length - x + i];
        }

        // Copy the remaining elements of the copy to the original array
        for (int i = x; i < arr.length; i++) {
            arr[i] = copy[i - x];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

        public static void main(String[] args){
            int[] array = {2, 7, 13, 17, 161};
            ArrayManipulations a = new ArrayManipulations();
            a.largestSmallestElement(array);
            a.reverseArray(array);
            a.leftRotateArray(array, 3);
        }
    }
