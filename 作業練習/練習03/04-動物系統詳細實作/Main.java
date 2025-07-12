import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("白"); 
        Scanner scanner = new Scanner(System.in);
        System.out.println("餵養貓");
        System.out.println("請輸入指令：a = 餵食，b = 運動消食，c = 睡覺，q = 離開");

        while (true) {
            System.out.print("請輸入指令：");
            String input = scanner.next();
            switch (input) {
                case "a": cat.eat(); break;
                case "b": cat.sport(); break;
                case "c": cat.sleep(); break;
                case "q":
                    System.out.println("已結束操作。");
                    scanner.close();
                    return;
                default:
                    System.out.println("請輸入 a / b / c / q");
            }
        }
    }
}

abstract class Animal {
    protected int hungerValue;
    protected String color;  

    public Animal(String color) {
        this.color = color;
        this.hungerValue = 0;
    }
}

class Cat extends Animal {
    public Cat(String color) {
        super(color);
    }

    public void eat() {
        hungerValue += 20;
        System.out.println(color + "貓吃糧食，目前飢餓值為 " + hungerValue);
    }

    public void sport() {
        if (hungerValue >= 20) hungerValue -= 20;
        else hungerValue = 0;
        System.out.println(color + "貓正在運動，目前飢餓值為 " + hungerValue);
    }

    public void sleep() {
        if (hungerValue >= 10) hungerValue -= 10;
        else hungerValue = 0;
        System.out.println(color + "貓正在睡覺，目前飢餓值為 " + hungerValue);
    }
}