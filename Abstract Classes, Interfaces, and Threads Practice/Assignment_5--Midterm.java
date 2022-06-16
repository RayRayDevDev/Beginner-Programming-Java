import static java.lang.System.out;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public abstract class Vehicle implements Runnable, MustImplement {
    protected String vehicleName;
    protected Double position;
    protected Double accelerationTime;
    protected Double Avgspeed;
    protected Double topSpeed;
    protected Double fuelOrElectricityCapacity;
    protected int refuelTime;
    protected String[] resultsArray;

    Vehicle(String name, Double position, Double acceleration, Double avgSpeed, Double topSpeed, Double capacity,
            int refuelTime) {

        vehicleName = name;
        this.position = position;
        accelerationTime = acceleration;
        this.Avgspeed = avgSpeed;
        this.topSpeed = topSpeed;
        fuelOrElectricityCapacity = capacity;
        this.refuelTime = refuelTime;

    }

    @Override
    public void run() {
        // TODO Auto-generated method stub

    }

}

public class ToyotaCorollaCross extends Vehicle {

    ToyotaCorollaCross(String name, Double position, Double acceleration, Double avgSpeed, Double topSpeed,
            Double capacity, int refuelTime) {
        super(name, position, acceleration, avgSpeed, topSpeed, capacity, refuelTime);
        // TODO Auto-generated constructor stub
    }
    // 2021 Toyota Corolla Cross--One of slowest in 2021.
}

public class VolkswagenTiguan extends Vehicle {

    VolkswagenTiguan(String name, Double position, Double acceleration, Double avgSpeed, Double topSpeed,
            Double capacity, int refuelTime) {
        super(name, position, acceleration, avgSpeed, topSpeed, capacity, refuelTime);
        // TODO Auto-generated constructor stub
    }
    // Second Slowest of 2021.

}

public class NissanSentra extends Vehicle {

    NissanSentra(String name, Double position, Double acceleration, Double avgSpeed, Double topSpeed, Double capacity,
            int refuelTime) {
        super(name, position, acceleration, avgSpeed, topSpeed, capacity, refuelTime);
        // TODO Auto-generated constructor stub
    }
    // Third Slowest of 2021.

}

public class BMWM8CompetitionGranCoupe extends Vehicle {

    BMWM8CompetitionGranCoupe(String name, Double position, Double acceleration, Double avgSpeed, Double topSpeed,
            Double capacity, int refuelTime) {
        super(name, position, acceleration, avgSpeed, topSpeed, capacity, refuelTime);
        // TODO Auto-generated constructor stub
    }
    // Fourth Fastest.
}

public class LamborghiniHuracanSTO extends Vehicle {

    LamborghiniHuracanSTO(String name, Double position, Double acceleration, Double avgSpeed, Double topSpeed,
            Double capacity, int refuelTime) {
        super(name, position, acceleration, avgSpeed, topSpeed, capacity, refuelTime);
        // TODO Auto-generated constructor stub
    }
    // Third Fastest.

}

public class Porsche911TurboSCabriolet extends Vehicle {

    Porsche911TurboSCabriolet(String name, Double position, Double acceleration, Double avgSpeed, Double topSpeed,
            Double capacity, int refuelTime) {
        super(name, position, acceleration, avgSpeed, topSpeed, capacity, refuelTime);
        // TODO Auto-generated constructor stub
    }
    // Second Fastest.

}

public class TeslaModelSPlaid extends Vehicle {

    TeslaModelSPlaid(String name, Double position, Double acceleration, Double avgSpeed, Double topSpeed,
            Double capacity, int refuelTime) {
        super(name, position, acceleration, avgSpeed, topSpeed, capacity, refuelTime);
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
                out.println("Race results successfully saved!");
            }

        } catch (IOException e) {
            out.println("An error occured: ");
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