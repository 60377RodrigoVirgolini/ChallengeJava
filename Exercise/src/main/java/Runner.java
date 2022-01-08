import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Permutation permutation = new Permutation();
        Dictionary dictionary = new Dictionary().getInstance();

        String word = null;
        boolean areletters = false;
        do{
            System.out.println("Please, enter a word to process (only letters): ");
            Scanner scanner = new Scanner(System.in);
            word = scanner.next();
            areletters = word.chars().allMatch(Character::isLetter);
        } while (word == null || areletters != true || word =="");

        ArrayList<String> permutationList = permutation.permute(word);

        System.out.println("Searching english words in string...");
        ArrayList<String> englishWords = new ArrayList<>();
        for (String w : permutationList) {
            if (dictionary.isEnglishWord(w)){
                englishWords.add(w);
            }
        }
        System.out.println("English words found: " + englishWords);
    }
}
