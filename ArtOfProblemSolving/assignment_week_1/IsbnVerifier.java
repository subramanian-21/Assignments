package ArtOfProblemSolving.assignment_week_1;

class IsbnVerifier {

    boolean isValid(String str) {
       //  d₁ * 10 + d₂ * 9 + d₃ * 8 + d₄ * 7 + d₅ * 6 + d₆ * 5 + d₇ * 4 + d₈ * 3 + d₉ * 2 + d₁₀ * 1
        int nCount  = 0;
        
        int n = str.length();
        if(n == 0) return false;
        for(int i = 0;i<n;i++){
            if(Character.isDigit(str.charAt(i)) || str.charAt(i) == 'X'){
                nCount++;
            }
        }
        if(nCount < 10) return false;
        int modN = nCount+1;
        int sum = 0;
        for(int i = 0;i<n;i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                int num = Integer.parseInt(""+ch);
                sum += num*nCount;
                nCount--;
            }else if ( ch == 'X'){
                sum+= 10*nCount;
            }else if(ch != '-'){
                return false;
            }
        }
        
        return sum%modN == 0;
    }

}
