import static java.lang.System.out;

import java.lang.Thread.State;
import java.util.Random;
import java.util.Scanner;

class Animal implements Runnable {
    private String name = null; // The animal's name and also the thread's name.
    private float position = 0; // The animal's position.
    private float speed = 0; // The animal's speed.
    private int restMax = 0; // The maxium amount (in ms) the animal is ever allowed to rest.
    private static boolean winner = false; // Initial condition; nobody has raced, therefore nobody has won yet.
    private int randomRest = 0;  //Variable to store RNG's result.
    private Food animalFood;  //Instance of the "Food" class for the two threads to share.

    Animal(String animalName, float animalStartPos, float animalStartSpeed, int animalRestMax, Food animalFood) {  //Constructor for each Animal object.
        name = animalName;
        position = animalStartPos;
        speed = animalStartSpeed;
        restMax = animalRestMax;
        this.animalFood = animalFood;
        out.println(name + " has been created successfully!");  //Debug.
    }

    public void run() {
        while (!winner) {  //While winner is NOT true, loop.
            try {  //Exception handler so the compiler decides to play nicely.
                if (position == 0) {  //Initial condition with a different message because I thought it looked weird with the "rest" syntax that shows after every iteration hereafter. 
                    out.println(name + " has joined the race!");
                    out.println("\nThe current animal, " + name + ", is beginning the race at position: " + position
                            + " and will be moving at a speed of " + speed + "!\n");
                    position += speed;  //Increment position by the value of the Animal's speed.
                } else {
                    position += speed;  //Increment the Animal's position by the value of the Animal's speed.
                    Random random = new Random();  //New RNG object for the Thread.Sleep() method.
                    randomRest = random.nextInt(restMax) + 1;  //Take the respective Animal's "restMax" and add one to the upper bound provided by that variable to ensure it is inclusive instead of exclusive.
                    out.println("\nThe current animal, " + name + ", is at position: " + position
                            + " and is moving at a speed of " + speed + " and is about to rest for the next " + randomRest
                            + " milliseconds!\n");

                    if (position <= 99.99) {  //As the user may enter any value float for speed, position--continue eating and sleeping unless the value of position is above 99.99. During debugging, the winning thread would complete another loop, and this finally fixed it.
                        animalFood.eat(name, restMax);  //Pass the Animal's name and the restMax for more compact code.
                        Thread.sleep(randomRest);  //Sleep on randomRest.
                    } else {  //Winning condition.
                        if (position >= 100) {
                            winner = true;  //Set winner to true, stopping the loop for all threads.
                            out.println(name + " is the winner!");
                            System.exit(0);  //Exit the program cleanly.
                        }
                    }
                }
            } catch (InterruptedException e) {  
                out.println(e.getMessage());
            }
        }
    }
}

class Food {  //Shared "Food" class per requirements.
    public synchronized void eat(String name, int restMax) {  //Synchronized method in order to ensure the method becomes locked to the first thread whom accesses it.
        Random random = new Random();  //Separate RNG object for this method only. 
        int randomEat = random.nextInt(restMax);  //Utilize the Animal's restMax from the "Animal" class as a shorcut for the upper bound.
        try {
            if (name == "rabbit") {  
                randomEat = randomEat * 2;  //As the rabbit is supposed to eat for longer than the turtle, but there is no direction as to HOW much longer, chose an arbitrary amount to multiply the result of "randomEat" by.
                out.println(name + " is currently eating and will be doing so for the next " + randomEat + " milliseconds!\n");
                Thread.sleep(randomEat);
            } else {
                out.println(name + " is currently eating and will be doing so for the next " + randomEat + " milliseconds!\n");
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
        Animal firstAnimal = new Animal("rabbit", 0, 5, 150, animalFood);
        Animal secondAnimal = new Animal("turtle", 0, 3, 100, animalFood);
        Thread first = new Thread(firstAnimal);
        Thread second = new Thread(secondAnimal);
        first.setName("firstAnimal");
        second.setName("secondAnimal");
        first.start();
        second.start();
    }
}