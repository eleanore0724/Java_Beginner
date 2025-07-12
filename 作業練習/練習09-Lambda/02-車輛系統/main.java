/*
  新增價格欄位，並依據各品牌計算平均價格
*/


import java.util.*;
import java.util.stream.*;

public class Main{
    public static void main(String[] args) {
        List<Car> cars = List.of(
            new Car("Toyota",800000),
            new Car("Toyota",750000),
            new Car("Honda",850000),
            new Car("Honda",1200000),
            new Car("Ford",1200000),
            new Car("Ford",2000000)
        );

        // 品牌分組並計算平均價格
        Map<String, Double> avgPriceByBrand =cars.stream()
            .collect(Collectors.groupingBy(
                car -> car.getBrand(),
                Collectors.averagingInt(car -> car.getPrice())
             ));

        avgPriceByBrand.forEach((brand, avgPrice)->
            System.out.println(brand + " 的平均價格是 " + avgPrice + " 元"));
    }
}