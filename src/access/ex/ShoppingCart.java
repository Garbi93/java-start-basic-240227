package access.ex;

public class ShoppingCart {
    private int count;
    private Item[] items = new Item[10];
    public void addItem(Item item) {
        if (count < 10) {
            items[count] = item;
            count++;
        } else {
            System.out.println("장바구니가 가득 찼습니다.");
        }
    }

    public void displayItems() {
        int sum = 0;
        System.out.println("장바구니 상품 출력");
        for (Item item : items) {
            if (item != null) {
                System.out.println("상품명: " + item.getProductName() + ", 합계: " + item.getCount() * item.getPrice());
                sum += (item.getCount() * item.getPrice());
            }
        }
        System.out.println("전체 가격 합: " + sum);
    }
}
