import java.util.HashSet;

public class HashSetExample{
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("TATA");
        cars.add("TATA");
        cars.add("Ford");
        cars.add("Ford");
        System.out.println(cars);
    }
}