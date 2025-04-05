import java.util.*;
public class minimumnobrackets {
    public static int howmany(String str){
        Stack<Character> st = new Stack<>();
        Stack<Character> rt = new Stack<>();
        int n = str.length();
        for(int i =0 ; i<n ; i++){
            char ch = str.charAt(i);
            if(ch == '(') st.push(ch);
            if(ch == ')') rt.push(ch);
        }
        int a = st.size();
        int b = rt.size();
        if(a == b) return 0;
        else return Math.abs(a-b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("required no. of brackets to be removed to balance the brackets :" +howmany(str));
    }
    
}
