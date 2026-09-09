enum status{
    PENDING,RUNNING,COMPLETED,DELETED,FAILED;

    
}

public class caseifInennum {
    public static void main(String[] args) {
        status s1 = status.FAILED;
    //    if(s1==status.PENDING){
    //        System.out.println("The status is pending");
    //    }
    //    else if(s1==status.RUNNING){
    //        System.out.println("The status is running");
    //    }
    //    else if(s1==status.COMPLETED){
    //        System.out.println("The status is completed");
    //    }
    //    else if(s1==status.DELETED){
    //        System.out.println("The status is deleted");
    //    }
    //    else if(s1==status.FAILED){
    //        System.out.println("The status is failed");
    //    }

       switch(s1){
           case PENDING:
               System.out.println("The status is pending");
               break;
           case RUNNING:
               System.out.println("The status is running");
               break;
           case COMPLETED:
               System.out.println("The status is completed");
               break;
           case DELETED:
               System.out.println("The status is deleted");
               break;
           
               default:
                  System.out.println("The status is failed");
                   break;
       }
       
       
    }
    
}
