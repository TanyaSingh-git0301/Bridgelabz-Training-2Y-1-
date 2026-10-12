package Recursion.BasicProgram;

public class Demo1 {
    public static void function1(){
        int x=1;
        function2();
        System.out.println(x);
    }
    public static void function2(){
        int x=2;
        function3();
        System.out.println(x);
    }
    public static void function3(){
        int x=3;
        System.out.println(x);
    }

    static void main() {
        function1();
    }
}
