import java.util.*;

public class Substring {
    public static void main(String[] args) {
                // Using String object
                Scanner s = new Scanner (System.in);
                String a = s.nextLine();
                 // 
                System.out.println("Substring from String: " +  a.substring(7, 12));
        
                // Using StringBuilder object
               
                String ab = s.nextLine();
                 
                System.out.println("Substring from StringBuilder: " +ab.substring(5, 12));
        
                // Using StringBuffer object
            
                String abc = s.nextLine();
                
                System.out.println("Substring from StringBuffer: " +abc.substring(6, 10));
                s.close();
            }

        }