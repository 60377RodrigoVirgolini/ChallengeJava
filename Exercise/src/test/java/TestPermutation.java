import org.junit.Test;

import java.util.ArrayList;

public class TestPermutation {

    @Test
    public void testNullValue(){
        Permutation permutationChallenge = new Permutation();
        ArrayList<String> permutation= permutationChallenge.permute(null);
        assert permutation== null;
    }

    @Test
    public void testAmountOfPermutationCharacters(){
        Permutation permutationChallenge = new Permutation();
        ArrayList<String> permutation= permutationChallenge.permute("null");
        System.out.println(permutation.size());
        assert permutation.size() == 31;
    }

    @Test
    public void testAmountOfEnglishWords(){
        Permutation permutationChallenge = new Permutation();
        ArrayList<String> permutationList = permutationChallenge.permute("work");
        Dictionary dictionary = Dictionary.getInstance();
        ArrayList<String> englishwords = new ArrayList<>();
        for (String w: permutationList){
            if (dictionary.isEnglishWord(w)){
                englishwords.add(w);
            }
        }
        assert  englishwords.size() == 7;
    }

    @Test
    public void testEnglishWordsOnDictionary(){
        Permutation permutationChallenge = new Permutation();
        ArrayList<String> permutationList = permutationChallenge.permute("work");
        Dictionary dictionary = Dictionary.getInstance();
        ArrayList<String> englishwords = new ArrayList<>();
        for (String w: permutationList){
            if (dictionary.isEnglishWord(w)){
                englishwords.add(w);
            }
        }
        assert  englishwords.stream().allMatch(dictionary::isEnglishWord);
    }

}
