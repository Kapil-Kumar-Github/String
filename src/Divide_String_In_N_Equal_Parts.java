public class Divide_String_In_N_Equal_Parts {
    static String[] equal_Parts_Of_String(String a , int N){

        String arr[] = new String[N] ;

        if(a.length() % N != 0){
            return arr ;
        }
        else{

            int size = a.length() / N ;
            int temp = 0;
           // System.out.println("size be " + size) ;
           // System.out.
            for(int i = 0; i<a.length() ;i =(i+size) ) {
                arr[temp] = a.substring(i,i+size) ;
                //System.out.println("hii") ;
                temp = temp+1 ;
               // System.out.println("temp be " + temp) ;
            }


        }

       // }
        return arr ;
    }


    public static void main(String [] args){
        String s = "1234" ;
        //System.out.println(s.substring(0,4)) ;
        int N = 4 ;

        String  []c = equal_Parts_Of_String(s,N) ;

       // System.out.println(equal_Parts_Of_String(s,N)) ;
       // System.out.println(c[0]) ;
        System.out.println("String be " + s+ ".") ;

        if(c[0] != null){
            System.out.println("Equal bParts of string be "+ s+ " be ") ;
            for(int i = 0; i<c.length ; i++){

                System.out.print(c[i] + ", ") ;
            }


        }
        else{
            System.out.println("You can not divide the string in " + N +" equal parts") ;
        }



    }
}
