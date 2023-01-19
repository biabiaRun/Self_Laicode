package CLASS1_BASICS;

public class Scope {
    public static void main(String[] args) {
        Test test = new Test();
        //System.out.println("Class variable: " + Test.flag_2);
        System.out.println("Member variable: " + test.flag);
        test.score();
        //runTest();
    }
    void runTest() {
        System.out.println("I am in runTest method - main function - Scratch class");
    }
}
class Test {
    boolean flag;
    void score() {
        //static boolean flag_2;
        System.out.println("I am in test method - Test Class");
    }
}

