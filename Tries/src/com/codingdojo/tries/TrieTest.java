package com.codingdojo.tries;
public class TrieTest {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insertWord("car");
        trie.insertWord("card");
        trie.insertWord("chip");
        trie.insertWord("trie");
        trie.insertWord("try");
        
        System.out.println(trie.isPrefixValid("ca"));
        System.out.println(trie.isPrefixValid("sa"));
        
        System.out.println("-------------");
        
        System.out.println(trie.isWordValid("car"));
        System.out.println(trie.isWordValid("ca"));
        
        System.out.println("-------------");
        
        trie.printAllKeys(trie.root);
    }
}