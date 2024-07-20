package ArtOfProblemSolving.assignment_week_1;
import java.util.List;
import java.util.ArrayList;
class DiamondPrinter {

    List<String> printToList(char a) {
       List<String> list = new ArrayList<>();
        char alp = 'A';
        int n = a-'A';
        int num = (2*n)+1;
        int s = n;
        int e = n;
        boolean flag = true;
        for(int i = 0;i<num;i++){
            String out = "";
            for(int j = 0;j<num;j++){
                if(j == s || j == e){
                    out+=""+alp;
                }else{
                    out+=" ";
                }
                if(i == n){
                    flag = false;
                }
            }
            
            list.add(out);
            if(flag){
              s--;e++;
                alp++;  
            }else{
               s++;e--;
                alp--;
            }
            
        }
        return list;
    }

}