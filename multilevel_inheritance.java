import java.util.*;

class one {
    public void method1 (){
        int i= 100;
        System.out.println(i);
    }
}
class two extends one {
    public void method2(){
        int j = 1000;
        System.out.println(j);
    }
}

class three extends two {
    public void method3(){
        int k =10000;
    System.out.println(k);
}
}
public class Solution {
    public static void main(String[] args) {
        three the = new three ();
        the.method1();
        the.method2();
        the.method3();
    }
}