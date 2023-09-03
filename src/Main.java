import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<Integer, String> englishNumberNames = new HashMap<>();
        englishNumberNames.put(1, "One");
        englishNumberNames.put(2, "Two");
        englishNumberNames.put(3, "Three");
        englishNumberNames.put(4, "Four");
        englishNumberNames.put(5, "Five");


        Map<Integer, String> italianNames = new HashMap<>();
        italianNames.put(1, "Uno");
        italianNames.put(3, "Tre");
        italianNames.put(5, "Cinque");
        italianNames.put(7, "Sette");
        italianNames.put(9, "Nove");


        englishNumberNames.putAll(italianNames);

        System.out.println("Modified first HashMap: " + englishNumberNames);


        for (int i = 5; i <= 9; i++) {
            System.out.println( i + " " + englishNumberNames.getOrDefault(i, "No associated value"));
        }
    }
}
