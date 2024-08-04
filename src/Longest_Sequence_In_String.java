public class Longest_Sequence_In_String {

    static String longest_Sequence(String s1 , String s2){
        int a = Math.min(s1.length(), s2.length()) ;

        for(int i = 0; i<a ; i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return (s1.substring(0,i)) ;
            }
        }
        return(s1.substring(0,a)) ;
    }
    public static void main(String [] args){
        String s= "kapilka" ;

        String emp = "" ;
        String seq = "" ;
        int max = 0 ;


        for(int i = 0; i<s.length() ; i++){

            for(int j = (i+1) ; j<s.length() ; j++){

                 seq = longest_Sequence(s.substring(i,s.length()),s.substring(j,s.length())) ;
                if(seq.length() > emp.length()){
                    emp = seq ;
                    max = seq.length() ;



                }
            }

        }

        System.out.println("Longest repeating sequence in string be "+emp+ " of length  " + max);
    }
}
