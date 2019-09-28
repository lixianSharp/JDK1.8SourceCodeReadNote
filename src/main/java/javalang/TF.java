package javalang;

import java.util.List;

/**
 * @Aauthor xianyuan_li@qq.com
 * @Date: Create in 17:41 2019/6/18
 * @Description:
 */
public  class TF  extends Parent{
    public static int B=A;

    public static void main(String[] args) {
        System.out.println(TF.B);
    }
}

 class Parent{
     public static int A=1;
    static{
         A=2;
        System.out.println(A);
    }

}