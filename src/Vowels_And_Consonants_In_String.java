import java.util.Scanner;
public class Vowels_And_Consonants_In_String {
    public static int[] vowels_And_Consonants(String s ){

        int vowels = 0;
        int consonants = 0;
        int space= 0 ;

        for(int i = 0; i<s.length() ; i++){
            if(s.charAt(i) == 'a' ||s.charAt(i) == 'e' ||s.charAt(i) == 'i' ||s.charAt(i) == 'o' ||s.charAt(i) == 'u' ){
                vowels++ ;

            }
            else if(s.charAt(i) == ' '){
                 space++ ;
            }
            else{
                consonants++ ;
            }
        }
        return new int []{vowels, consonants,space} ;


    }

    public static void main(String [] args){

        Scanner sc= new Scanner(System.in) ;
        System.out.println("Type your String ") ;
        String s = sc.nextLine().toLowerCase();

        int a[] = vowels_And_Consonants(s) ;

        System.out.println("Vowels in string are " + a[0]+ " ,consonants in string are " + a[1] + " ,Space be " + a[2]) ;

    }
}
