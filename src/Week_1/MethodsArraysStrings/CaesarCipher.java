package src.Week_1.MethodsArraysStrings;

public class CaesarCipher {
    public String encode(String text, int shift) {
        String res = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                char shifted = (char) ((c - base + shift) % 26 + base);
                res += shifted;
            } else {
                res += c;
            }
        }
        return res;
    }
}
