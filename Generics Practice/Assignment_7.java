class GenericArrayMethod <E> {
public static <E> Integer iterateThruArrayAndGetPosition(E[] inputArray, E element) {
    int pos = -1;
    for(int i = 0; i < inputArray.length; i++) {
        if(inputArray[i] == element) {
            pos = i;
            break;
        }
        else if (inputArray[i] != element) {
            continue;
        }
    }
    return pos;
}
}

class Main{
public static void main(String[] args) {
    String[] names = new String[] {"Cole", "Winnie", "Seth", "Tracy", "Ernie", "Jack", "Zoey"};
    String userStringSelection = "Cole";
    System.out.println("The position of the element, " + userStringSelection + ", is: " + GenericArrayMethod.iterateThruArrayAndGetPosition(names, userStringSelection) + ".");
    Integer[] intArray = new Integer[] {5, 10, 15, 20, 25};
    Integer userIntSelection = 25;
    System.out.println("The position of the element, " + userIntSelection + ", is: " + GenericArrayMethod.iterateThruArrayAndGetPosition(intArray, userIntSelection) + ".");
}

}