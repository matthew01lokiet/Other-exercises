import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       
       String line = sc.nextLine();
       
       Pattern IPv4 = Pattern.compile("^([\\d]{1,3})\\.([\\d]{1,3})\\.([\\d]{1,3})\\.([\\d]{1,3})$");
       Pattern IPv6 = Pattern.compile("^[\\da-f]{1,4}:[\\da-f]{1,4}:[\\da-f]{1,4}:[\\da-f]{1,4}:[\\da-f]{1,4}:[\\da-f]{1,4}:[\\da-f]{1,4}:[\\da-f]{1,4}$");
       
       out:for(int i = 0; i < n; i++)
       {
           line = sc.nextLine();
           
           Matcher mIPv4 = IPv4.matcher(line);
           Matcher mIPv6 = IPv6.matcher(line);
           
           if(mIPv6.find())
                System.out.println("IPv6");
            else if(mIPv4.find())
            {
                int[] vals = { Integer.parseInt(mIPv4.group(1)), Integer.parseInt(mIPv4.group(2)),
                                Integer.parseInt(mIPv4.group(3)), Integer.parseInt(mIPv4.group(4)) };
                                
                for(int val : vals)
                {
                    if(val > 255 || val < 0)
                    {
                        System.out.println("Neither");
                        continue out;
                    }
                }
                
                System.out.println("IPv4");
            }
            else
                System.out.println("Neither");
            
       }
       
    }
}
