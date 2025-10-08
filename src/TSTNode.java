public class TSTNode {
    // Instance variables
    private boolean isWord;
    private TSTNode[] children;
    private char letter;

    // Constructor
    public TSTNode(char c) {
        children = new TSTNode[3];
        isWord = false;
        letter = c;
    }

    public TSTNode[] getChildren() {
        return children;
    }

    public void setWord(boolean bool) {
        isWord = bool;
    }

    public boolean isWord() {
        return isWord;
    }

    public char getLetter() {
        return letter;
    }
}
