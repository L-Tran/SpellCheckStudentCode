public class TrieNode {
    // Instance variables
    private boolean isWord;
    private TrieNode[] children;

    // Constructor
    public TrieNode() {
        children = new TrieNode[27];
        isWord = false;
    }

    public TrieNode[] getChildren() {
        return children;
    }

    public void setWord(boolean word) {
        isWord = word;
    }

    public boolean isWord() {
        return isWord;
    }
}
