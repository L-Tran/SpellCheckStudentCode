public class Trie {
    // Instance variables
    private final TrieNode root;

    // Constructor
    public Trie() {
        root = new TrieNode();
    }

    // Insert word
    public void insert(String word) {
        TrieNode current = root;
        int index;
        // For each letter in word being inserted
        for(char c: word.toCharArray()) {
            // Index is the place in extended Ascii
            index = c;
            // If there is no node at the value
            if(current.getChildren()[index] == null) {
                // Add a node for the letter
                current.getChildren()[index] = new TrieNode();
            }
            // Increment current to the new child
            current = current.getChildren()[index];
        }
        // After word is added set last node to indicate a word
        current.isWord(true);
    }

    // Search for word
    public boolean search(String word) {
        TrieNode current = root;
        int index;
        // For each letter in word being inserted
        for(char c: word.toCharArray()) {
            // Index is the place in extended Ascii
            index = c;
            // If there is no node at the value
            if(current.getChildren()[index] == null) {
                // There is no word that matches
                return false;
            }
            // Increment current to the child with the letter
            current = current.getChildren()[index];
        }
        // If it reaches the end of the word checked, return if the word is a word by checking last node
        return current.isWord();
    }

}
