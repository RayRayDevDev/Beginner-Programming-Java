import static java.lang.System.out;
import java.util.Random;
import java.util.Scanner;

class Animal implements Runnable {
    private String name = null; // The animal's name and also the thread's name.
    private float position = 0; // The animal's position.
    private float speed = 0; // The animal's speed.
    private int restMax = 0; // The maxium amount (in ms) the animal is ever allowed to rest.
    private static boolean winner = false; // Initial condition; nobody has raced, therefore nobody has won yet.
    private int randomRest = 0;
    private Food animalFood;
    Scanner userInput = new Scanner(System.in);

    Animal(String animalName, float animalStartPos, float animalStartSpeed, int animalRestMax, Food animalFood) {
        name = animalName;
        position = animalStartPos;
        speed = animalStartSpeed;
        restMax = animalRestMax;
        this.animalFood = animalFood;
        out.println(name + " has been created successfully!");
    }

    public void run() {

        while (winner == false && position <= 101) {
            try {
                if (position == 0) {

                    out.println("\nThe current animal, " + name + ", is at position: " + position
                            + " and is moving at a speed of " + speed + ".\n");
                    position += speed;
                } else {
                    position += speed;
                    Random random = new Random();
                    randomRest = random.nextInt(restMax) + 1;
                    out.println("\nThe current animal, " + name + ", is at position: " + position
                            + " and is moving at a speed of " + speed + " and is about to rest for " + randomRest
                            + " milliseconds!\n");

                    if (position <= 99) {
                        animalFood.eat(name, restMax);
                        Thread.sleep(randomRest);
                    } else {
                        if (position >= 100) {
                            winner = true;
                            out.println(name + " is the winner!");
                            System.exit(0);
                        }
                    }
                }
            } catch (InterruptedException e) {
                out.println(e.getMessage());
            }

        }
    }
}

class Food {
    public synchronized void eat(String name, int restMax) {
        Random random = new Random();
        int randomEat = random.nextInt(restMax);
        try {
            if (name == "rabbit") {
                randomEat = randomEat * 2;
                out.println(name + " is currently eating and will be doing so for " + randomEat + " milliseconds!\n");
                Thread.sleep(randomEat);
            } else {
                out.println(name + " is currently eating and will be doing so for " + randomEat + " milliseconds!\n");
                Thread.sleep(randomEat);
            }
        } catch (InterruptedException e) {
            out.println(e.getMessage());
        }
    }
}

class Main {

    public static void main(String[] args) {
        Food animalFood = new Food();
        Animal firstAnimal = new Animal("rabbit", 0, 5, 200, animalFood);
        Animal secondAnimal = new Animal("turtle", 0, 3, 100, animalFood);
        Thread first = new Thread(firstAnimal);
        Thread second = new Thread(secondAnimal);
        first.setName("firstAnimal");
        second.setName("secondAnimal");
        first.start();
        second.start();
    }
}