// public class whileLoop {
//     public static void main(String[] args) {
//         int number = 12345;
//         int reverse =0;

//       while(number!=0){
//         int digit = number % 10;
//         reverse = reverse * 10  + digit;
//         number = number/10;
//       }
//       System.out.println("Reverse number "+ reverse);
//     }
// }


public class whileLoop{
    public static void main(String[] args) {
        int i = 1;
        while(i<=3){
            System.out.println(i);
            i++;
       }
       System.out.println("Done");
       
       while(true){
        System.out.println("I am in infinite Loop ! ");
       }
    }
}