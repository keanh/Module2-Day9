public class Palindrome {
    public static boolean checkPalindrome(String s){
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = s.length()-1; i>=0; i--){
            stringBuffer=stringBuffer.append(s.charAt(i));
        }
        if (s.equalsIgnoreCase(stringBuffer.toString())){
            return true;
        }else{
            return false;
        }
    }
}
