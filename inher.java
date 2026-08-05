class Animal { // superclass
    public void eat() {
        System.out.println("The animal is eating.");
    }
    public void sleep() {
        System.out.println("The animal is sleeping.");
    }
}

class Dog extends Animal { // subclass
    public void eat() {
        System.out.println("The dog is barking.");
    }
}


public class inher {

    public static void main(String[] args) {
    Dog myAnimal = new Dog();
    myAnimal.eat();
    myAnimal.sleep();
    }
}