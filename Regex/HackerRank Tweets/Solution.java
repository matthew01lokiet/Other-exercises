import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       
       String line = sc.nextLine();
       
       Pattern validation = Pattern.compile("(?i).*hackerrank.*");
       
       int total = 0;
       
       for(int i = 0; i < n; i++)
       {
           line = sc.nextLine();
           
           Matcher m = validation.matcher(line);
           
           if(m.find())
                total++;
            
       }
       
       System.out.println(total);
        
    }
}
