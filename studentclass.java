class student{
    int roll;
    String name ;
    int marks;


}

public class studentclass {
    public static void main(String[] args) {
        System.out.println("This is Student class array");

    student s1 = new student();
    s1.marks =100;
    s1.roll = 1;
    s1.name = "Shan";

    student s2 = new student();
    s2.marks =99;
    s2.roll = 2;
    s2.name = "Moumita";

    student s3 = new student();
    s3.marks =10;
    s3.roll = 99;
    s3.name = "unknown";

    student arr[] = new student[3];
    arr[0]= s1;
    arr[1]= s2;
    arr[2]= s3;

    for (int i=0; i< arr.length;i++){
        System.out.println(arr[i].name +" " + arr[i].roll +" " + arr[i].marks);
    }
        System.out.println(" ");
    for (student stud : arr){ //enhanched loop
        System.out.println(stud.name +" " + stud.roll +" " + stud.marks);

    }

    //enhanched for loop ; Only used for array type data Types

    int num[] = new int[3];
    num[0] = 2;
    num[1]=3;
    num[2]=4;
    for (int n : num){
        System.out.println(n);
    }







    }
}
