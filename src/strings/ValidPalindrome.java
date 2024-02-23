package strings;

public class ValidPalindrome {

    private static StringBuilder stringBuilder = new StringBuilder();


    public static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (
                    ((int) s.charAt(i) > 96 && (int) s.charAt(i) < 123) ||
                            ((int) s.charAt(i) > 64 && (int) s.charAt(i) < 91) ||
                            ((int) s.charAt(i) > 47 && (int) s.charAt(i) < 58)) {
                if ((int) s.charAt(i) < 97 && (int) s.charAt(i) > 64) {
                    stringBuilder.append(Character.toLowerCase(s.charAt(i)));
                } else {
                    stringBuilder.append(s.charAt(i));
                }

            }
        }

        int size = stringBuilder.length();
        for (int i = 0, j = size - 1; i < size / 2; i++, j--) {
            if (stringBuilder.charAt(i) != stringBuilder.charAt(j)) {
                return false;
            }
        }


        return true;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("00"));


    }
}
