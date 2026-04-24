package org.APCSLowell;

// FRQ: https://secure-media.collegeboard.org/digitalServices/pdf/ap/ap16_frq_computer_science_a.pdf
public class RandomLetterChooser extends RandomStringChooser {
    public RandomLetterChooser(String letters) {
        super(toLetterArray(letters));
    }

    private static String[] toLetterArray(String letters) {
        String[] result = new String[letters.length()];
        for (int i = 0; i < letters.length(); i++) {
            result[i] = String.valueOf(letters.charAt(i));
        }
        return result;
    }
}