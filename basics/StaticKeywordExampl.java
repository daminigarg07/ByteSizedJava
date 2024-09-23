class Counter {
    static int count = 0; // Static variable

    Counter() {
        count++; // Increment count whenever a new object is created
    }

    static void displayCount() { // Static method
        System.out.println("Count: " + count);
    }
}

public class StaticKeywordExample {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter.displayCount(); // Output: Count: 2
    }
}
