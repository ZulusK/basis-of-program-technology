package zulus.trie_tree;

import java.util.*;

/**
 * An trie data structure that implements the Dictionary and the AutoComplete
 * ADT
 */
public class AutoCompleteDictionaryTrie implements Dictionary, AutoComplete {

    private TrieNode root;
    private int size;

    public AutoCompleteDictionaryTrie() {
        root = new TrieNode();
    }

    /**
     * Insert a word into the trie.
     */
    public boolean addWord(String word) {
        word = word.toLowerCase();
        if (isWord(word)) {
            return false;
        } else {
            TrieNode next = root;
            for (char c : word.toCharArray()) {
                if (next.getChild(c) == null) {
                    next = next.insert(c);
                } else {
                    next = next.getChild(c);
                }
            }
            next.setEndsWord(true);
            size++;
            return true;
        }
    }

    /**
     * Return the number of words in the dictionary. This is NOT necessarily the
     * same as the number of TrieNodes in the trie.
     */
    public int size() {
        return size;
    }

    /**
     * Returns whether the string is a word in the trie
     */
    @Override
    public boolean isWord(String s) {
        TrieNode node = getNodeContainer(s.toLowerCase());
        return node != null && node.endsWord();
    }

    /**
     * * Returns up to the n "best" predictions, including the word itself, in terms
     * of length If this string is not in the trie, it returns null.
     *
     * @param prefix         The text to use at the word stem
     * @param numCompletions The maximum number of predictions desired.
     * @return A list containing the up to n best predictions
     */
    @Override
    public List<String> predictCompletions(String prefix, int numCompletions) {
        // TODO: Implement this method
        // This method should implement the following algorithm:
        // 1. Find the stem in the trie. If the stem does not appear in the trie, return
        // an empty list
        // 2. Once the stem is found, perform a breadth first search to generate
        // completions
        // using the following algorithm:
        // Create a queue (LinkedList) and add the node that completes the stem to the
        // back
        // of the list.
        // Create a list of completions to return (initially empty)
        // While the queue is not empty and you don't have enough completions:
        // remove the first Node from the queue
        // If it is a word, add it to the completions list
        // Add all of its child nodes to the back of the queue
        // Return the list of completions
        LinkedList<String> predictions = new LinkedList<>();
        ArrayDeque<TrieNode> nodes = new ArrayDeque<>();
        TrieNode stem = getNodeContainer(prefix);
        if (stem != null) {
            nodes.add(stem);
            while (!nodes.isEmpty() && predictions.size() < numCompletions) {
                TrieNode curr = nodes.pollFirst();
                if (curr.endsWord()) {
                    predictions.add(curr.getText());
                }
                for (char c : curr.getValidNextCharacters()) {
                    nodes.add(curr.getChild(c));
                }
            }
        }
        return predictions;
    }

    private TrieNode getNodeContainer(String prefix) {
        TrieNode curr = root;
        for (char c : prefix.toCharArray()) {
            curr = curr.getChild(c);
            if (curr == null) {
                break;
            }
        }
        return curr;
    }

    // For debugging
    public void printTree() {
        printNode(root);
    }

    /**
     * Do a pre-order traversal from this node down
     */
    public void printNode(TrieNode curr) {
        if (curr == null)
            return;

        System.out.println(curr.getText());

        TrieNode next = null;
        for (Character c : curr.getValidNextCharacters()) {
            next = curr.getChild(c);
            printNode(next);
        }
    }
}