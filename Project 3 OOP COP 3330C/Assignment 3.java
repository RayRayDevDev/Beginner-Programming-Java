import static java.lang.System.out;

import java.util.Scanner;

class RadioStationException extends Exception {


    public RadioStationException(String message) {
        super(message);
    }

}

class RadioStation {
     private static String radioCallSign = null;
     private static double radioStationFrequency = 0;
     private static int i = 0;
    public RadioStation(String rCS, double rSF) {
        radioCallSign = rCS;
        radioStationFrequency = rSF;
    }

    static void validateCallSign (String radioCallsign) throws RadioStationException {
        for(int j = 0; j < radioCallSign.length(); j++){
            if(Character.isDigit(radioCallSign.charAt(j))) { //Check if there are any numbers that were entered.

                throw new RadioStationException("EXCEPTION in MAIN: Station call signs must only consist of letters. Unable to complete radio station object!");
            }
        }
        int radioCallSignLength = radioCallsign.length();

        if(radioCallSignLength < 4 || radioCallSignLength > 4) {
                
            throw new RadioStationException(" EXCEPTION in MAIN: Station call signs must contain exactly four (4) letters. Detected more or less than four (4) letters. Unable to create radio station object!");
        }
        
        
    }

    static void validateStationFrequency (double radioStationFrequency) throws RadioStationException {
        if(radioStationFrequency < 88.0 || radioStationFrequency > 108.0) {
            throw new RadioStationException("EXCEPTION in MAIN: The station frequency must be within 88.0 and 108.0, inclusive. The inputted frequency is not within this range. Unable to create the radio station object!");
        }
    }

    public static void main(String[] args) {    
        RadioStation[] stationArray = new RadioStation[6];
        Scanner userInput = new Scanner(System.in);
        boolean exception = false;
        do {
            try {
                out.print("Welcome! Please enter the callsign of the radio station you'd like to listen to. Please enter only letters and ensure that the callsign is no more than four (4) letters in length:  ");
                radioCallSign = userInput.next(); 
                validateCallSign(radioCallSign);
                out.print("Next, please enter the carrier frequency of the desired radio station. Please note that the frequency cannot be below 88 or above 108. ");
                try {
                    radioStationFrequency = userInput.nextDouble();
                } catch (Exception e) {
                    out.println("You did not enter a number. Please enter a number and try again.");
                    exception = true;
                }
                if(exception){
                    continue;
                }
                validateStationFrequency(radioStationFrequency);
                stationArray[i] = new RadioStation(radioCallSign, radioStationFrequency); 
                i++;
            } catch(RadioStationException e) {
                out.println(e.getMessage());
            }
                

            } while(i < stationArray.length);
    }
}



// if(rCS.length() != 4 || RadioStation.isANumber == true) {
//     throw new RadioStationException("Radio Stations cannot have a callsign with length: " + out.print(Integer.toString(rCS.length())) + ". " + "Please enter a callsign such that it contains at least four (4) letters exactly. Thank you!");
// } 
// else if(rSF < 88 || rSF > 108) {
//     throw new RadioStationException("Radio Statons must have a carrier frequency between 88 and 108. You entered: " + out.print(rSF) + ". " + "Please ensure the carrier frequency is between 88 and 108 and try again. Thank you!");
// }