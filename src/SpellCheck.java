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
        for(String word: text) {
            int low = 0;
            int high = dictionary.length - 1;
            boolean found = false;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                int compare = dictionary[mid].compareTo(word);
                if (compare == 0) {
                    found = true;
                    break;
                }

                else if(compare < 0) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
            if(!found && !misspelled.contains(word)) {
                misspelled.add(word);
            }
        }

        String[] misspelledWords = new String[misspelled.size()];
        for(int i = 0; i < misspelledWords.length; i++) {
            misspelledWords[i] = misspelled.get(i);
        }


        return misspelledWords;
    }
}
