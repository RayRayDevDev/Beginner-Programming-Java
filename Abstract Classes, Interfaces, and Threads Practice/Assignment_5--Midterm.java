import static java.lang.System.out;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public abstract class Vehicle implements Runnable, MustImplement {
    protected String vehicleName;
    protected Double position;
    protected Double accelerationTime;
    protected Double avgspeed;
    protected Double timeToSixty;
    protected Double fuelOrElectricityCapacity;
    protected int refuelTime;
    protected boolean winner = false;
    protected String[] resultsArray;

    Vehicle(String name, Double position, Double acceleration, Double avgSpeed, Double timeToSixty, Double capacity,
            int refuelTime) {

        vehicleName = name;
        this.position = position;
        accelerationTime = acceleration;
        this.avgspeed = avgSpeed;
        this.timeToSixty = timeToSixty;
        fuelOrElectricityCapacity = capacity;
        this.refuelTime = refuelTime;

    }

    @Override
    public void run() {
        do {
            try {
                if(position == 0) {
                    out.println(vehicleName + " has joined the race!");
                    out.println("\nThe current vehicle: " + vehicleName + " is at the starting line!\n");
                    for(int i = 5; i != 0; i--) {
                        out.println(i);
                        if(i == 0) {
                            out.println("\n\nGo!\n\n");
                            position += timeToSixty;
                        }
                    }
                }
                else {
                    double d; //Distance variable
                    double r; //Rate variable
                    double t; //Time variable
                    while(fuelOrElectricityCapacity != 0 && !winner) {
                        if(position <= 99.99) {

                        }
                    }
                }
            } catch (Exception e) {
                //TODO: handle exception
            }

        } while(!winner);

    }

}

public class ToyotaCorollaCross extends Vehicle {

    ToyotaCorollaCross(String name, Double position, Double acceleration, Double avgSpeed, Double timeToSixty,
            Double capacity, int refuelTime) {
        super(name, position, acceleration, avgSpeed, timeToSixty, capacity, refuelTime);
        // TODO Auto-generated constructor stub
    }
    // 2021 Toyota Corolla Cross--One of slowest in 2021.
}

public class VolkswagenTiguan extends Vehicle {

    VolkswagenTiguan(String name, Double position, Double acceleration, Double avgSpeed, Double timeToSixty,
            Double capacity, int refuelTime) {
        super(name, position, acceleration, avgSpeed, timeToSixty, capacity, refuelTime);
        // TODO Auto-generated constructor stub
    }
    // Second Slowest of 2021.

}

public class NissanSentra extends Vehicle {

    NissanSentra(String name, Double position, Double acceleration, Double avgSpeed, Double timeToSixty, Double capacity,
            int refuelTime) {
        super(name, position, acceleration, avgSpeed, timeToSixty, capacity, refuelTime);
        // TODO Auto-generated constructor stub
    }
    // Third Slowest of 2021.

}

public class BMWM8CompetitionGranCoupe extends Vehicle {

    BMWM8CompetitionGranCoupe(String name, Double position, Double acceleration, Double avgSpeed, Double timeToSixty,
            Double capacity, int refuelTime) {
        super(name, position, acceleration, avgSpeed, timeToSixty, capacity, refuelTime);
        // TODO Auto-generated constructor stub
    }
    // Fourth Fastest.
}

public class LamborghiniHuracanSTO extends Vehicle {

    LamborghiniHuracanSTO(String name, Double position, Double acceleration, Double avgSpeed, Double timeToSixty,
            Double capacity, int refuelTime) {
        super(name, position, acceleration, avgSpeed, timeToSixty, capacity, refuelTime);
        // TODO Auto-generated constructor stub
    }
    // Third Fastest.

}

public class Porsche911TurboSCabriolet extends Vehicle {

    Porsche911TurboSCabriolet(String name, Double position, Double acceleration, Double avgSpeed, Double timeToSixty,
            Double capacity, int refuelTime) {
        super(name, position, acceleration, avgSpeed, timeToSixty, capacity, refuelTime);
        // TODO Auto-generated constructor stub
    }
    // Second Fastest.

}

public class TeslaModelSPlaid extends Vehicle {

    TeslaModelSPlaid(String name, Double position, Double acceleration, Double avgSpeed, Double timeToSixty,
            Double capacity, int refuelTime) {
        super(name, position, acceleration, avgSpeed, timeToSixty, capacity, refuelTime);
        // TODO Auto-generated constructor stub
    }
    // First Fastest.

}

public interface MustImplement {
    public void accelerate();

    public void drive();

    public void refuelOrRecharge();
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
        

    }
}