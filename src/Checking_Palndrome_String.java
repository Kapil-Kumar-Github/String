public class Checking_Palndrome_String {
    static boolean check_Palindrome(String s){
        s = s.toLowerCase() ;
        int len = s.length() ;

        for(int i = 0 ; i<len ; i++){
            if(s.charAt(i) != s.charAt(len-1-i)){
                return false ;
            }




        }
        return true ;
    }

    public static void main(String [] args){

        String s = "Kaakkak" ;

        if(check_Palindrome(s)==true){
            System.out.println("Palindrome string ");
        }
        else{
            System.out.println("Not palindrome string ") ;
        }
    }
}
