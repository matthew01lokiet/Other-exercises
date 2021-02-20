import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Pattern pattern = Pattern.compile("([\\d]{1,3})([\\-\\s])([\\d]{1,3})\\2([\\d]{4,10})");
       
        String tel;
        
        for(int i = 0; i <= n; i++)
        {
            tel = sc.nextLine();
            Matcher m = pattern.matcher(tel);
            
            
            if(m.find())
                System.out.println("CountryCode=" + m.group(1) + ",LocalAreaCode=" + m.group(3) + ",Number=" + m.group(4));
        }
        
    }
}



//
