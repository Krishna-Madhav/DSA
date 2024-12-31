package com.krishna;

public class MergeSort {

    private static void mergeSort(int[] arr, int l, int r) {


        if (l < r) {
            int mid = (l + r) / 2;

            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);

            merge(arr, l, mid, r);
        }

    }

    private static void merge(int[] arr, int l, int mid, int r) {

        int lArrSize = mid - l + 1;
        int rArrSize = r - mid;

        int lArr[] = new int[lArrSize];
        int rArr[] = new int[rArrSize];

        // Copying elements in left array
        for (int i = 0; i < lArrSize; i++) {
            lArr[i] = arr[l + i];
        }

        // Copying elements in right array
        for (int i = 0; i < rArrSize; i++) {
            rArr[i] = arr[mid + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = l;

        while (i < lArrSize && j < rArrSize) {
            if (lArr[i] < rArr[j]) {
                arr[k] = lArr[i];
                i++;
            } else {
                arr[k] = rArr[j];
                j++;
            }
            k++;
        }

        while (i< lArrSize){
            arr[k++] = lArr[i++];
        }

        while (j<rArrSize){
            arr[k++] = rArr[j++];
        }
    }

    public static void main(String[] args) {

        int arr[] = {3, 5, 1, 4, 6, 2,100,12,123,44,1000};

        for (int num : arr) {
            System.out.print(" " + num);
        }

        mergeSort(arr, 0, arr.length - 1);

        System.out.println();
        System.out.println("After sorting: ");
        for (int num : arr) {
            System.out.print(" " + num);
        }
    }


}
