import static java.lang.System.out;

import java.util.Random;
import java.util.Scanner;

class Animal implements Runnable {
    private Thread animalThread; //Thread for the animal being instantiated.
    private String name = null;  //The animal's name and also the thread's name.
    private float position = 0;  //The animal's position.
    private float speed = 0;  //The animal's speed.
    private int restMax = 0;  //The maxium amount (in ms) the animal is ever allowed to rest.
    private boolean winner = false;  //Initial condition; nobody has raced, therefore nobody has won yet. 
    Scanner userInput = new Scanner(System.in);
    int i;
    
    Animal() {
        
    }

    Animal(String animalName, float animalStartPos, float animalStartSpeed, int animalRestMax) {
        name = animalName;
        position = animalStartPos;
        speed = animalStartSpeed;
        restMax = animalRestMax;
        out.println(name + " has been created successfully!");
    }

    public void start() {
        out.println(name + " is being instantiated!");
        if(animalThread == null) {
            animalThread = new Thread(this, name);
            animalThread.start();
        }
        else animalThread.start();
    }

    public void run() {
        for(i = 0; i >= 100; i++) {
            try {
            position += speed;
            out.println("\nThe current animal, " + name + " is currently at position: " + position + " and is moving at a speed of " + speed + ".\n");
            Random random = new Random();
            int randomRest = random.nextInt(restMax) + 1;
            Thread.sleep(randomRest);
            }

            catch (InterruptedException e) {
                out.println(e.getMessage());
            }
        }
    }
    
}

class Main {

    public static void main(String[] args) {
        

        Animal firstAnimal = new Animal("rabbit", 0, 5, 150);
        Animal secondAnimal =  new Animal("turtle", 0, 3, 100);
        firstAnimal.start();
        secondAnimal.start();


    }
}