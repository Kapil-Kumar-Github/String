public class Reverse_A_String_Without_Reverse_Function {

    public static void main(String [] args){

        String str = "kapil my name" ;
        String rev = "";
        for(int i = str.length()-1 ; i>=0 ; i--){
            rev = rev + String.valueOf(str.charAt(i) );
        }
        System.out.println("String be: "+ str) ;
        System.out.println("Reverse of string be: "+rev) ;
    }
}
