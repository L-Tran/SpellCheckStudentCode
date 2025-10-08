public class TrieNode {
    // Instance variables
    private boolean isWord;
    private TrieNode[] children;

    // Constructor
    public TrieNode() {
        // Each node should have the extended Ascii amount of children for each case
        children = new TrieNode[256];
        isWord = false;
    }

    // Getters and setters
    public TrieNode[] getChildren() {
        return children;
    }

    public boolean isWord() {
        return isWord;
    }

    public void isWord(boolean word) {
        isWord = word;
    }
}
