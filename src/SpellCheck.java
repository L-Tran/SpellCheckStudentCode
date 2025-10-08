import java.util.ArrayList;

/**
 * Spell Check
 * A puzzle written by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
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

        // Create a Trie or TST for the dictionary
//        Trie dict = new Trie();
        TST dict = new TST();
        // For each word in the dictionary
        for(String word: dictionary) {
            // Insert it into the Trie
            dict.insert(word);
        }
        // Create a Trie or TST for the misspelled words & arraylist to keep track in the correct order
//        Trie misspelledTrie = new Trie();
        TST misspelledTST = new TST();
        ArrayList<String> misspelled = new ArrayList<>();
        // For each word in text:
        for(String word: text) {
            // If not in dictionary Trie/Tst and not in misspelled Trie/TST
            if(!dict.search(word) && !misspelledTST.search(word)) {
                // Add to misspelled Trie/TST and arraylist
                misspelledTST.insert(word);
                misspelled.add(word);
            }
        }
        // Turn arraylist into array and return
        return misspelled.toArray(new String[misspelled.size()]);
    }
}
