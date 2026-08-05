class  Encp {
    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age > 0) { // Basic validation
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }
}

 public class Enc {
    public static void main(String[] args) {
        Encp person = new Encp();
        
        // Setting values using setters
        person.setName("Alice");
        person.setAge(30);
        
        // Getting values using getters
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        
        // Attempting to set an invalid age
        person.setAge(-5); // This will trigger the validation message
    }
}