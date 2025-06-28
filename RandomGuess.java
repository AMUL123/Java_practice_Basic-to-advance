import java.util.Scanner;

public class RandomGuess {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int myNumber=(int)(Math.random()*100);
        int userNumber = 0;

        do{
            System.out.println("Guess my number(1-100) : ");
            userNumber = sc.nextInt();
      
            if(userNumber==myNumber) {
                System.out.println("Woohoo...correct number you have guss!!!");
                break;
            }
            else if(userNumber > myNumber){
                System.out.println("Your guess is higher than my number");

            }else {
                System.out.println("Your guess is smaller than my number");

            }
        }while(userNumber>=0);
        System.out.println("My number is "+myNumber);
    }
}
