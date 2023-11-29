public class Test15 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i;
            System.out.println(array[i]);
            System.out.println(array.length - 1);
        }
    }
}
