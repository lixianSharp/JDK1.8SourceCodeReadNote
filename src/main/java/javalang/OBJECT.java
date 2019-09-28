package javalang;

public class OBJECT implements Cloneable{

    private String s1 = "张三";


    public static void main(String[] args) {
      String a="123";
      change(a);
      System.out.println(a);
    }

    private static void change(String str){
        str = "dfg";
    }



}

//class Test implements Cloneable{
//
//}