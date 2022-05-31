import static java.lang.System.out;

import java.util.Scanner;

class RadioStationException extends Exception {


    public RadioStationException(String message) {
        super(message);
    }

}

class RadioStation {
     private static String radioCallSign;
     private static double radioStationFrequency;
     private static int i;
     private static int j;
    public RadioStation(String rCS, double rSF) {
        radioCallSign = rCS;
        radioStationFrequency = rSF;
    }

    static void validate (String radioCallsign) throws RadioStationException {
        for(int j = 0; j < radioCallSign.length(); j++){
            if(Character.isDigit(radioCallSign.charAt(j))) {

                throw new RadioStationException("EXCEPTION: Station call signs must only consist of letters. Please try again.");
            }

            else{
                
                continue;
            }
        }
    }

    public static void main(String[] args) {    
        RadioStation[] stationArray = new RadioStation[6];
        Scanner userInput = new Scanner(System.in);
        for(i = 0; i != 7; i++) {
            try {
                out.print("Welcome! Please enter the callsign of the radio station you'd like to listen to. Please enter only letters and ensure that the callsign is no more than four (4) letters in length:  ");
                radioCallSign = userInput.nextLine(); 
                validate(radioCallSign);
                out.print("Next, please enter the carrier frequency of the desired radio station. Please note that the frequency cannot be below 88 or above 108. ");
                radioStationFrequency = userInput.nextDouble();
                stationArray[i] = new RadioStation(radioCallSign, radioStationFrequency); 
            } catch(RadioStationException e) {
                out.println(e.getMessage());
                System.exit(1);
            }
                

            }
    }
}



// if(rCS.length() != 4 || RadioStation.isANumber == true) {
//     throw new RadioStationException("Radio Stations cannot have a callsign with length: " + out.print(Integer.toString(rCS.length())) + ". " + "Please enter a callsign such that it contains at least four (4) letters exactly. Thank you!");
// } 
// else if(rSF < 88 || rSF > 108) {
//     throw new RadioStationException("Radio Statons must have a carrier frequency between 88 and 108. You entered: " + out.print(rSF) + ". " + "Please ensure the carrier frequency is between 88 and 108 and try again. Thank you!");
// }