package taskfivefive;

import java.util.Scanner;

public class FruitBowl {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hur många vindruvor finns det på klasen?");
        int i = scanner.nextInt();

        Grape grape = new Grape(i);
        grape.eatGrapes(10);

        System.out.println(grape.numberOfGrapes);
    }
}
