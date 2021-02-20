import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       
       
       Pattern question = Pattern.compile("/questions/([\\d]*)/");
       Pattern questionTitl = Pattern.compile("class=\"question-hyperlink\">(.*)</a");
       Pattern time = Pattern.compile("class=\"relativetime\">(.*)</span");
       
       int total = 0;
       
       String line;
       
       while(sc.hasNextLine())
       {
           line = sc.nextLine();
           
           Matcher mQue = question.matcher(line);
           Matcher mQueTitl = questionTitl.matcher(line);
           Matcher mTim = time.matcher(line);
           
           if(mQue.find() && mQueTitl.find())
                System.out.print(mQue.group(1) + ";" + mQueTitl.group(1) + ";");
           else if(mTim.find())
                System.out.println(mTim.group(1));     
            
                
            
       }
        
    }
}
