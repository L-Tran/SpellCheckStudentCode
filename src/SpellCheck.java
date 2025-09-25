import java.util.ArrayList;

/**
 * Spell Check
 * A puzzle written by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: Logan Tran
 * */

public class SpellCheck {


    /**
     * checkWords finds all words in text that are not present in dictionary
     *
     * @param text The list of all words in the text.
     * @param dictionary The list of all accepted words.
     * @return String[] of all mispelled words in the order they appear in text. No duplicates.
     */
    public String[] checkWords(String[] text, String[] dictionary) {


        // Loop through text
        ArrayList<String> misspelled = new ArrayList<>();
        int low = 0;
        int high = dictionary.length - 1;
        for(String word: text) {
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (word.equals(dictionary[mid])) {
                    break;
                }

                else if(word < dictionary[mid]) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
            misspelled.add(word);
        }
        String[] misspelledWords =
        for(String s: misspelled) {

        }
        return null;
    }
}
