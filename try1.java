import java.util.*;
public class try1 {
    public static int min1(String str){
        int n = str.length();
        Stack<Character> st = new Stack<>();
        for(int i =0 ; i  < n ; i++){
        char ch = str.charAt(i);
            if( ch == '('){
                st.push(ch);

            }else{
                st.pop();
            }
            
        }
        int m = st.size();
        return m;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("minimum no,using one stack :" +min1(str));
    }
    
}
