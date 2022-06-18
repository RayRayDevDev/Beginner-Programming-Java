import static java.lang.System.out;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

 abstract class Vehicle implements Runnable, MustImplement {
    protected String vehicleName = null;
    protected Double position = 0.0;
    protected Double speed;
    protected int fuelOrElectricityCapacity;
    protected int currentFuelLevel;
    protected int refuelTime; // random amount of time to refuel.
    protected static boolean winner = false;

    Vehicle(String name, Double position, Double speed, int capacity) {

        vehicleName = name;
        this.position = position;
        this.speed = speed;
        fuelOrElectricityCapacity = capacity;
        currentFuelLevel = capacity;

    }

    @Override
    public void run() {
        do {
            try {
                if (position == 0) {
                    out.println(vehicleName + " has joined the race!");
                    out.println("\nThe current vehicle: " + vehicleName + " is at the starting line!\n");
                    for (int i = 5; i != 0; i--) {
                        out.println(i);
                        if (i == 1) {
                            out.println("\n\nGo!\n\n");
                            position += speed; // Easier way than doing complex math.
                            out.println(vehicleName + " is now at position " + position + "!");
                        }
                    }
                }

                    if (position <= 99.99 && currentFuelLevel != 0 && winner != true) { // Normal race loop.
                        position += speed;
                        currentFuelLevel -= 1;
                        out.println(vehicleName + " is currently at position " + position
                                + " and is moving at a speed of " + speed + " and currently has "
                                + currentFuelLevel + " gallons/KwH in fuel left!");
                    } else if (position <= 99.99 && currentFuelLevel == 0 && winner != true) { // Condition for
                                                                                                        // refueling.
                        refuel();
                    } else if (position <= 99.99 && currentFuelLevel != 0 && winner == true) { // Condition if
                                                                                                        // another
                                                                                                        // thread has
                                                                                                        // already won.
                        break;
                    } else if (position >= 100 && winner != true) { // Win condition.
                        winner = true;
                        out.println(vehicleName + " is the winner!");
                        System.exit(0);
                    }
            } catch (Exception e) {
                out.println(e.getMessage());
            }

        } while (!winner);

    }

    protected synchronized void refuel() {
        Random r = new Random();
        refuelTime = r.nextInt(fuelOrElectricityCapacity * 5);
        try{
        while(currentFuelLevel < fuelOrElectricityCapacity) {
        Thread.sleep(refuelTime);
        currentFuelLevel += 1;
        }
        } catch(Exception e) {
            out.println(e.getMessage());
        }
    }
        
    }


 class ToyotaCorollaCross extends Vehicle {

    ToyotaCorollaCross(String name, Double position, Double speed, int capacity) {
        super(name, position, speed, capacity);
        // TODO Auto-generated constructor stub
    }
    // 2022 Toyota Corolla Cross--One of slowest in 2021.
}

 class VolkswagenTiguan extends Vehicle {

    VolkswagenTiguan(String name, Double position, Double speed,
            int capacity) {
        super(name, position, acceleration, avgSpeed, speed, capacity);
        // TODO Auto-generated constructor stub
    }
    // Second Slowest of 2021.

}

 class NissanSentra extends Vehicle {

    NissanSentra(String name, Double position, Double speed, int capacity) {
        super(name, position, acceleration, avgSpeed, speed, capacity);
        // TODO Auto-generated constructor stub
    }
    // Third Slowest of 2021.

}

 class BMWM8CompetitionGranCoupe extends Vehicle {

    BMWM8CompetitionGranCoupe(String name, Double position, Double speed,
            int capacity) {
        super(name, position, acceleration, avgSpeed, speed, capacity);
        // TODO Auto-generated constructor stub
    }
    // Fourth Fastest.
}

 class LamborghiniHuracanSTO extends Vehicle {

    LamborghiniHuracanSTO(String name, Double position, Double speed,
            Double capacity) {
        super(name, position, acceleration, avgSpeed, speed, capacity);
        // TODO Auto-generated constructor stub
    }
    // Third Fastest.

}

 class Porsche911TurboSCabriolet extends Vehicle {

    Porsche911TurboSCabriolet(String name, Double position, Double speed,
            int capacity) {
        super(name, position, acceleration, avgSpeed, speed, capacity);
        // TODO Auto-generated constructor stub
    }
    // Second Fastest.

}

 class TeslaModelSPlaid extends Vehicle {

    TeslaModelSPlaid(String name, Double position, Double speed,
            int capacity) {
        super(name, position, acceleration, avgSpeed, speed, capacity);
        // TODO Auto-generated constructor stub
    }
    // First Fastest.

}

 interface MustImplement {

}

class WriteResultsToFile {
    public static void createFile() {
        try {
            File raceResults = new File(raceResults.txt);

            if (raceResults.createNewFile()) {
                out.println("Race results file successfully created!");
            }

        } catch (IOException e) {
            out.print("An error occured: ");
            e.printStackTrace();
        }
    }

    public static void writeToFile(String[] resultsArray) {
        FileWriter writeRaceResults = new FileWriter(raceResults.txt);
        writeRaceResults.write(resultsArray);
        out.println("Race results successfully saved!");
    }

}

class Main {
    public static void main(String[] args) {
        ToyotaCorollaCross toyoCross = new ToyotaCorollaCross("2022 Toyota Corolla Cross", 0.0, 1.0, 12); //818.4 ft to go 0-60mph in 9.3 seconds. 9.3/100
        Thread first = new Thread(toyoCross);
        first.start(); 

    }
}