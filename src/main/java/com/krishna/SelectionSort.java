package com.krishna;

/**
 * In selection sort in every iteration we find the min/max element in the array and swap it with the first/last element of the array. Unlike bubble sort
 * where swapping is performed at every step, here it is done after one complete iteration in outer loop.
 *
 */
public class SelectionSort {

    public static void main(String[] args) {

        int nums[] = {6, 5, 2, 8, 9, 4};
        int arrLength = nums.length;
        int minIndex = -1;
        int temp = 0;

        System.out.print("Before sorting :");
        for (int num : nums) {
            System.out.print(" " + num + " ");
        }


        for (int i = 0; i < arrLength-1; i++) {

            minIndex = i;

            for (int j = i + 1; j < arrLength ; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }

            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;

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
    