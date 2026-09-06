abstract class car{
    public void start(){
        System.out.println("car is starting");
    }
    public abstract void fly();
    public abstract void stop();

}
// abstract class lambo extends car{
//     public void fly(){
//         System.out.println("lambo is flying"); ## Lagbe na karon ami inner class e likhbo

//     }
// }
// class newlambo extends lambo{
//     public void stop(){
//         System.out.println("lambo is stopping"); ##inner class mane obj bananor somoy jeta pase lekhe 
//     }
// }

public class abstanonyinner {
        public static void main(String[] args) {
        car car1 = new newlambo(){
            public void fly(){
                System.out.println("lambo is flying");
            }
            public void stop(){
                System.out.println("lambo is stopping");
            }



        }; 
        car1.start();
        car1.fly();
        car1.stop();  
       
}
    
}
