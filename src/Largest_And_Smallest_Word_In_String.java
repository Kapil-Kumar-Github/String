public class Largest_And_Smallest_Word_In_String {
    public static void main(String[] args) {

        String str = "Hardships often prepare ordinary people for an extraordinary destiny";

        //str = str.toLowerCase() ;
        String[] string = str.split(" ");

       // System.out.println(string[1].length());
        System.out.println("String be :  " + str) ;
        String longest_word = "";
        String smallest_word = "";
        int max = 0;
        int min = 0;


        for (int i = 0; i < string.length; i++) {
            int count = string[i].length() ;
            max = Math.max(max,count) ;
            if(max== count ){
                longest_word = string[i] ;

            }
            else if(min == count){
                smallest_word = string[i] ;
            }



        }

        System.out.println("Longest word in a string be " + longest_word) ;
        System.out.println("Smallest word in a string be " + smallest_word) ;
    }
}
