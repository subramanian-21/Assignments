package ArtOfProblemSolving.assignment_week_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class ProteinTranslation {

    List<String> translate(String rnaSequence) {
        List<String> out = new ArrayList<>();
        Map<String, String> data = new HashMap<>();
        data.put("AUG","Methionine");
        
        data.put("UUU","Phenylalanine");
        data.put("UUC","Phenylalanine");
        
        data.put("UUA","Leucine");
        data.put("UUG","Leucine");
        
        data.put("UCU","Serine");
        data.put("UCC","Serine");
        data.put("UCA","Serine");
        data.put("UCG","Serine");  
        
        data.put("UAU","Tyrosine");
        data.put("UAC","Tyrosine");
        
        data.put("UGU","Cysteine");
        data.put("UGC","Cysteine");
        
        data.put("UGG","Tryptophan");
        
        data.put("UAA","STOP");
        data.put("UAG","STOP");
        data.put("UGA","STOP");
        
        for(int i = 0;i<rnaSequence.length();i+=3){
        if(i+3 <= rnaSequence.length()){
              String substr = rnaSequence.substring(i,i+3);
            if(data.containsKey(substr)){
                String protein = data.get(substr);
                if(protein.equals("STOP")) break;
                out.add(protein);
            }else{
                throw new IllegalArgumentException("Invalid codon");
            }
        }else {
             throw new IllegalArgumentException("Invalid codon");
        }
        }   
        return out;
       
    }
}
