public class Frequency_Of_Characters {
    public static void main(String [] args){

        String str = "picture perfect  " ;

        str = str.toLowerCase() ;
        str = str.replace(" " , "") ;
        System.out.println("String be " + str) ;


        char []string = str.toCharArray() ;

        System.out.println("Frequency of characters of string  be ") ;


        for(int i = 0 ; i<string.length ; i++){
            int count = 1 ;

            for(int j = i+1 ; j<string.length ; j++){

                if(string[i] == string [j] ){
                    count ++ ;
                    string[j] = '0' ;

                }
            }
            if(string[i]!= '0'){
                System.out.println(string[i] + " - " + count) ;
            }
        }

    }
}
