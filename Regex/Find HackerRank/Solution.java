import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Pattern startPat = Pattern.compile("^hackerrank.*");
        Pattern endsPat = Pattern.compile(".*hackerrank$");
       
        String line;
        
        line = sc.nextLine();
        
        for(int i = 0; i < n; i++)
        {
            line = sc.nextLine();
            
            Matcher m1 = startPat.matcher(line);
            Matcher m2 = endsPat.matcher(line);
            
            if(m1.find() && m2.find())
            {
                System.out.println(0);
                continue;
            }
            
            m1 = startPat.matcher(line);
            
            if(m1.find())
            {
                System.out.println(1);
                continue;
            }
            
            m2 = endsPat.matcher(line);
            
            if(m2.find())
            {
                System.out.println(2);
                continue;
            }
            
            System.out.println(-1);
            
        }
    }
}
