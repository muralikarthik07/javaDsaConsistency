package Strings;

public class eachFirstletterUpperCase {
    
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        
        for(int i = 1; i<str.length(); i++){
            if(str.charAt(i)== ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String str = "hii, i am karthik";
        System.out.println(toUpperCase(str));

    }
}
