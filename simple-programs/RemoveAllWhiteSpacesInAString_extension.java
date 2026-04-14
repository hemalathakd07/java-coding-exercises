public class RemoveAllWhiteSpacesInAString_extension {
    public static void main(String[] args) {
        String str="Hello\t..\nevery one";
        String replacedString="";
        int i=0;
        while(i<str.length()){
            if(str.charAt(i)!='\t' && str.charAt(i)!=' ' && str.charAt(i)!='\n'){
                replacedString+=str.charAt(i);
            }
            i++;
        }
        System.out.println(replacedString);
    }
}
