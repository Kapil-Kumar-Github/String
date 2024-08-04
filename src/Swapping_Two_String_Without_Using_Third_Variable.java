public class Swapping_Two_String_Without_Using_Third_Variable {

    public static void main(String [] args){

        String s1 = "kapil" ;
        String s2 = "Gulshan" ;
        System.out.println("s1 be "+ s1) ;
        System.out.println("s2 be " + s2) ;

        s1 = s1+s2 ;

     //  System.out.print(s1) ;
       System.out.println();


       s2 = s1.substring(0,(s1.length()-s2.length())) ;
       System.out.println("s2 be "+s2);
        s1 = s1.substring(s2.length());
        System.out.println("s1 be " +s1) ;

    }
}
