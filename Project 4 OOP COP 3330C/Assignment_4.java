import static java.lang.System.out;

import java.util.concurrent.TimeUnit;

class Animal implements Runnable {
    private Thread animalThread; //Thread for the animal being instantiated.
    private String name;  //The animal's name and also the thread's name.
    private float position;  //The animal's position.
    private float speed;  //The animal's speed.
    private int restMax;  //The maxium amount (in ms) the animal is ever allowed to rest.
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
    private String animalName;
    private float animalStartPos;
    private float animalStartSpeed;
    private int animalRestMax;
    public static void main(String[] args) {
        Animal animalName = new Animal();
        Animal animalStartPos = new Animal();
        Animal animalStartSpeed = new Animal();
        Animal animalRestMax = new Animal();
        
        animalName.getName();
        animalStartPos.getPosition();
        animalStartSpeed.getSpeed();
        animalRestMax.getRestMax();

        Animal rabbit = new Animal(animalName, animalStartPos, animalStartSpeed, animalRestMax);
        Animal turtle = new Animal(animalName, animalStartPos, animalStartSpeed, animalRestMax);

    }
}