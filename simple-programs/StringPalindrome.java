public class StringPalindrome {
    public static void main(String[] args) {
        String str="hello".toLowerCase();
        StringBuilder sb=new StringBuilder(str);
        int lp=0,rp=str.length()-1;
        boolean flag=true;
        while(lp<rp){
            char leftChar=sb.charAt(lp);
            char rightChar=sb.charAt(rp);
            if(leftChar!=rightChar){
                flag=false;
                break;
            }
            lp++;
            rp--;
        }

        if(flag==true){
            System.out.println("The given string is palindrome");
        }
        else{
            System.out.println("THe given string is not a palindrome");
        }
    }
}