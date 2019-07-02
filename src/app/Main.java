package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Arkadiusz
 * App is taking all zeros to the and of ArrayList
 */
public class Main {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        List<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            randomNumbers.add(randomGenerator.nextInt(100));
        }
        for (int i = 0; i < 3; i++) {
            int index = randomGenerator.nextInt(10);
            randomNumbers.set(index, 0);
        }
        System.out.println("Before sort " + randomNumbers);

        for (int i = 0; i < randomNumbers.size(); i++) {
            if (randomNumbers.get(i) == 0) {
                for (int j = i; j < randomNumbers.size() - 1; j++) {
                    randomNumbers.set(j, randomNumbers.get(j + 1));
                   // randomNumbers[j]= randomNumbers[j+1];
                }
                randomNumbers.set(randomNumbers.size() - 1, 0);
            }
        }
        System.out.println("After sort " + randomNumbers);
    }
}
