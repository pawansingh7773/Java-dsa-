public class validpalimdrome2 {
    static boolean ispalindrome(String str){
        
        int n = str.length();
        int i =0 , j = n-1;
        str.
        
        while(i<=j){
            char st = str.charAt(i);
            char lt = str.charAt(j);
            if(!Character.isLetterOrDigit(st)){
                i++;
            }else if(!Character.isLetterOrDigit(lt)){
                j--;
            }else{
                if(Character.toLowerCase(st) != Character.toLowerCase(lt)){
                    return false;
                }
                i++;
                j--;
            }

        }
        return true;
            
    }

public static void main(String[] args) {
    String str = "race a car";
    System.out.println(ispalindrome(str));
}







    
}
