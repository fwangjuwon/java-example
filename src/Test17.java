public class Test17 {
    public static void main(String[] args) {
        int[] a, b, c;
        a = new int[3];
        b = new int[5];

        int d[], e, f;
        d = new int[2];
        e = 3;
        f = 6;

        int g[], h[], i[];
        g = new int[8];
        h = new int[] { 1, 2, 3, 4, 5 };
        i = new int[5];

        // 배열 복사!!
        int j[] = h.clone();
        System.out.println(j[3]);
        j[3] = 2;
        System.out.println(j[3]);

    }
}
