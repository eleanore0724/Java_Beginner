public class Main{
    public static void main(String[] args){ 
        caluation(1,2,3,4,5);
        caluation(1,2,3,4);
    }
    private static void caluation(int... i){
        System.out.println(max(i));
        System.out.println(mix(i));
        System.out.println(sum(i));
        System.out.println(avg(i));
        System.out.println("============");
    }

    private static int max(int... i){
        var max = i[0];
        for(int j:i){
            if(max<j){
                max = j;
            }
        }    
        return max;
    }

    private static int mix(int... i){
        var mix = i[0];
        for(int j:i){
            if(mix>j){
                mix = j;
            }
        }    
        return mix;
    }

    private static int sum(int... i){
        var sum = 0;
        for(int j:i){
            sum += 1;
        }  
        return sum;
    }

    private static double avg(int... i){
        var sum = 0;
        for(int j:i){
            sum += 1;
        } 
        return sum/i.length;
    }

}