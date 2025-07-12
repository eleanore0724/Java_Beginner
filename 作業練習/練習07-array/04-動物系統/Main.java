public class Main{
    public static void main(String[] args){
        Animal[] animals = new Animal[10];
        
        for(int i=0;i<animals.length;i++){
            animals[i] = new Animal("動物"+(i+1));
        }
        System.out.println("開始餵食動物...");
        
        for(Animal animal:animals){
             int feedCount = 0;
             System.out.println("開始餵食"+animal.getName());
             while(!animal.isFull()){
                 animal.feed();
                 feedCount++;
                 System.out.println("餵第"+feedCount+"次 → 飽足度："+animal.getHunger()+"，狀態："+ animal.getStatus());    
             }
             System.out.println(animal.getName()+"吃飽了！總共餵了"+feedCount+" 次\n");
        }
    }
}