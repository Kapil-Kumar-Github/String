public class Remove_All_White_Spaces_From_String {

    public static void main(String [] args){
        String s ="k a p il " ;

        char []a = new char[s.length()] ;
        int whitespaces = 0 ;
        int temp = 0 ;

        for(int i = 0; i<s.length() ; i++){

            if(s.charAt(i) == ' '){
                whitespaces++ ;

            }
            else{
                a[temp] = s.charAt(i) ;
                temp++ ;
            }
        }
        //System.out.println(s);
        String newStr = "" ;
       // System.out.println(a[0]) ;


        for(int i = 0; i<a.length-whitespaces ; i++){
            newStr = newStr + String.valueOf(a[i]) ;

        }
        System.out.println(newStr) ;
    }
}
