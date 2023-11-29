public class Test24 {

    public void Hello() {
        System.out.println("ㅗㅑㅗㅑㅗㅑㅗㅑㅗㅑㅗㅑ");
    }

    public void plus(int a, int b) {
        System.out.println(a + b);
    }

    public int minus(int c, int d) {
        return c + d;
    }

    public static void main(String[] args) {
        Test24 t = new Test24();
        t.Hello();
        t.plus(1, 3);
        t.minus(6, 3);
    }
}
