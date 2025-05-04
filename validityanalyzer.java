import java.util.*;
public class validityanalyzer {
    static int validity(String str){
        int n = str.length();
        Stack<Character> st = new Stack<>();
         int count = 0;
         
         
        for(int i =0 ; i<n ;i++){
            char ch = str.charAt(i);
            if(ch == '<'){
                st.push(ch);
               
            
            }else if(st.size()>0 && ch == '>'){
                st.pop();
                
               
               
                
            }else{
                count++;
                

            }
           
        }
        count += st.size();
        count = n-count;
        return count;
    }
    public static void main(String[] args) {
        String str = "<<>>";
        System.out.println(validity(str));
    }
    
}
