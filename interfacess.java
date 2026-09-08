interface A {
  void show();
  void run();
  String name = "ami ekta interfacer name";
  int age = 25; // by default public static final
}
interface B {
void eat();

}
interface C extends  B {
    void sleep();
}

class x implements A, C {
    public void show() {
        System.out.println("show method");
    }
    public void run() {
        System.out.println("run method");
    }
    public void eat() {
        System.out.println("eat method");
    }
    public void sleep() {
        System.out.println("sleep method");
    }
}


public class interfacess {
    public static void main(String[] args) {
        A obj = new x();
        obj.show();
        obj.run();
        C obj2 = (C) obj;
        obj2.sleep();
        obj2.eat();
        System.out.println(A.name);
        System.out.println(A.age);
    }

}
