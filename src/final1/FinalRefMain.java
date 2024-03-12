package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data(); // 참조형
        //data = new Data();
        // 참조형 을 이미 final 을 설정 했기 때문에 새로운 객체를 참조할 수없다.

        // 그러나, 참조 대상의 값은 final 이 아니기때문에 변경 가능하다.
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}
