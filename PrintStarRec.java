import java.util.Scanner;

public class PrintStarRec {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        // System.out.println("Enter the number of columns: ");
        // int m = sc.nextInt();

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= m; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // for (int i = 1; i <=n;i++){
        // for(int j=1;j<=m;j++){
        // if(i==1 || j == 1|| i==n || j == m){
        // System.out.print("*");
        // }else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // for(int i=1;i<=n;i++){
        // for(int j=1;j<=i;j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // for (int i = n; i >= 1; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


         for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
