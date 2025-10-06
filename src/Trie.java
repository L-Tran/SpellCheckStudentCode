public class Trie {
    // Instance variables
    private TrieNode root;

    // Constructor
    public Trie() {
        root = new TrieNode();
    }

    // Insert word
    public void insert(String word) {
        TrieNode current = root;
        for(char c: word.toCharArray()) {
            int index;
            if(c == '\'') {
                index = 26;
            }
            else if (c >= 'a' && c <= 'z') {
                index = c - 'a';
            }
            else {
                continue;
            }
            if(current.getChildren()[index] == null) {
                current.getChildren()[index] = new TrieNode();
            }
            current = current.getChildren()[index];
        }
        current.setWord(true);
    }
    // Search for word
    public boolean search(String word) {
        TrieNode current = root;
        for(char c: word.toCharArray()) {
            int index;
            if(c == '\'') {
                index = 26;
            }
            else if (c >= 'a' && c <= 'z') {
                index = c - 'a';
            }
            else {
                return false;
            }
            if(current.getChildren()[index] == null) {
                return false;
            }
            current = current.getChildren()[index];
        }
        return current.isWord();
    }

}
