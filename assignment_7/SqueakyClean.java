
class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder sb = new StringBuilder(identifier);

        for(int i = 0;i<sb.length();i++){
            char ch = sb.charAt(i);
            if(ch == ' '){
                sb.setCharAt(i,'_');
            }else if(ch == '-'){
                char upCh = Character.toUpperCase(sb.charAt(i+1));
                sb.replace(i,i+2,""+upCh);
            }else if(Character.isDigit(ch)){
                switch(ch){
                    case '4': sb.setCharAt(i,'a');break;
                    case '3': sb.setCharAt(i,'e');break;
                    case '0': sb.setCharAt(i,'o');break;
                    case '1': sb.setCharAt(i,'l');break;
                    case '7': sb.setCharAt(i,'t');break;
                }
            }
            else if (!Character.isDigit(ch) && !Character.isLetter(ch)){
                sb.replace(i,i+1,"");
                i--;
            }
        }
        return sb.toString();
    }
}
