package strings;

public class LongestPrefix {
    public static String longestPrefix(String [] words){
        if(words.length==0 || words==null){
            return "";
        }
        String prefix = words[0];
        for(int i = 1; i<words.length; i++){
            if(prefix==""){
                return "";
            }
            String tempString = "";
            int searchSize = Math.min(prefix.length(), words[i].length());
            for(int j = 0; j<searchSize; j++){
                if(prefix.charAt(j) != words[i].charAt(j)){
                    break;
                }
                tempString += prefix.charAt(j);
            }
            prefix=tempString;
        }
        return prefix;
    }
    public static void main(String[] args) {
        System.out.println(longestPrefix(new String []{"flower","flow","flight"}));
    }

}
