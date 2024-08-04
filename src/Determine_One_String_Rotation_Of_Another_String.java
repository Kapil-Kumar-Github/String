public class Determine_One_String_Rotation_Of_Another_String {
   // static boolean flag = false ;
     public static boolean is_Rotation_String(String s1 ,String s2){


        if(s1.length() != s2.length()){
            return false ;
        }
        else{
            String s3 = s1 + s1 ;

            for(int i = 0 ; i<s3.length()-s2.length() ; i++){
               if(s3.substring(i, s2.length()+i).equals(s2)) {
                  // flag = true;
                   return true  ;
               }

            }

        }
        return false;
    }

    public static void main(String [] args){

        String s1 = "abcde" ;
        String s2 = "cdeab" ;

        //System.out.println(s1.substring(0,2)) ;
        System.out.println("String s1 be " + s1) ;
        System.out.println("String s2 be " + s2) ;

        if(is_Rotation_String(s1, s2) == false) {
            System.out.println("No, String "+ s2 + " is not the rotation of string " + s1);

        }
        else{
            System.out.println("Yes, String "+ s2 + " is rotation of string "+ s1) ;
        }


        // SHORT CUT METHOD
        String a = "kapil" ;
        String b = "lkapi" ;
        String concat = a.concat(a) ;




        if(concat.indexOf(b) != -1){
            System.out.println("Yes, String "+b + " is rotation of string "+ a) ;

        }
        else{
            System.out.println("No ,String "+b + " is not the rotation of string "+a) ;
        }


    }
}
