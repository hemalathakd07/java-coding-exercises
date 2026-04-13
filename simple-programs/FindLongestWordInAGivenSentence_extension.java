public class FindLongestWordInAGivenSentence_extension{
    public static void main(String[] args) {
        String str="Welcome to my Homeeeeeeee!";
        String longestWord="";
        String word="";
        str=str+" ";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=' '){
                word+=ch;
            }
            else{
                if(word.length()>longestWord.length()){
                    longestWord=word;
                }
                word="";
            }
        }
            System.out.println("The longest word in the given string is "+longestWord);
    }
}
