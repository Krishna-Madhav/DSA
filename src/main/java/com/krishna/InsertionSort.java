package com.krishna;

/**
 * In Insertion sort we try to place the elements at its relevant position.
 * In insertion sort we start by choosing a pivot or key at first index and use a pointer (j) to check if the element before key is
 * bigger than the key. If its bigger then the element are swapped to find a suitable position for the key.
 */
public class InsertionSort {

    public static void main(String[] args) {

        int arr[] = {5, 6, 2, 3, 1};

        System.out.print("Before sorting :");
        for (int num : arr) {
            System.out.print(" " + num + " ");
        }

        for (int i = 0; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {

                arr[j + 1] = arr[j];
                j--;

            }

            arr[j + 1] = key;

            System.out.println();
            System.out.print("Iteration " + (i+1) + ":");
            for (int num : arr) {
                System.out.print(" " + num + " ");
            }
        }

        System.out.println();
        System.out.print("After sorting :");
        for (int num : arr) {
            System.out.print(" " + num + " ");
        }
    }
}
