class a{

  public void show(){
    System.out.println("In class a");
  }  
}
class b extends a{
    public void show(){
        System.out.println("In class b");
    }
}
class c extends a{
    public void show(){
        System.out.println("In class c");
    }
}




public class dynamicDispatch {
    public static void main(String[] args) {
        a obj1 = new a();
        obj1.show();
        obj1= new b();
        obj1.show();
        a obj2 = new b();
        a obj3 = new c();
        obj2.show();    
        obj3.show();
     
    }

    
}
