package poly.basic;

// 다운 캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        // 부모의 크기로 자식을 담은 모양은 자식에 바로 못 들어 간다.
        child1.childMethod(); // 문제 없이 실행 됨

        Parent parent2 = new Parent();
        // Child child2 = (Child) parent2;
        // 부모 자체를 자식에 담게 되면  런타임 오류 생성
        // child2.childMethod(); // 실행 불가
    }
}
