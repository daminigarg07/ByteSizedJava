class OuterClass {
    private String outerField = "Outer Field";

    class InnerClass {
        void display() {
            System.out.println(outerField);
        }
    }
}

public class InnerClassExample {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display(); // Output: Outer Field
    }
}
