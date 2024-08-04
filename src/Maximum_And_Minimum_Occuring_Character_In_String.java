public class Maximum_And_Minimum_Occuring_Character_In_String {
    public static void main(String [] args){
        String str = "abcdacceecd" ;

        int max = 1;
        int min = str.length();

        char max_char ='e' ;
        char min_char= 'y' ;


        for(int i = 0; i<str.length() ; i++){
            int temp = 1 ;

            for(int j = i+1 ; j<str.length() ; j++){

                if(str.charAt(i)== str.charAt(j)){
                    temp++ ;
                }
            }
            max = Math.max(temp , max) ;
            if(temp == max){
                max_char = str.charAt(i) ;
            }
            min =Math.min(temp , min) ;
            if(temp == min){
                min_char = str.charAt(i) ;
            }
        }
        System.out.println("Maximum and minimum occuring character in string "+str+" be "+max_char + " and " + min_char+ " respectively") ;


    }
}
