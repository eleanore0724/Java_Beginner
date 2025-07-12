/*
飽度:0-30很餓、31–60為普通餓、60-90為快飽了、90-100為吃飽了
*/

public class Animal{
    private String name;
    private int hunger;
    private final int maxHunger = 100;

    public Animal(String name){
        this.name = name;
        this.hunger = 0;
    }
    public void feed() {
        if(hunger+10 <= maxHunger){
            hunger += 10;
        }else{
            hunger = maxHunger;
        }
    }
    public boolean isFull() {
        return hunger >= maxHunger;
    }
    public String getName() {
        return name;
    }
    public int getHunger() {
        return hunger;
    }
    public int getMaxHunger() {
        return maxHunger;
    }
    public String getStatus() {
        if(hunger <= 30){
             return "很餓";
        }else if(hunger <= 60){
             return "普通餓";
        }else if(hunger <= 90){
             return "快吃飽";
        }else{
              return "吃飽了";
        }
    }
}
