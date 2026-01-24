package gr.aueb.cf.cf9.ch7;

public class LetterCount {
    public static void main(String[] args) {

    }
    public static int getLettersCount(String s1){
    int count = 0;
    for (int i = 0; i < s1.length(); i++){
            if (s1.charAt(i) != ' ' && s1.charAt(i) != '\t'){
                count++;
            }
        }
    return count;
    }

    public static int getLettersCount2(String s1){
        return s1.replace(" ", "").replace("\t", "").length();
    }

    public static int letterCount(String s1, char letter){
        int count = 0;
        for (int i =0; i < s1.length(); i++){
            if (s1.charAt(i) == letter)
                count++;
        }
        return count;
    }
}
