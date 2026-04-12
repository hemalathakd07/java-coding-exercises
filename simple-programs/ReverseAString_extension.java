public class ReverseAString_extension {
    public static void main(String[] args) {
        String str="Hemalatha";
        int lp=0,rp=str.length()-1;
        StringBuilder sb=new StringBuilder(str);
        while(lp<rp){
            char leftChar=sb.charAt(lp);
            char rightChar=sb.charAt(rp);
            sb.setCharAt(lp,rightChar);
            sb.setCharAt(rp,leftChar);
            lp++;
            rp--;
        }
        System.out.println(sb);
    }
}
