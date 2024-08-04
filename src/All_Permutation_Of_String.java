public class All_Permutation_Of_String {
    static int m = 0;

    static String swap(String s  , int i , int j){

        char []c = s.toCharArray() ;

        char ch = c[i] ;
        c[i] = c[j] ;

        c[j] = ch ;

        return String.valueOf(c) ;
    }

    static void permutation(String  n, int start , int end ){
        if(start==end-1){
            System.out.println(n) ;
        }
        else{
            for(int i = start; i<end ; i++) {

                n = swap(n, start, i);

                permutation(n,start+1 , end);
                n = swap(n , start, i) ;
            }

        }
          



    }
    public static void main(String [] args){
        String s = "abc" ;
       // System.out.print( permutation(s , 0, s.length()) ) ;

       // System.out.println(swap("abc" , 0 , 1)  );
        permutation("abc" , 0, 3);



    }
}
