public class wrapper {
    public static void main(String[] args) {
        int num = 10;
        Integer obj = num; //autoboxing
        System.out.println(obj);
        int num2 = obj; //unboxing
        System.out.println(num2);

        String str = "3";
        int num3 = Integer.parseInt(str);
        System.out.println(num3*2);


    }
}
