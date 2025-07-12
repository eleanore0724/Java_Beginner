/*
  找出名字長度大於10的動物
*/

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = List.of(
            new Animal("Elephant"),
            new Animal("Caterpillar"),
            new Animal("BlueWhale"),
            new Animal("Hippopotamus"),
            new Animal("Dog"),
            new Animal("Cat")
        );

        List<Animal> longNamedAnimals = animals.stream()
            .filter(animal -> animal.getName().length() > 10)
            .collect(Collectors.toList());

        System.out.println("名字長度大於10的動物有：");
        longNamedAnimals.forEach(animal ->
            System.out.println(animal.getName()));
    }
}