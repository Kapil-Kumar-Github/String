public class Reversing_a_String {


    public static void main(String[] args){
        String str = "kapil" ;

       System.out.println( Reversing_String(str) ) ;

    }
    static String rev = "" ;

    public static String Reversing_String(String a){

        for(int i = a.length()-1 ; i>=0 ; i--) {


            rev = rev +String.valueOf(a.charAt(i)) ;
        }

        return rev ;



    }
}
