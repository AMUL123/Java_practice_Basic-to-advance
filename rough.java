import java.util.Scanner;

public class rough {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int myNumber=(int)(Math.random()*100);
    int guess=0;
    do {
        System.out.println("Enter your number");
        guess=sc.nextInt();
        if(guess == myNumber){
            System.out.println("correct guess");
            break;
        }else if(guess > myNumber){
            System.out.println("too high");
        }else{
            System.out.println("too low");
        }
    }while(guess >=0);
    System.out.println("My number is : "+myNumber);
}
}
