import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        // 讀取檔案
        try (BufferedReader reader = new BufferedReader(new FileReader("cars.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    cars.add(new Car(parts[0], parts[1], parts[2]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 修改車輛資料
        for (Car car : cars) {
            if (car.getPlateNumber().equals("XYZ789")) {
                car.setColor("Yellow");
            }
        }

        // 寫回檔案
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("cars.txt"))) {
            for (Car car : cars) {
                writer.write(car.toString());
                writer.newLine();
            }
            System.out.println("車輛資料已更新！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
