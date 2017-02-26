package com.Implement_Trie_Prefix_Tree;

class TrieNode {
    boolean isEnd;
    TrieNode[] childArr = new TrieNode[26];
}

public class Trie {

    TrieNode root = new TrieNode();
    Character currentCharacter;

    /**
     * Initialize your data structure here.
     */
    public Trie() {

        // No need to initialize as the values will be initialized by default

    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {

        TrieNode t = root;

        // We can do the insertion in an iterative manner
        for (Character c : word.toCharArray()) {
            if (t.childArr[(int) c - 'a'] == null) {
                t.childArr[(int) c - 'a'] = new TrieNode();
                t = t.childArr[(int) c - 'a'];
            } else
                t = t.childArr[(int) c - 'a'];
        }
        t.isEnd = true;
    }

    /**
     * Returns if the word is in the trie.
     */
    public boolean search(String word) {

        TrieNode t = root;

        // We can do the search in an iterative manner
        for (Character c : word.toCharArray()) {
            if (t.childArr[(int) c - 'a'] != null) {
                t = t.childArr[(int) c - 'a'];
            } else
                return false;
        }

        return t.isEnd;

    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix
     */
    public boolean startsWith(String prefix) {

        TrieNode t = root;

        // We can do the search in an iterative manner
        for (Character c : prefix.toCharArray()) {
            if (t.childArr[(int) c - 'a'] != null) {
                t = t.childArr[(int) c - 'a'];
            } else
                return false;
        }

        return true;

    }
}