public class Reverse_A_String_Word_By_Word {

    public static String reverse(String s){
        if(s.isEmpty()){
            return s ;
        }
        return reverse(s.substring(1)) + s.charAt(0  ) ;
    }
    public static String reverseString(String s)
    {
        if (s.isEmpty())                            //checks the string if empty
            return s;
        return reverseString(s.substring(1)) + s.charAt(0);                     //recursively called function
    }

    public static void main(String [] args){


        String s = "My name is kapil" ;
        System.out.println(reverseString(s)) ;
        System.out.println(reverse(s)) ;
    }
}
