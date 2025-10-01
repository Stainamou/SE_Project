package week5;

import java.util.Random;

public class DiceRoll {
    Random random = new Random();
    private int die1;
    private int die2;

    public void roll() {
        die1 = random.nextInt(6) + 1;
        die2 = random.nextInt(6) + 1;
    }

    public boolean isDouble() {
        return die1 == die2;
    }

    public int getDie1() {
        return die1;
    }

    public int getDie2() {
        return die2;
    }

    public int rollUntilDouble() {
        int count = 0;
        do {
            roll();
            count++;
            System.out.println("Rolling the dice...");
            System.out.println("Die 1: " + getDie1());
            System.out.println("Die 2: " + getDie2());
            if (isDouble()) {
                System.out.println("You rolled a double!");
            } else {
                System.out.println("Try again.");
            }
        } while (!isDouble());
        System.out.println("After " + count + " try both reach the same value");
        return count;
    }
}
