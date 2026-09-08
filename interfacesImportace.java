interface Computer {
    void coding() ;
        
   
}
class laptop implements Computer{
    public void coding() {
        System.out.println("coding in laptop");
    }
}
class desktop implements Computer{
    public void coding() {
        System.out.println("coding in desktop");
    }
}
class Developer{
    void develop(Computer a) {
        a.coding();
    }
}


public class interfacesImportace {
    public static void main(String[] args) {
        Computer lap = new laptop();
        Computer desk = new desktop();
        Developer shan = new Developer();
        shan.develop(lap);
        shan.develop(desk);
        
       
    }
    
}
