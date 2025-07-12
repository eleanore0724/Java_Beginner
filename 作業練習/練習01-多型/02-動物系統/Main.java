//動物系統，Animal內有子類別貓，貓內有子類別老虎，屬性有花色和腳、行為吃、睡。
public class Main{
    public static void main(String[] args){
        Cat cat = new Cat("白",4);
        cat.makeEat();
        cat.makeSleep();

        System.out.println();

        Tiger tiger = new Tiger("黃",4);
        tiger.makeEat();
        tiger.makeSleep();
    }
}

    abstract class Animal{
        public int foot;
        public String color;
        public Animal(String color, int foot){
        this.color = color;
        this.foot = foot;
        }
        public abstract void makeEat();
        public abstract void makeSleep();
    }
    
    class Cat extends Animal{
        public Cat(String color,int foot){
            super(color, foot);
        }
        public void makeEat(){
            System.out.println(color+"貓正在吃魚。");
        }
        public void makeSleep(){
            System.out.println(color+"貓正在睡覺。");
        }
    }

    class Tiger extends Cat{
        public Tiger(String color,int foot){
            super(color, foot);
        }
        public void makeEat(){
            System.out.println(color+"老虎正在吃肉。");
        }
        public void makeSleep(){
            System.out.println(color+"老虎正在睡覺。");
        }
    }