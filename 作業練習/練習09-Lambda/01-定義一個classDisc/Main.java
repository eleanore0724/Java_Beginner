/*
  定義一個class Disc，其屬性為id,name,price,rep
     1.price為int,rep為List<Integer>
     2.使用Stream計算price總和
     3.使用Stream計算特定price總和
     4.使用Stream計算rep總和
*/

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        // 建立rep資料
        List<Integer> rep1 = new ArrayList<>();
        rep1.add(10);
        rep1.add(20);

        List<Integer> rep2 = new ArrayList<>();
        rep2.add(40);
        rep2.add(40);

        List<Integer> rep3 = new ArrayList<>();
        rep3.add(5);
        rep3.add(10);
        rep3.add(15);

        // 建立discs清單
        List<Disc>  discs = new ArrayList<>();
        discs.add(new Disc(1,"Disc A",100,rep1));
        discs.add(new Disc(2,"Disc B",200,rep2));
        discs.add(new Disc(3,"Disc C",300,rep3));
        
        // 計算所有price的總和
        int totalPrice = discs.stream()
            .mapToInt(d -> d.getPrice())
            .sum();
        System.out.println("所有價格總和:"+totalPrice);

        // 計算特定條件下的 price 總和(目前條件:price>150)
        int filterPrice = discs.stream()
        .filter(d -> d.getPrice() > 150)
        .mapToInt(d -> d.getPrice())
        .sum();
        System.out.println("價格大於150的總和: " + filterPrice);

        // 計算所有rep數值的總和
        int totalRep = discs.stream()
            .flatMap(d -> d.getRep().stream())
            .mapToInt(i -> i.intValue())
            .sum();
        System.out.println("所有rep總和: " + totalRep);
    }
}