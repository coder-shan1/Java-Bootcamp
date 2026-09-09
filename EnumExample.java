enum status{
    PENDING,RUNNING,COMPLETED,DELETED,FAILED;
}


public class EnumExample {
    public static void main(String[] args) {
        status s1 = status.PENDING;
        System.out.println(s1);
        status []s2 = status.values();

        // for(status s3:s2){
        //     System.out.println(s3); #advanced for loop
        // }
        
        for(int i=0;i<s2.length;i++){
            System.out.println(s2[i] +" " + s2[i].ordinal());
        }
     
        status s4 = status.COMPLETED;
        System.out.println(s4.ordinal());
       
        
    }
}