abstract class car{
    public void start(){
        System.out.println("car is starting");
    }
    public abstract void fly();
    public abstract void stop();

}
abstract class lambo extends car{
    public void fly(){
        System.out.println("lambo is flying");

    }
}
class newlambo extends lambo{
    public void stop(){
        System.out.println("lamborgini is stopping");
    }
}




public class abst {
    public static void main(String[] args) {
        car car1 = new newlambo(); 
        car1.start();
        car1.fly();
        car1.stop();  
       
}
}
