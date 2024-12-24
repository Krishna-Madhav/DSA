package com.krishna;

public class LinearAndBinarySearch {

    public static void main(String[] args) {

        int nums[] = {1, 5, 7, 9, 11, 15};
        int target = 9;

        int result2 = linearSearch(nums, target);
        int result = binarySearch(nums, target);

        int result3 = binarySearchRecursive(nums, target, 0, nums.length - 1);

        if (result != -1)
            System.out.println("Result found at index: " + result);
        else
            System.out.println("Result not found!");


        // Using recursive approach
        if (result3 != -1)
            System.out.println("\nResult found at index using Binary search (recursive approach): " + result3);
        else
            System.out.println("Result not found!");
    }


    private static int linearSearch(int[] nums, int target) {

        int steps = 0;
        for (int i = 0; i < nums.length; i++) {
            steps++;
            if (nums[i] == target) {
                System.out.println("Number of steps taken by linear search: " + steps);
                return i;
            }
        }
        System.out.println("Number of steps taken by linear search: " + steps);
        return -1;
    }

    private static int binarySearch(int[] nums, int target) {
        // 1, 5, 7, 9, 11, 15

        int steps = 0;
        int left = 0, right = nums.length - 1;

        while (left <= right) {

            steps++;
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                System.out.println("Number of steps taken by binary search: " + steps);
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        System.out.println("Number of steps taken by binary search: " + steps);
        return -1;
    }

    private static int binarySearchRecursive(int[] nums, int target, int left, int right) {

        while (left <= right) {

            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                return binarySearchRecursive(nums, target, mid + 1, right);
            } else if (nums[mid] > target) {
                return binarySearchRecursive(nums, target, left, mid - 1);
            }
        }
        return target;
    }
}
