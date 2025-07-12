//車輛系統，車有子類別汽車、機車、卡車，屬性為品牌、型號，行為有加速、減速、鳴笛

public class Main{
    public static void main(String[] args){
        Car car1 = new Car("Tesla","Modle Y");
        car1.accelerate();
        car1.decelerate();
        car1.honk();

        Motorcycle moto1 = new Motorcycle("Kymco","GP 125");
        moto1.accelerate();
        moto1.decelerate();
        moto1.honk();

        Truck truck1 = new Truck("Scania","CF110");
        truck1.accelerate();
        truck1.decelerate();
        truck1.honk();
    }
}


abstract class Vehicle{
    public String Brand;
    public String Model;
    public abstract void accelerate();
    public abstract void decelerate();
    public abstract void honk();
}


class Car extends Vehicle{
    public Car(String a,String b){
        Brand=a;
        Model=b;
        System.out.println("-----------------------");
        System.out.println("Model="+Model+"\t Brand="+Brand);
    }
    public void accelerate(){
        System.out.println("踩油門 加速");
    }
    public  void decelerate(){
        System.out.println("踩煞車 減速");
    }
    public void honk(){
        System.out.println("輕壓喇叭");
    }
}

class Motorcycle extends Vehicle{
    public Motorcycle(String a,String b){
        Brand=a;
        Model=b;
        System.out.println("-----------------------");
        System.out.println("Model="+Model+"\t Brand="+Brand);
    }
    public void accelerate(){
        System.out.println("轉右手把 加速");
    }
    public void decelerate(){
        System.out.println("往後壓手煞車 減速");
    }
    public void honk(){
        System.out.println("大拇哥按喇叭鈕");
    }
}

class Truck extends Vehicle{
    public Truck(String a,String b){
        Brand=a;
        Model=b;
        System.out.println("-----------------------");
        System.out.println("Model="+Model+"\t Brand=s"+Brand);
    }
    public void accelerate(){
        System.out.println("踩油門+控制手把 加速");
    }
    public void decelerate(){
        System.out.println("踩煞車+拉煞車手把 減速");
    }
    public void honk(){
        System.out.println("按喇叭鈕");
    }
}