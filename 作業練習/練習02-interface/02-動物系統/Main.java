public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("白", 4);
        cat.makeEat();
        cat.makeSleep();

        System.out.println();

        Tiger tiger = new Tiger("黃", 4);
        tiger.makeEat();
        tiger.makeSleep();
    }
}

interface AnimalBehavior {
    void makeEat();
    void makeSleep();
}


class Cat implements AnimalBehavior {
    protected String color;
    protected int foot;

    public Cat(String color, int foot) {
        this.color = color;
        this.foot = foot;
    }

    public void makeEat() {
        System.out.println(color + "貓正在吃魚。");
    }

    public void makeSleep() {
        System.out.println(color + "貓正在睡覺。");
    }
}


class Tiger extends Cat {
    public Tiger(String color, int foot) {
        super(color, foot);
    }

    @Override
    public void makeEat() {
        System.out.println(color + "老虎正在吃肉。");
    }

    @Override
    public void makeSleep() {
        System.out.println(color + "老虎正在睡覺。");
    }
}