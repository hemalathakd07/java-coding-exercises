import java.util.Arrays;

public class FindLongestWordInAGivenSentence {
    public static void main(String[] args) {
        String str="Welcome to my Home!";
        String longestWord="";
        String[] words=str.split(" ");
        System.out.println(Arrays.toString(words));
        for(String word:words){
            if(word.length()>longestWord.length()){
                longestWord=word;
            }
        }
        System.out.println("The longest word in the given string is "+longestWord);
    }
}
