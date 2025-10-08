public class TST {
    // Instance variables
    private TSTNode root;

    // Constants for direction for TSTNode
    public static final int LESS_NODE = 0;
    public static final int EQUAL_NODE = 1;
    public static final int GREATER_NODE = 2;


    // Constructor
    public TST() {
        // Set root to m because it is the middle of the alphabet
        root = new TSTNode('m');
    }

    // Insert word
    public void insert(String word) {
        TSTNode current = root;
        int i = 0;
        while(i < word.length()) {
            // Find index
            char c = word.charAt(i);
            if(c < current.getLetter()) {
                if(current.getChildren()[LESS_NODE] == null) {
                    current.getChildren()[LESS_NODE] = new TSTNode(c);
                }
                current = current.getChildren()[LESS_NODE];
            }
            else if (c > current.getLetter()) {
                if(current.getChildren()[GREATER_NODE] == null) {
                    current.getChildren()[GREATER_NODE] = new TSTNode(c);
                }
                current = current.getChildren()[GREATER_NODE];
            }
            else {
                if(i + 1 == word.length()) {
                    current.setWord(true);
                    break;
                }
                i++;
                c = word.charAt(i);
                if(current.getChildren()[EQUAL_NODE] == null) {
                    current.getChildren()[EQUAL_NODE] = new TSTNode(c);
                }
                current = current.getChildren()[EQUAL_NODE];
            }
        }
        current.setWord(true);
    }
    // Search for word
    public boolean search(String word) {
        TSTNode current = root;
        int i = 0;
        while(current != null) {
            // Find index
            char c = word.charAt(i);
            if(c < current.getLetter()) {
                current = current.getChildren()[LESS_NODE];

            }
            else if (c > current.getLetter()) {
                current = current.getChildren()[GREATER_NODE];
            }
            else {
                if(i + 1 == word.length()){
                    return current.isWord();
                }
                i++;
                c = word.charAt(i);
                current = current.getChildren()[EQUAL_NODE];
            }
        }
        return false;
    }

}
