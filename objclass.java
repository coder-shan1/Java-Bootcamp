class laptop {
    String model;
    int price;
    public String toString() {
        return "laptop ";
    }
    public boolean Equals(laptop that){
        if(this.model.equals(that.model) && this.price==that.price)
            return true;
        
        else
            return false;
        
    }
    
}       

public class objclass {
    // public static void main(String[] args) {
    // laptop obj = new laptop ();
    // obj.model = "hp";
    // obj.price = "50000";
    // System.out.println(obj.toString());
    // }

    public static void main(String[] args) {
        laptop obj = new laptop ();
        obj.model = "hp";
        obj.price = 50000;
        laptop obj2 = new laptop ();
        obj2.model = "hp";
        obj2.price = 50000;
        System.out.println(obj.Equals(obj2));
       
    }
}
