import java.util.Arrays;

public class StringAnagram {
    static boolean isAnagram(String str1,String str2){
      

        str1=str1.replaceAll(" ","");
        str2=str2.replaceAll(" ","");

        if(str1.length()!=str2.length()){
            return false;
        }

        char[] charArray1=str1.toCharArray();
        char[] charArray2=str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1,charArray2);
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("liste  n".toLowerCase(),"silent".toLowerCase()));

    }
}
