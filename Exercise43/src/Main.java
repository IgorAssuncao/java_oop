import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> stringsArrayList = new ArrayList<>();

        getInputAndInsertIntoArrayList(stringsArrayList);

        printInvertedArrayList(stringsArrayList);
    }

    public static String getUserInput() {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Insert a string: ");

        return userInput.nextLine();
    }

    public static boolean checkStringInArray(ArrayList<String> stringsArrayList, String string) {
        for (String stringInArray : stringsArrayList) {
            if ((string.equals(stringInArray))) {
                System.out.println("Error: String already exists in the Array!");
                return true;
            }
        }

        return false;
    }

    public static void insertStringIntoArrayList(ArrayList<String> stringsArrayList, String string) {
        if (!(checkStringInArray(stringsArrayList, string))) {
            stringsArrayList.add(string);
        }
    }

    public static void getInputAndInsertIntoArrayList(ArrayList<String> stringsArrayList) {
        String userInput = getUserInput();

        while (!(userInput.equals(""))) {
            insertStringIntoArrayList(stringsArrayList, userInput);
            userInput = getUserInput();
        }
    }

    public static void printInvertedArrayList(ArrayList<String> stringsArrayList) {
        for (int index = stringsArrayList.size() - 1; index >= 0; index--) {
            System.out.println(stringsArrayList.get(index));
        }
    }
}
