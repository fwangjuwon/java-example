// 메서드의 정의와 기본적인 자바의 메서드를 작성해보시오.
// 이 문제는 자바의 메서드 개념과 메서드가 가지는 여러 특징들에 대해서 알고 있는지를 묻는 문제이다.

// [1] : 메서드란 무엇인가?
// (1) 메서드는 다른 언어에서의 함수와 마찬가지로 어떤 특정한 동작이나 처리를 하도록 만들어진 코드 단위이다.
// (2) 반복적인 작업을 처리해야 하는 경우 메서드로 만들어놓으면 이후에 필요할 때 다시 재사용할 수 있어서 아주 유용하다.
// (3) 메서드는 호출시 어떤 결과를 반환하기도 하지만, 결과를 반환하지 않는 메서드도 있다.
// (4) 메서드는 호출시 어떤 인자 값들을 넘겨서 호출하는 경우도 있지만, 인자 값 없이 호출하는 경우도 있다.

// [2] : 메서드 종류 --> 크게 4가지 유형
// (1) 반환값 --> X 		받는 인자값 --> X 
// (2) 반환값 --> X 		받는 인자값 --> O 
// (3) 반환값 --> O 		받는 인자값 --> X 
// (4) 반환값 --> O 		받는 인자값 --> O

import java.util.Scanner;

public class Test26 {

    // Scanner sc = new Scanner(System.in);

    public static void method1() {
        System.out.println("method1!!");
    }

    // (1) 받는인자값 없고, 반환값 없음
    public void method2() {
        System.out.println("method22222");
    }

    // (2) 받는 인자값 있고, 반환값 없음
    public void method3(int parameter1, int parameter2) {
        // 단순 출력
        System.out.println("엥 method3의 파라미터는?? " + parameter1 + parameter2);

        // 연산출력
        int result = parameter1 + parameter2;
        System.out.println("두 수의 합산?? " + result);
    }

    // (3) 받는인자값 없고, 반환값 있음
    public int method4() {
        int num = 22;
        num *= 20;
        return num;
    }

    // (4) 받는 인자값 있고, 반환값 있음
    public String method5(String param) {
        return param + "우에에엥";
    }

    // 반환값이 있고 받는 인자값이 있는 대문자 출력 메서드를 구현해보시오.
    // 메서드는 ( "korea" ) 입력시 대문자로 출력되도록 구현한다.
    public String method6(String sc) {
        String re = sc.toUpperCase();
        return re;
    }

    public static void main(String[] args) {
        method1();
        Test26 t26 = new Test26();
        t26.method2();
        t26.method3(3444444, 4444);
        int parameter1 = 2;
        int parameter2 = 3;
        t26.method3(parameter1, parameter2);
        t26.method4();
        t26.method5("부에에엥");
        String ret = t26.method6("juwon");
        System.out.println(ret);
    }
}
