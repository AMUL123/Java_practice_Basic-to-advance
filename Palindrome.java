public class Palindrome {
    public static void main(String[] args){
        String str="Apple";
        String reverse=new StringBuilder(str).reverse().toString();
        System.out.println("isPalindrome?"+str.equals(reverse));
    }
}
