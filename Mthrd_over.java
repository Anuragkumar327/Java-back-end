public class Mthrd_over {

    // Methord 1 is called

    int add(int a,int b){
        return a + b;
    }

    int add(int a, int b, int c){
        return a + b + c;
    }

    double add(double a,double b){
        return a + b;
    }

    double add(double a , int b){
        return a + b;
    }

    public static void main(String[] args) {
        Mthrd_over calc = new Mthrd_over();
        System.out.println(calc.add(5, 10));
        System.out.println(calc.add(5, 5, 5));
        System.out.println(calc.add(5.5, 10.5));
        System.out.println(calc.add(5, 10.5)); 
    }



}
