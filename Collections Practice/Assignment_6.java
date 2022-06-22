import static java.lang.System.out;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collections;

class toStringClass{
     public String toString() {
        String arrayNames = " This is the list of names as they appear in the Array: " + Main.names;
        return arrayNames;
    }
}
class Main {
    
public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<String>();
    names.add("Cole");
    names.add("Tracy");
    names.add("Winnie");
    names.add("Seth");
    names.add("Ernie");
    names.add("Jack");
    names.add("Zoey");
    names.add("Zach");

    for(String i : names) {
        out.println(i);
    }
    
    out.println("\n");

    Collections.sort(names);

    for(String i : names) {
        out.println(i);
    }
    
    out.println("\n");

    for(String i : names) {
        if(i == "Zoey") out.println("The location of the element 'Zoey' is: " + names.indexOf("Zoey"));
        else continue;
    }
    
    out.println("\n");

    out.println("The location of the element 'Heidi' is: " + names.indexOf("Heidi"));

    out.println(names.toArray());
            
    }
}
