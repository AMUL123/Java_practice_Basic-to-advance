public class ReverseNum {
    public static void main(String[] args){
        int num=1234, rev=0;
        while(num!=0){
            int rem=num%10;
            rev=rev*10+rem;
            num /=10;
        }
        System.out.println("Reverse number is: "+rev);
    }
}