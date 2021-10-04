import java.util.HashMap;

public class HashMapExample{
    public static void main(String[] args) {
        HashMap<String,String> capCity = new HashMap<String,String>();

        capCity.put("England","London");
        capCity.put("Norway", "Oslo");
        System.out.println(capCity);
        System.out.println(capCity.get("England"));
    }
}