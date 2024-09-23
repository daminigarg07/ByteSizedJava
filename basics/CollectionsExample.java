import java.util.ArrayList;

public class CollectionsExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("Fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
