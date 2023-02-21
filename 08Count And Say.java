import java.io.*;
import java.util.*; 

class Main{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(read.readLine());
        
        Solution ob = new Solution();
        
        System.out.println(ob.countandsay(n));
    } 
} 
class Solution
{
    public String countandsay(int n) {
        //Write code here
		if (n == 1)
            return "1";
        if (n == 2)
            return "11";
    
        String result = countandsay(n-1);
        
        String newresult = "";
        int count = 1;
        for(int i = 1; i < result.length(); ++i){
            
            if(result.charAt(i)!=result.charAt(i-1)){
                newresult+=(char)('0'+count);
                newresult+=(char)(result.charAt(i-1));
                count = 1;
            }
            else
                count++;

            if(i == result.length()-1){
                newresult+=(char)('0'+count);
                newresult+=(char)(result.charAt(i));
            }
        }
        return newresult;
    }   
}
