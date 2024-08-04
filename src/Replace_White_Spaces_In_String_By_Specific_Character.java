public class Replace_White_Spaces_In_String_By_Specific_Character {

    public static void main(String [] args){

        String s = "Once in blue moon" ;

        System.out.println(s) ;
        char ch = '-' ;
        s = s.replace(' ',ch) ;

       // System.out.println(s.replace(' ' ,ch)) ;
        System.out.println(s);
    }

}
