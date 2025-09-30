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

        // Create a Trie for the dictionary
        Trie dict = new Trie();
        // For each word in the dictionary
        for(String word: dictionary) {
            // Insert it into the Trie
            dict.insert(word);
        }
        // Create a Trie for the misspelled words
        Trie misspelledTrie = new Trie();
        ArrayList<String> misspelled = new ArrayList<>();
        // For each word in text:
        for(String word: text) {
            // If not in dictionary Trie and not in misspelled Trie
            if(!dict.search(word) && !misspelledTrie.search(word)) {
                // Add to misspelled Trie
                misspelledTrie.insert(word);
                misspelled.add(word);
            }
        }
        return misspelled.toArray(new String[misspelled.size()]);
    }
}
