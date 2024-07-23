public class Total_Numbers_Of_Characters_In_String {

    static int numbers_Of_Characters(String a){
        int space= 0;
        for(int i = 0; i<a.length() ; i++){
           if(a.charAt(i) == ' '){
               space++ ;

            }
        }


        return (a.length() - space) ;

    }
    public static void main(String[] args){
        String s = "Gulshan   chauhan" ;
        System.out.println("Numbers of characters in string be "+numbers_Of_Characters(s)) ;
        //System.out.println(s.length() ) ;


    }
}
