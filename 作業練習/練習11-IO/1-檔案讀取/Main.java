/*
  讀取一篇英文文章的檔案(在sample.txt中)並計算出每個鞍子出現的次數，將計算結果輸出成檔案
*/
import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;


public class Main{
    public static void main(String[] args) {
        try{
            String content = Files.readString(Paths.get("sample.txt"));

            Map<String, Long> wordCount = Arrays.stream(
                        content.toLowerCase().replaceAll("[^a-z ]", "").split("\\s+")
                    )
                    .filter(s -> !s.isBlank())
                    .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

            List<String> lines = wordCount.entrySet().stream()
                    .map(e -> e.getKey() + ": " + e.getValue())
                    .collect(Collectors.toList());

            Files.write(Paths.get("output.txt"), lines);

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}