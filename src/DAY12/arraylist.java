package DAY12;
import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        System.out.println("ArrayList: " + list);

        System.out.println("First Element: " + list.get(0));

        list.remove("Banana");

        System.out.println("After Remove: " + list);

        System.out.println("Size: " + list.size());
    }
}