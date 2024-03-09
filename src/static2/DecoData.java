package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() { // <- 정적 메서드

        // instanceValue++; // 인스턴스 변수 접근, compile error
        // instanceMethod(); // 인스턴스 메서드 접근, compile error

        staticValue++; // 정적 변수 접근 가능
        staticMethod(); // 정적 메서드 접근 가능
    }

    public void instanceCall() { // <- 인스턴스 메서드

        instanceValue++; // 인스턴스 변수 접근 가능
        instanceMethod(); // 인스턴스 메서드 접근 가능

        staticValue++; // 정적 변수 접근 가능
        staticMethod(); // 정적 메서드 접근 가능
    }

    private void instanceMethod() { // <- private 인스턴스 메서드
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod() { // private 정적 메서드
        System.out.println("staticValue = " + staticValue);
    }
}
