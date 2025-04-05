import java.util.*;
public class infix2 {
    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
        Stack<Integer> val = new Stack<>();
        Stack<Character> opr = new Stack<>();
        int n = str.length();
        for(int i =0 ; i <n ; i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57){
                val.push(ascii-48);
            }else if(opr.size() == 0 || ch == '(' || opr.peek() == '(') opr.push(ch);
            
            else if(ch == ')'){
                while(opr.peek()!= '('){
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if(opr.peek() == '+') val.push(v1+v2);
                    if(opr.peek()== '-') val.push(v1-v2);
                    if(opr.peek() == '*') val.push(v1*v2);
                    if(opr.peek()== '/') val.push(v1/v2);
                    opr.pop();


                }
                opr.pop();
            }else if(ch == '-' || ch == '+'){
                int v2 = val.pop();
                int v1 = val.pop();
                if(opr.peek() == '+') val.push(v1+v2);
                    if(opr.peek()== '-') val.push(v1-v2);
                    if(opr.peek() == '*') val.push(v1*v2);
                    if(opr.peek()== '/') val.push(v1/v2);
                
                opr.pop();
                    opr.push(ch);

            }else if(ch == '*' || ch == '/'){
                if(opr.peek() == '*' || opr.peek() == '/'){
                int v2 = val.pop();
                int v1 = val.pop();
                if(opr.peek() == '+') val.push(v1+v2);
                    if(opr.peek()== '-') val.push(v1-v2);
                    if(opr.peek() == '*') val.push(v1*v2);
                    if(opr.peek()== '/') val.push(v1/v2);
                
                
                
                opr.pop();
                opr.push(ch);

                }else opr.push(ch);
            }

        }
        while(val.size()>1){
                 int v2 = val.pop();
                int v1 = val.pop();
                if(opr.peek() == '+') val.push(v1+v2);
                    if(opr.peek()== '-') val.push(v1-v2);
                    if(opr.peek() == '*') val.push(v1*v2);
                    if(opr.peek()== '/') val.push(v1/v2);
                opr.pop();

        }
    
    System.out.println(val.peek());
    }
    
}
