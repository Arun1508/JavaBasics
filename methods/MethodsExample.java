public class MethodsExample{

    //static method
    static void printName(String fname, String lname){
        System.out.println("Hi "+ fname+" "+lname);
    }

    static int squareValue(int value){
        return (int) Math.pow(value,2);
    }

    //Overloading 
    static int addNum(int x, int y){
        return x + y;
    }

    static double addNum(double x, double y){
        System.out.println("X " + x + " Y " + y);
        return x + y;
    }

    //Recursion
    static int sumRecursion(int k){
        if( k > 0 ){
            return k + sumRecursion(k - 1);
        }else {
            return 0;
        }
    }
    
    public static void main(String[] args) {
        printName("Arun", "S");
        System.out.println("Square "+squareValue(3));
        System.out.println(addNum(12, 18));
        System.out.println(addNum(12.41d, 18.49d));
        System.out.println("Recursion "+ sumRecursion(10));
    }
}