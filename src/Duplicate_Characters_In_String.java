public class Duplicate_Characters_In_String {

    public static void main(String [] args){

        String str = "abbbccccabavcccddsssbsbsdfdd" ;

        System.out.println("Duplicate characters of string " +  str +" are ") ;

        for(int i = 0; i<str.length() ; i++){

            int visited = -1 ;

            for(int j = 0 ; j<i ; j++){
                if(str.charAt(i) == str.charAt(j)){
                    visited = 1 ;
                }
            }
            if(visited == -1){
                for(int z = i+1 ; z<str.length() ;z++ ){
                    if(str.charAt(i)==str.charAt(z) ){
                        System.out.print(str.charAt(i) + " ") ;
                       break ;
                    }
                }
            }
        }
    }
}
