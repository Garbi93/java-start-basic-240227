package static1;

public class Data3 {
    public String name;
    public static int count; // static
    public static int price;

    public Data3(String name) {
        this.name = name;
        count++;
    }
}
