import java.util.* ;
public class All_Subset_Of_String_Using_CheckBit_Function {

    static List<String> get_Sub_Sequence(String s ){
        List<String> list = new ArrayList<>() ;
        int n = s.length() ;

        for(int i = 0; i<(1<<n) ; i++){

            StringBuilder ss = new StringBuilder() ;

            for(int j = 0; j<n ;j++){
                if((i & (1<<j)) != 0){
                    ss.append(s.charAt(j)) ;

                }
            }
            list.add(ss.toString()) ;

        }
        return list ;

    }

    public static void main(String [] args){

        String s = "Kapil" ;

        List<String> get = get_Sub_Sequence(s) ;
        System.out.println(get) ;




    }
}
