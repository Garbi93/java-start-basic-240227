package static2.ex;

public class Car {
    private String name;
    private static int countCar;

    public Car(String name) {
        this.name = name;
        System.out.println("차량 구입, 이름: " + this.name);
        countCar++;
    }

    static void showTotalCars (){
        System.out.println("구매한 차량 수: " + countCar);
    }
}
