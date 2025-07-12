public enum Operator {
    ADD("+") {
        public double apply(double a, double b) {
            return a + b;
        }
    },
    SUBTRACT("-") {
        public double apply(double a, double b) {
            return a - b;
        }
    },
    MULTIPLY("*") {
        public double apply(double a, double b) {
            return a * b;
        }
    },
    DIVIDE("/") {
        public double apply(double a, double b) {
            if (b == 0) {
                throw new ArithmeticException("除數不能為 0");
            }
            return a / b;
        }
    };

    private final String symbol;

    Operator(String symbol) {
        this.symbol = symbol;
    }

    public abstract double apply(double a, double b);

    public String getSymbol() {
        return symbol;
    }
}