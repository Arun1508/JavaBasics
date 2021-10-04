import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample{
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Mercedes Benz");
        cars.add("Jeep");
        cars.add("Fiat");
        cars.add("Chavrolet");
        System.out.println("Cars "+ cars);

        //Looping with get
        for(int i=0; i<cars.size(); i++){
            System.out.println("ArrayList car : "+ cars.get(i));
        }

        // for each 
        for(String car: cars){
            System.out.println("for each car : "+ car);
        }

        //sorting 
        Collections.sort(cars);
        for(String ii : cars){
            System.out.println("Sorted "+ ii);
        }
    }
}