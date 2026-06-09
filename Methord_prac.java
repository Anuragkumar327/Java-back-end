// public class Methord_prac {
//     static void sayHello(){
//         System.out.println("Hello Java");
//     }
//     public static void main(String[] args) {
//           sayHello();
//     }
// }

public class Methord_prac {

    static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(max(5, 10));
    }
}