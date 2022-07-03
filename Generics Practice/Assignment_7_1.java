

interface Value {
    int intValue();
}

class maxMinGenericsPractice {
public static <P extends Value> P maxMin (P one, P two) {
    
    if(one.Value() < two.Value()) {
        return two;
    }
    else return one;
}
}
class Main {
public static void main(String[] args) {
    
}
}