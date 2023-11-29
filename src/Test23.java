public class Test23 {

    public static void sayHello() {
        System.out.println("하이하이");
    }
    // 정적메소드 (static) 는 따로 객체 생성하지 않아도 사용할 수 있따.
    // static으로 안하려면 class 객체를 생성한 후에 사용해야함.

    public static void main(String[] args) {

        sayHello();
    }
}
