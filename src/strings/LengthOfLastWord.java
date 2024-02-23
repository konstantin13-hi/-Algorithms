package strings;

public class LengthOfLastWord {


    public int lengthOfLastWord(String s) {
        int result = 0;
        int firstLetter = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                firstLetter++;
            }
            if (firstLetter != 0) {
                if (s.charAt(i) == ' ') {
                    break;
                } else {
                    result++;
                }
            }
        }


        return result;

    }

    public static void main(String[] args) {


    }
}
