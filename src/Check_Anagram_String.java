import java.util.Scanner;
public class Check_Anagram_String {
    static boolean check_Anagram(String a){
        boolean temp = true ;

        for(int i = 0; i<a.length()/2 ; i++){

            if(a.charAt(i) != a.charAt(a.length()-1-i) ){
                temp = false ;
                return temp ;
            }
        }
        return temp ;

    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Type String ") ;

        String s = sc.nextLine() ;

        if(check_Anagram(s.toLowerCase())== true) {
            System.out.println("Anagram String ");
        }
        else{
            System.out.println("Not Anagram String ") ;
        }


    }
}
