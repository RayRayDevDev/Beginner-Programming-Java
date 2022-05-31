import java.lang.System.out;

class RadioStationException extends Exception {
    String radioCallSign;
    double radioStationFrequency;

    public RadioStationException(String radioCallSign, double radioStationFrequency) {
        super(radioCallSign, radioStationFrequency);
        if(radioCallSign.length() != 4) {
            throw RadioStationException("Radio Stations cannot have a callsign with length: " + out.print(radioCallSign.length()) + ". " + "Please enter a callsign such that it contains at least four (4) letters. Thank you!");
        } 
        else if(radioStationFrequency < 88 || radioStationFrequency > 108) {
            throw RadioStationException("Radio Statons must have a carrier frequency between 88 and 108. You entered: " + out.print(radioStationFrequency) + ". " + "Please ensure the carrier frequency is between 88 and 108 and try again. Thank you!");
        }
    radioCallSign = this.radioCallSign;
    radioStationFrequency = this.radioStationFrequency;
    }
}

class RadioStation extends RadioStationException {
    String radioCallSign;
    double radioStationFrequency;

    public RadioStation(String radioCallSign, double radioStationFrequency) {
        super(radioCallSign, radioStationFrequency);

        radioCallSign = this.radioCallSign;
        radioStationFrequency = this.radioStationFrequency;
    }

    public static void main(String[] args) {    
        
    }
}