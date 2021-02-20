import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       
       String line = sc.nextLine();
       
       Pattern validation = Pattern.compile("^[1-9][\\d]+ (C|CPP|JAVA|PYTHON|PERL|PHP|RUBY|CSHARP|HASKELL|CLOJURE|BASH|SCALA|ERLANG|CLISP|LUA|BRAINFUCK|JAVASCRIPT|GO|D|OCAML|R|PASCAL|SBCL|DART|GROOVY|OBJECTIVEC)$");
       
       for(int i = 0; i < n; i++)
       {
           line = sc.nextLine();
           
           Matcher m = validation.matcher(line);
           
           if(m.find())
                 System.out.println("VALID");
           else
                 System.out.println("INVALID");
            
       }
        
    }
}
