public class ATM {
    private CardReader cardReader;

    public ATM() {
        cardReader = new CardReader(); // 初始化讀卡機
    }

    public void start() {
        System.out.println("ATM 啟動中...");
        cardReader.insertCard("1234-5678-9012-3456");
    }

    // 內部類別：讀卡機
    private class CardReader {
        public void insertCard(String cardNumber) {
            if (validateCard(cardNumber)) {
                System.out.println("卡片讀取成功，卡號：" + cardNumber);
            } else {
                System.out.println("無效的卡片");
            }
        }

        private boolean validateCard(String cardNumber) {
            return cardNumber != null && cardNumber.length() == 19;
        }
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.start();
    }
}