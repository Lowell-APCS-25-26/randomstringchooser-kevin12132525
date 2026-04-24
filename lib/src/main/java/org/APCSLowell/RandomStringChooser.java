package org.APCSLowell;

// FRQ: https://secure-media.collegeboard.org/digitalServices/pdf/ap/ap16_frq_computer_science_a.pdf
public class RandomStringChooser {
    private String[] myWords;
    private int numLeft;

    public RandomStringChooser(String[] words) {
        myWords = new String[words.length];
        System.arraycopy(words, 0, myWords, 0, words.length);
        numLeft = words.length;
    }

    public String getNext() {
        if (numLeft == 0) {
            return "NONE";
        }
        int index = (int) (Math.random() * numLeft);
        String result = myWords[index];
        myWords[index] = myWords[numLeft - 1];
        numLeft--;
        return result;
    }
}
