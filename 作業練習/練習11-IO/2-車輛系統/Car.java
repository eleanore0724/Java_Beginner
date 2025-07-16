public class Car{
    private String plateNumber;
    private String brand;
    private String color;

    public Car(String plateNumber, String brand, String color){
        this.plateNumber = plateNumber;
        this.brand = brand;
        this.color = color;
    }

    public String getPlateNumber(){
        return plateNumber;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        return plateNumber + "," + brand + "," + color;
    }
}