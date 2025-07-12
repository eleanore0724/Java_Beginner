/*
  定義一個class Disc，其屬性為id,name,price,rep
     1.price為int,rep為List<Integer>
     2.使用Stream計算price總和
     3.使用Stream計算特定price總和
     4.使用Stream計算rep總和
*/

import java.util.*;
import java.util.stream.*;

class Disc{
    private int id;
    private String name;
    private int price;
    private List<Integer> rep;

    public Disc(int id, String name, int price, List<Integer> rep){
        this.id = id;
        this.name = name;
        this.price = price;
        this.rep =rep;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public List<Integer> getRep(){
        return rep;
    }
}

