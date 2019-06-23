package array;

/*
*  https://leetcode.com/problems/rotate-array/
*  Given an array, rotate the array to the right by k steps, where k is non-negative.
*
* */
public class Rotate_Array_189 {


    private static void rotate(int[] arr, int k) {
        int[] result = new int[arr.length];

        k %= arr.length;

        for (int i = 0; i < k; i++) {
            result[i] = arr[arr.length - k + i];
        }

        int j=0;
        for (int i = k; i < arr.length; i++) {
            result[i] = arr[j];
            j++;
        }

        System.arraycopy(result, 0, arr, 0, arr.length);
    }

    //Test
    public static void main(String[] args) {
        int[] a1 = new int[]{1 ,2 ,3 ,4 ,5};
        int[] a2 = new int[]{6, 7, 8, 9, 10};

        rotate(a1, 6);

        for (int i : a1) {
            System.out.print(i + " ");
        }

     }

}
