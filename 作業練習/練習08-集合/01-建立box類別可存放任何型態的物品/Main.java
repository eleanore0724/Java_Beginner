public class Main {
    public static void main(String[] args) {
        Box<String> stringBox= new Box<>();
        stringBox.setItem("Hello");
        System.out.println("字串內容是: " + stringBox.getItem());

        Box<Integer> intBox= new Box<>();
        intBox.setItem(123);
        System.out.println("整數內容是: " + intBox.getItem());

        Box<Double> doubleBox = new Box<>();
        doubleBox.setItem(3.14);
        System.out.println("小數內容是: " + doubleBox.getItem());
    }
}