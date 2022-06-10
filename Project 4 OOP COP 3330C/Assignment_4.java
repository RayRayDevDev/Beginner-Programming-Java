import static java.lang.System.out;

import java.util.Scanner;

class Animal implements Runnable {
    private Thread animalThread; //Thread for the animal being instantiated.
    private String name = null;  //The animal's name and also the thread's name.
    private float position = 0;  //The animal's position.
    private float speed = 0;  //The animal's speed.
    private int restMax = 0;  //The maxium amount (in ms) the animal is ever allowed to rest.
    private long randomRest = Math.random(restMax);  //Determine's the random amount of time (up to the restMax) the animal may rest each time called.
    private boolean winner = false;  //Initial condition; nobody has raced, therefore nobody has won yet. 

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setPosition(float position) {
        this.position = position;
    }
    public float getPosition() {
        return position;
    }
    public void setSpeed(float speed) {
        this.speed = speed;
    }
    public float getSpeed() {
        return speed;
    }
    public void setRestMax(int restMax) {
        this.restMax = restMax;
    }
    public int getRestMax() {
        return restMax;
    }
    Animal() {
        
    }
    
    Animal(String threadName) {
        name = threadName;
        out.println(name + " has been created successfully!");
    }

    Animal(String animalName, float animalStartPos, float animalStartSpeed, int animalRestMax) {
        name = animalName;
        position = animalStartPos;
        speed = animalStartSpeed;
        restMax = animalRestMax;
    }

    public void start() {
        out.println(name + " is being instantiated!");
        if(animalThread == null) {
            animalThread = new Thread(this, name);
            animalThread.start();
        }
    }

    public void run() {

    }
    
}

class Main {

    public static void main(String[] args) {
        
    Scanner userInput = new Scanner(System.in);

    String animalName;
    float animalStartPos;
    float animalStartSpeed;
    int animalRestMax;

    out.print("\nHowdy! Welcome to the amazing race between two animals! Please enter the type of animal you want to race: ");
        animalName =  userInput.next();
        out.print("Please enter the animal's starting position in the format: xx.xx where 0 is the beginning of the race and 100 is the end: ");
        animalStartPos = userInput.nextFloat ();
            if(animalStartPos < 0 || animalStartPos > 100) {
             out.println("The Animal's starting position CANNOT be less than 0 or more than 100! Please try again!"); 
                System.exit(1);
        }
        out.print("Great! Now, please enter the Animal's speed in the format of xx.xx. Values can be from .25 to 10: ");
        animalStartSpeed = userInput.nextFloat();
        if(animalStartSpeed < 0.25 || animalStartSpeed > 10) {
            out.println("The Animal's speed CANNOT be less than 0.25 or more than 10! Please try again!");
            System.exit(2);
        }
        out.print("Please enter the number of seconds the animal should rest between sprints using ONLY whole numbers: ");
        animalRestMax = userInput.nextInt() / 1000;

        Animal rabbit = new Animal(animalName, animalStartPos, animalStartSpeed, animalRestMax);
        Animal.setName(animalName); 

        Animal turtle = new Animal(animalName, animalStartPos, animalStartSpeed, animalRestMax);

    }
}