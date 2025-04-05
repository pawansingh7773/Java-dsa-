public class reversestring {
    public static void displayrev(String s , int idx){
        if(idx == s.length()) return;
        displayrev(s, idx+1);
        System.out.print(s.charAt(idx));


    }
    public static void main(String[] args) {
        String s = "pawan";
        displayrev(s, 0);
    }
    
}
