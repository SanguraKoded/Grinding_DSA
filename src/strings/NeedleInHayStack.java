package strings;

public class NeedleInHayStack {
    public static int needleInHaystack(String hay, String needle){
        if(needle.length()>hay.length()){
            return 0;
        }
        if(needle.length()==0){
            return 0;
        }
        for (int i = 0; i< hay.length()-needle.length(); i++){
            if(hay.charAt(i) != needle.charAt(0)){
                continue;
            }
            Boolean found = true;
            for(int j = 0; j<needle.length(); j++){
                if(hay.charAt(i+j) != needle.charAt(j)){
                    found = false;
                    break;
                }
                if(found) return i;
            }
        }
        return -1;


    }
    public static void main(String[] args) {
        System.out.println(needleInHaystack("sadbutsad", "sad"));
    }
}
