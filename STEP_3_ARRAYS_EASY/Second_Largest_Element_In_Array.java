package STEP_3_ARRAYS_EASY;

import java.util.Scanner;

public class Second_Largest_Element_In_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");    
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Read array elements from user
        }
        int secondLargest = findSecondLargest(arr); // Find second largest element
        if (secondLargest == Integer.MIN_VALUE) {   
            // If no second largest exists (all elements are same or array too small)
            System.out.println("There is no second largest element in the array.");
        } else {
            System.out.println("The second largest element in the array is: " + secondLargest);
        }
        sc.close();
    }

    // Time Complexity: O(n), where n is the number of elements in the array
    // Space Complexity: O(1), uses constant space

    private static int findSecondLargest(int[] arr) {
        int firstMax = Integer.MIN_VALUE;  // Stores the largest value found so far
        int secondMax = Integer.MIN_VALUE; // Stores the second largest value found so far

        for (int i = 0; i < arr.length; i++) {
            // If current element is greater than firstMax, update both firstMax and secondMax
            if (arr[i] > firstMax) {
                secondMax = firstMax;
                firstMax = arr[i];
            }
            // If current element is between firstMax and secondMax, and not equal to firstMax
            else if (arr[i] > secondMax && arr[i] != firstMax) {
                secondMax = arr[i];
            }
        }
        // If secondMax is still Integer.MIN_VALUE, there was no valid second largest
        return secondMax;
    }
}