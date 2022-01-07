import java.util.ArrayList;

public class Permutation {

    public Permutation() {

    }

    ArrayList<String> done = new ArrayList<>();

    public ArrayList<String> permute(String word){
        try{
            for (int i = 2; i <= word.length(); i++){
                anag(word, 0, word.length()-1, i);
            }
            return done;
        } catch (NullPointerException e){
            e.printStackTrace();
        }
        return null;
    }

    private void anag (String str, int start, int end, int len){
        if (start == end){
            String outStr = str.substring(0, len);
            if(!done.contains(outStr)){
                System.out.println(outStr);
                done.add(outStr);
            }
        } else{
            for (int i= start; i <= end ; i++){
                str = swap(str, start, i);
                anag(str, start - 1, end, len);
                str = swap (str,start,i);
            }
        }
    }

    public String swap(String a, int i, int j){
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
