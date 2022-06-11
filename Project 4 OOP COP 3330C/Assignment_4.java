import static java.lang.System.out;
import java.util.Random;
import java.util.Scanner;

class Animal implements Runnable {
    private String name = null;  //The animal's name and also the thread's name.
    private float position = 0;  //The animal's position.
    private float speed = 0;  //The animal's speed.
    private int restMax = 0;  //The maxium amount (in ms) the animal is ever allowed to rest.
    private boolean winner = false;  //Initial condition; nobody has raced, therefore nobody has won yet. 
    private int randomRest = 0;
    Scanner userInput = new Scanner(System.in);

    Animal(String animalName, float animalStartPos, float animalStartSpeed, int animalRestMax) {
        name = animalName;
        position = animalStartPos;
        speed = animalStartSpeed;
        restMax = animalRestMax;
        out.println(name + " has been created successfully!");
    }
    
    public void run() {

        while(position <= 100) {
            try{         
                 if(position == 0) {
                
                out.println("\nThe current animal, " + name + ", is at position: " + position + " and is moving at a speed of " + speed + " and is about to rest for " + randomRest + " milliseconds!\n");
                position += speed;
                }    
                    else{
                position += speed;
                Random random = new Random();
                randomRest = random.nextInt(restMax) + 1;
                out.println("\nThe current animal, " + name + ", is at position: " + position + " and is moving at a speed of " + speed + " and is about to rest for " + randomRest + " milliseconds!\n");
                Thread.sleep(randomRest);
                
                if(position >= 100) {
                    winner = true;
                    
                    if(winner) {
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

class Main {

    public static void main(String[] args) {
        Animal firstAnimal = new Animal("rabbit", 0, 5, 150);
        Animal secondAnimal = new Animal("turtle", 0, 3, 100);
        Thread first = new Thread(firstAnimal);
        Thread second = new Thread(secondAnimal);
        first.setName("firstAnimal");
        second.setName("secondAnimal");
        first.start();
        second.start();
        }
}