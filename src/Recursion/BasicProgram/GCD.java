package Recursion.BasicProgram;

public class GCD {
    public static int gcd(int x, int y){
        if(y==0){
            return x;
        }
        int result=gcd(y, x%y);
        return result;
    }

    static void main() {
        System.out.println(gcd(12,16));
    }
}
