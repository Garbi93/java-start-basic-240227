package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조 (다형적 참조)
        Parent poly = new Child();
        // 단 자식의 기능은 호출할 수 없다.
        // poly.childMethod(); // <- 컴파일 오류가 발생

        // 다움캐스팅 (부모타입 -> 자식타입)
        Child child = (Child) poly; // <- 이렇게 사용하면 강제로 부모티입을 자식타입으로 변환 시킨다.
        child.childMethod();
    }
}
