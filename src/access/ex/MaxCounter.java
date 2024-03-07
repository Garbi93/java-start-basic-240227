package access.ex;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int amount) {
        this.max = amount;
    }

    public void increment() {
        if(count < max){
            count++;
        } else {
            System.out.println("최대값 보다 큽니다.");
        }
    }

    public int getCount() {
        return count;
    }


}
