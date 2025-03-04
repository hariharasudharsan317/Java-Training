import java.util.*;
import java.io.*;

public class Reverse_the_sentence {
    public static void main(String[] args) {
       String s =" Sudharsan    hara hari";
       String [] t = s.split("\\s+");
       StringBuilder m = new StringBuilder();
       for (int i= t.length-1; i>=0;i--){
        m.append(t[i]);
        if(i!=0) m.append(" ");
       } 
       System.out.println(m.toString());
    }
}
    