public class Individual_Characters_Of_String {
    public static void main(String [] args){

        String str = "characters" ;
        System.out.println("String be :" + str) ;
        System.out.println("Individual characters of string are  ") ;

        for(int i = 0 ; i<str.length() ; i++){
            System.out.print(str.charAt(i) +","+ " ") ;
        }
    }

}
