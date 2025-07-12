//減速時，速度<0，丟出NegativeLimitSpeedException
//加速時，速度>0，丟出SpeedLimitException



import java.util.Scanner;

class NegativeLimitSpeedException extends exception{
    public NegativeLimitSpeedException(String message){
        super(message)
    }
}



class SpeedLimitExceededException extends exception{
    public SpeedLimitExceededException(String message){
        super(message)
    }
}


class Vehicle{
    private int speed = 0; 
    private intSpeedMax = 100;
    public void accelerate(increment) throws SpeedLimitExceededException{
        if (increment <= 0) throw new IllegalArgumentException("加速值必須大於 0");
        if (speed + increment > MAX_SPEED) {
            throw new SpeedLimitException("超過最高時速限制：" + MAX_SPEED + " km/h");
        }
        speed += increment;
        System.out.println("加速成功，目前時速：" + speed + " km/h");
    }

    }
    public void decelerate()throws NegativeLimitSpeedException{
        if (decrement <= 0) throw new IllegalArgumentException("減速值必須大於 0");
        if (speed - decrement < 0) {
            throw new NegativeSpeedException("速度不能為負數！");
        }
        speed -= decrement;
        System.out.println("減速成功，目前時速：" + speed + " km/h");
    }

    public int getSpeed() {
        return speed;
    }
    }
}

public class Main{ 
    public static void Main(String[] args){
    Vehicle v1 = new Vehicle;
    Scanner input1= new Scanner(System.in);
    
    Try{
        System.out.println("輸入加數值");
        int up = input.nextInt();
        v1.accelerate(up);

        System.out.println("輸入減數值");
        int down = input.nextInt();
        v1.decelerate(down);
        }catch(NegativeLimitSpeedExceptio |SpeedLimitExceededException e){
            System.out.println("錯誤：" + e.getMessage());
        }finally{
            System.out.println("結束");
            input.close;
        }
    } 
}