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
        for(char c: word.toCharArray()) {
            index = c;
            if(current.getChildren()[index] == null) {
                current.getChildren()[index] = new TrieNode();
            }
            current = current.getChildren()[index];
        }
        current.isWord(true);
    }
    // Search for word
    public boolean search(String word) {
        TrieNode current = root;
        int index;
        for(char c: word.toCharArray()) {
            index = c;
            if(current.getChildren()[index] == null) {
                return false;
            }
            current = current.getChildren()[index];
        }
        return current.isWord();
    }

}
