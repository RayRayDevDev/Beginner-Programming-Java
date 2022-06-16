import static java.lang.System.out;

public abstract class Vehicle implements Runnable, MustImplement {
protected String vehicleName;
protected Double position;
protected Double accelerationTime;
protected Double Avgspeed;
protected Double topSpeed;
protected Double fuelOrElectricityCapacity;
protected int refuelTime;

Vehicle(String name, Double position, Double acceleration, Double avgSpeed, Double topSpeed, Double capacity, int refuelTime) {

    vehicleName = name;
    this.position = position;
    accelerationTime = acceleration;
    this.Avgspeed = avgSpeed;
    this.topSpeed = topSpeed;
    fuelOrElectricityCapacity = capacity;
    this.refuelTime = refuelTime;

}


} 

public class ToyotaCorollaCross extends Vehicle {

    ToyotaCorollaCross(String name, Double position, Double acceleration, Double avgSpeed, Double topSpeed,
            Double capacity, int refuelTime) {
        super(name, position, acceleration, avgSpeed, topSpeed, capacity, refuelTime);
        //TODO Auto-generated constructor stub
    }
    //2021 Toyota Corolla Cross--One of slowest in 2021.
}

public class VolkswagenTiguan extends Vehicle {

    VolkswagenTiguan(String name, Double position, Double acceleration, Double avgSpeed, Double topSpeed,
            Double capacity, int refuelTime) {
        super(name, position, acceleration, avgSpeed, topSpeed, capacity, refuelTime);
        //TODO Auto-generated constructor stub
    }

}

public class NissanSentra extends Vehicle {

    NissanSentra(String name, Double position, Double acceleration, Double avgSpeed, Double topSpeed, Double capacity,
            int refuelTime) {
        super(name, position, acceleration, avgSpeed, topSpeed, capacity, refuelTime);
        //TODO Auto-generated constructor stub
    }

}

public class BMWM8CompetitionGranCoupe extends Vehicle {

    BMWM8CompetitionGranCoupe(String name, Double position, Double acceleration, Double avgSpeed, Double topSpeed,
            Double capacity, int refuelTime) {
        super(name, position, acceleration, avgSpeed, topSpeed, capacity, refuelTime);
        //TODO Auto-generated constructor stub
    }

}

public class LamborghiniHuracanSTO extends Vehicle {

    LamborghiniHuracanSTO(String name, Double position, Double acceleration, Double avgSpeed, Double topSpeed,
            Double capacity, int refuelTime) {
        super(name, position, acceleration, avgSpeed, topSpeed, capacity, refuelTime);
        //TODO Auto-generated constructor stub
    }

}

public class Porsche911TurboSCabriolet extends Vehicle {

    Porsche911TurboSCabriolet(String name, Double position, Double acceleration, Double avgSpeed, Double topSpeed,
            Double capacity, int refuelTime) {
        super(name, position, acceleration, avgSpeed, topSpeed, capacity, refuelTime);
        //TODO Auto-generated constructor stub
    }

}

public class TeslaModelSPlaid extends Vehicle {

    TeslaModelSPlaid(String name, Double position, Double acceleration, Double avgSpeed, Double topSpeed,
            Double capacity, int refuelTime) {
        super(name, position, acceleration, avgSpeed, topSpeed, capacity, refuelTime);
        //TODO Auto-generated constructor stub
    }

}





public interface MustImplement {
    public void accelerate();
    public void drive();
    public void refuelOrRecharge();
}



class WriteResultsToFile {

}

class Main {
    
}