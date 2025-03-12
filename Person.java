public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Getter and Setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    // Getter and Setter for age with validation
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age.");
        }
    }
    
    // Display method
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Main {
    public static void main(String[] args) {
        Person person = new Person("John", 25);
        person.displayInfo();
        person.setAge(30);
        person.displayInfo();
    }
}
