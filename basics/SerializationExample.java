import java.io.*;

class Employee implements Serializable {
    String name;
    transient int age; // Transient keyword prevents serialization of this field

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class SerializationExample {
    public static void main(String[] args) {
        Employee emp = new Employee("John", 30);

        // Serialization
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"))) {
            oos.writeObject(emp);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.ser"))) {
            Employee deserializedEmp = (Employee) ois.readObject();
            System.out.println("Name: " + deserializedEmp.name + ", Age: " + deserializedEmp.age);
            // Age will be 0 because it is transient
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
