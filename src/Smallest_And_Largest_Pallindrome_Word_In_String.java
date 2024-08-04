public class Smallest_And_Largest_Pallindrome_Word_In_String {
    static boolean is_pallindrome(String s){
        String ss = "" ;

        for(int i = s.length()-1;i>=0  ; i--){
            ss = ss + s.charAt(i) ;
        }
        if(ss.equals(s)){
            return true ;
        }
        else{
            return false ;
        }

    }
    public static void main(String [] args){

        String str = "W0w you own kayak" ;
        str = str.toLowerCase() ;


        String []string = str.split(" ") ;

        String  small_pallin = "" ;
        String big_pallin = "" ;
       // System.out.println(is_pallindrome("kaka")) ;
        int max = 0 ;
        int min = 1000 ;


        for(int i = 0 ; i<string.length ; i++){

            if(is_pallindrome(string[i]) == true){
                max = Math.max(max,string[i].length()) ;
                min = Math.min(min, string[i].length()) ;
                if(max == string[i].length()){
                    big_pallin = string[i] ;

                }
                 if(min == string[i].length()){
                    small_pallin = string[i] ;
                }



            }

        }
        System.out.println("Largest pallindrome word in string be " + big_pallin) ;
        System.out.println("smallest pallindrome word in a string be "+small_pallin) ;


    }
}
