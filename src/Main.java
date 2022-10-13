import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Map<String, String> lexicon = new HashMap<>();

        lexicon.put("Allvar", "Serious");    //key + values
        lexicon.put("Bestämd", "Determined");
        lexicon.put("Kortfattad", "Concise");
        lexicon.put("Särskild", "Particular");

        for (String words : lexicon.keySet()) {
            System.out.println("Svenska:\n " + words);
            System.out.println("Engelska:\n" +  lexicon.get(words)); // outprint results for translating words

        }
    }
}
