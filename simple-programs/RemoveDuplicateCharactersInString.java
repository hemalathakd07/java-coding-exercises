public class RemoveDuplicateCharactersInString {
    public static void main(String[] args){
        String str="Haamsini".toLowerCase();
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(sb.toString().indexOf(ch)==-1){
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
}
