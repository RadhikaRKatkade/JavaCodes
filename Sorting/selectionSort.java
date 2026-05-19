// public class selectionSort {
//     public static void main(String[] args) {
//         int[] a = { 38, 52, 9, 18, 6, 62, 13 };
//         System.out.println("Given array: ");
//         for (int i = 0; i < a.length; i++) {
//             System.out.print(a[i] + " ");
//         }
//         int temp = 0;
//         for (int i = 0; i < a.length; i++) {
//             int min = i;
//             for (int j = i + 1; j < a.length; j++) {
//                 if (a[j] < a[min]) {
//                     min = j;
//                 }
//             }
//             temp = a[i];
//             a[i] = a[min];
//             a[min] = temp;
//         }
//         System.out.println("sorted array: ");
//         for (int i = 0; i < a.length; i++) {
//             System.out.print(a[i] + " ");
//         }
//     }
// }

class selectionSort {
    public static void main(String[] args) {
        int[] arr = { 38, 52, 9, 18, 6, 62, 13 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println("sorted array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}