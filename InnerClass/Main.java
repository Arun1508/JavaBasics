public class Main {
    public static void main(String[] args) {
        OuterClass oc = new OuterClass();
        OuterClass.InnerClass ic = oc.new InnerClass();
        System.out.println("OC "+ oc.x + " IC "+ic.y);
        //inner private call can't be accessed
        OuterClass.InnerClass2 oc1 = new OuterClass.InnerClass2();
        System.out.println("static inner class "+ oc1.z);
    }
}
