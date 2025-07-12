public class Main{
    public static void main(String[] args){
       AnimalClassification animal1 = AnimalClassification.Birds;
       AnimalClassification animal2 = AnimalClassification.Aquatic;

       System.out.println("動物1屬於"+animal1.getChineseName());
       System.out.println("動物2屬於"+animal2.getChineseName());
    }
}