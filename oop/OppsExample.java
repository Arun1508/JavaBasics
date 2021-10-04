
public class OppsExample {
    int x = 5;

    //static method
    static void staticMethod(){
        System.out.println("Static Method");
    }

    //public method
    public void publicMethod(){
        System.out.println("Public Method");
    }

    public static void main(String[] args) {
        OppsExample obj1 = new OppsExample();
        SecondClassExample obj2 = new SecondClassExample();

        System.out.println("X "+ obj1.x);
        System.out.println("X "+ obj2.x);
        
        obj2.x = 12;
        System.out.println("After updating");
        System.out.println("X "+ obj2.x);
        
        System.out.println("Calling static method");
        staticMethod();
        obj1.publicMethod();

        // import person
        Person p1 = new Person();
        p1.setName("Arun Mukesh");
        System.out.println("get name "+ p1.getName());
    }
}