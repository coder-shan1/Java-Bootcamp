class a{
    int x;
    public void show(){
        System.out.println("in a show");
    }

    class b{
        public void show(){
            System.out.println("in b show");
        }
    }
}


public class innclass {
    public static void main(String[] args) {
        a obj = new a();
        obj.show();
        a.b obj2 = obj.new b();
        obj2.show();
        
    }
}