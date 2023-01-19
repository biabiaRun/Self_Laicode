package CLASS1_BASICS;

public class ReturnStatement {

    public static void main(String[] args) {
        count();
        System.out.println(foo()); //仅写foo()不能打印任何东西，要用sout才能打印出return里的东西

    }
    static void count() {
        int result  = 0;
        for (int i = 1; i < 3; i++) {
            result = i; //如果想在for loop外打印i,不可能，因为i仅在for loop里定义，出了loop就会失效；因此可在for loop外定义'result' to store 'i'
            return; //1) will excute once; 2)如果函数title写的是void,则不能写return 1or any number;
        }
        System.out.println("out of for loop");
        System.out.println("result is： " + result);
    }

    static int foo() {
        try {
            System.out.println("\n-------Inside try-------");
            int i = 11;
            return i; // This executes once
        }
        finally {
            System.out.println("Inside finally");
            return 33;

            /*
            i = 11没有被打印出来，为什么？
           In most cases (including this one), return will exit immediately. 
           However, if the return is in a try block with an accompanying finally block,
           the finally always executes and can "override" the return in the try.
            */

            /*
            Why finally Is Useful?
            We generally use the finally block to execute clean up code like closing connections,
            closing files, or freeing up threads, as it executes regardless of an exception.
            Note: try-with-resources can also be used to close resources instead of a finally block.
            reference: https://www.baeldung.com/java-finally-keyword#:~:text=What%20Is%20finally%3F,exception%20is%20thrown%20or%20caught.
             */
        }

    }
}