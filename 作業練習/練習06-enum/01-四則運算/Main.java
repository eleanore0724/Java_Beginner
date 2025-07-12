public class Main {
    public static void main(String[] args) {
    double a = 10;
    double b = 2;

    for (Operator op : Operator.values()) {
            System.out.println(a + " " + op.getSymbol() + " " + b + " = " + op.apply(a, b));
        }
    }
}