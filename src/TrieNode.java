public class TrieNode {
    // Instance variables
    private boolean isWord;
    private TrieNode[] children;

    // Constructor
    public TrieNode() {
        children = new TrieNode[26];
        isWord = false;
    }


}
