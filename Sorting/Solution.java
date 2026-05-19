// import java.util.Arrays;
// import java.util.Scanner;

// class Solution {
//     public int[] shuffle(int[] nums, int n) {
//         int mid = nums.length / 2;

//         int[] first = new int[mid];
//         int[] second = new int[nums.length - mid];

//         for (int i = 0; i < mid; i++) {
//             first[i] = nums[i];
//         }

//         for (int i = mid; i < nums.length; i++) {
//             second[i - mid] = nums[i];
//         }

//         System.out.println(Arrays.toString(first));
//         System.out.println(Arrays.toString(second));
//         System.out.println();
//         int[] c = new int[nums.length];
//         for (int i = 0; i < mid; i++) {
//             c[2 * i] = first[i];
//             c[2 * i + 1] = second[i];
//         }
//         return c;

//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int m = sc.nextInt();
//         int n = 2 * m;
//         int[] nums = new int[n];
//         for (int i = 0; i < n; i++) {
//             nums[i] = sc.nextInt();
//         }
//         // .out.println("array: ");
//         for (int i = 0; i < n; i++) {
//             System.out.print(nums[i] + " ");
//         }

//         Solution s = new Solution();
//         int[] result = s.shuffle(nums, n);
//         System.out.println(Arrays.toString(result));
//     }
// }

import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter " + n + " elements in array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("elements in array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] < arr[j]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println("sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}