package com.krishna;

/**
 This algorithm starts by checking element at first index (i) with its next index(i+1) and keeps swapping the element
 if number at index i is greater than number at index i+1.
 After first iteration last element is moved to the last index of the array and second iteration swaps second last element and so on.
 */
public class BubbleSort {

    public static void main(String[] args) {

        int nums[] = {6, 5, 2, 8, 9, 4};
        int arrLength = nums.length;

        int temp = 0;

        System.out.print("Before sorting :");
        for (int num : nums) {
            System.out.print(" " + num + " ");
        }

        for (int i = 0; i < arrLength; i++) {

            for (int j = 0; j < arrLength -i - 1; j++) {

                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }

            System.out.println();
            System.out.print("Iteration " + (i+1) + ":");
            for (int num : nums) {
                System.out.print(" " + num + " ");
            }
        }

        System.out.print("\nAfter sorting :");
        for (int num : nums) {
            System.out.print(" " + num + " ");
        }
    }
}