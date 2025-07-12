public class Main{
    public static void main(String[]args){
        System.out.println("1到100 可被3整除的整數:");

        for(int i=1; i<=100; i++){
            if (i%3 == 0){
                System.out.print(i+ ",");
            }
        }
    }
}