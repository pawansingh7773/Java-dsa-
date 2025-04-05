import java.util.*;
public class bracketstry {
    public static boolean balanced(String str){
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for(int i = 0; i < n; i++){
            char ch = str.charAt(i);
            if(ch == '(') st.push(ch);
            if(st.size() == 0) return false;
            if(ch == ')') st.pop();
            
        }
        if(st.size() == 0) return true;
        else return false;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(balanced(str));
        
    }
    
}
