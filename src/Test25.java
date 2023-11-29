public class Test25 {

    public static void helloWorld() {
        System.out.println("Hello, World~ ^_^");
    }

    public void hello() {
        System.out.println("스태틱아닌 메소드!!");
    }

    public static void main(String[] args) {
        helloWorld();

        // 클래스명.메서드명();
        // static아닌 메소드는 객체 생성 해서 클래스.메소드() 로 해야한다.
        Test25 t25 = new Test25();
        t25.hello();
    }
}
