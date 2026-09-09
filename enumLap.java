enum laptop{
    DELL(1200),LENOVO(1000),HP(900),ASUS(),ACER(1000),MSI(1100),APPLE(1500);
    laptop(int price){
        this.pri=price;
        System.out.println("hello"+this.name());
    }
    private laptop(){
        this.pri=200;
    }
    private int pri;
    
    public int getPrice() {
        return pri;
    }

    public void setPrice(int price) {
        this.pri = price;
        
    }


}

public class enumLap {
    public static void main(String[] args) {
        // laptop l1 = laptop.DELL;
        // System.out.println("The price of "+l1+" is "+l1.getPrice());
        laptop [] l2 = laptop.values();
        for(laptop l:l2){
            System.out.println("The price of "+l+" is "+l.getPrice());
        }
        // for(int i =0; i<l2.length;i++){ #normal for loop
        //     System.out.println("The price of "+l2[i]+" is "+l2[i].getPrice());
        // }
        // laptop l3 = laptop.LENOVO;
        // l3.setPrice(1900);
        // System.out.println("The price of "+l3+" is "+l3.getPrice());
    }
    
}
