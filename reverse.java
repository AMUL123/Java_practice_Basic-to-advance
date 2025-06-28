// public class reverse{
//     public static void main(String[] args){
//         String str="abcdef";
//         String rev="";
//         for(int i=str.length()-1;i>=0;i--){
//             rev +=str.charAt(i);
//         }
//        // System.out.println("is Palindrome? "+str.equals(rev));
//        System.out.println("Reversed String is: "+rev);
//     }
// }


// public class reverse{
//     public static void main(String[] args){
//         String str="madam";
//         String rev= new StringBuilder(str).reverse().toString();
//         System.out.println("is Palindrome? "+str.equals(rev));
//     }
// }

public class reverse{
    public static void main(String[] args) {
        String str="madam";
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev +=str.charAt(i);
        }
        System.out.println("is palindrome? "+ str.equals(rev));
    }
}
