package poly.ex6;

public class SoundFliMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        soundAnimal(dog);
        soundAnimal(bird);
        soundAnimal(chicken);

        // fiyAnimal(dog); // 개는 fly 인터페이스를 구현 안했기 때문에 사용 불가능
        fiyAnimal(bird);
        fiyAnimal(chicken);
    }

    // AbstractAnimal 사용 기능
    private static void soundAnimal (AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    // Fly 인터페이스가 있으면 사용 가능
    private static void fiyAnimal(Fly fly) {
        System.out.println("날기 테스트 시작");
        fly.fly();
        System.out.println("날기 테스트 종료");
    }
}
