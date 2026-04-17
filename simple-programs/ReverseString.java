class ReverseString {
    public static String reverseString(String s) {
        int lp=0,rp=s.length()-1;
        StringBuilder sb=new StringBuilder(s);
        while(lp<rp){
            char leftChar=sb.charAt(lp);
            char rightChar=sb.charAt(rp);
            sb.setCharAt(lp,rightChar);
            sb.setCharAt(rp,leftChar);
            lp++;
            rp--;

        }
        return sb.toString();
        

    }
    public static void main(String[] args){
        String s="Geeks";
        String result=reverseString(s);
        System.out.println(result);
    }
}