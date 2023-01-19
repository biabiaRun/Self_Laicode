package CLASS1_BASICS;

public class PrimitiveType {
    public static void main(String[] arg) {
        /**********************
        Number类型习题
         *********************/
        double a = 5;
        int b = (int)1.9;
        int c = -5/3;
//        System.out.println("a is: " + a); //不需要写成5.0也能返回5.0
//        System.out.println("b is: " + b); //去掉小数部分，跟int/int原理一样
//        System.out.println("c is: " + c);



        int j1, j2, i1 = 1, i2 = 1;
        j1 = i1++;
        j2 = ++i2;
//        System.out.println("j1 is: " + j1 + "| j2 is: " + j2);


        /**********************
         非Number类型习题
         *********************/
        char p = 97;
        char q = (char)(p + 1);
//        System.out.println("p is:" + p); //a
//        System.out.println("p + 1 is: " + q); //b


        int x = 1;
        double y = x;
//        System.out.println("x = " + x + "; y = " + y);
//        System.out.println(1 + 2 + "age" + 4);


        char aa = '3' + 3;
        int ab = (int)'3';
        int bb = '3' + 3;
//        System.out.println('3' + 3 + 4 + "!"); //58!
//        //解析如下
//        System.out.println("type char aa: " + aa); //6
//        System.out.println("type int ab: " + ab); //51
//        System.out.println("type int bb: " + bb); //54






    }
}

