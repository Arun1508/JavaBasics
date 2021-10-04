import java.util.LinkedList;

public class LinkListExample{
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("BMW");
        cars.add("Mercedes Benz");
        cars.add("Jeep");
        cars.add("Fiat");
        cars.add("Chavrolet");
        System.out.println("Cars "+ cars);
        System.out.println("Cars "+ cars.getLast());
    }
}