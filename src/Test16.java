import java.util.Arrays;

public class Test16 {
    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 55;
        array[1] = 88;
        array[2] = 60;
        array[3] = 100;
        array[4] = 90;
        // System.out.println(array[0]);

        int[] arr = { 55, 88, 60, 100, 90 };
        // System.out.println(arr[0]);

        int[] arr2 = new int[] { 55, 88, 60, 100, 90 };
        // System.out.println(arr2[0]);

        int[] arr3;
        arr3 = new int[] { 55, 88, 60, 100, 90 };
        // System.out.println(arr3[0]);

        for (int i = 0; i <= arr.length; i++) {
            // System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr);
    }
}
