class Person {
    String name;
    int age;

    // Default constructor
    Person() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized constructor
    Person(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorsExample {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Alice", 30);
        
        person1.display(); // Output: Name: Unknown, Age: 0
        person2.display(); // Output: Name: Alice, Age: 30
    }
}
