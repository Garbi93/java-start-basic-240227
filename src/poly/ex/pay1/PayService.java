package poly.ex.pay1;

import poly.ex.pay0.PayStore;

public class PayService {
    // 변하지 않고 이용
    public void processPay(String option, int amount) {

        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);
        Pay pay = PayStore.findPay(option);
        boolean result = pay.pay(amount);

        if (result) {
            System.out.println("결제가 성공했슴니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }


}
