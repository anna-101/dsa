package Trie;

import sun.text.normalizer.Trie;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {

    boolean isEndOfWord;
    HashMap<Character, TrieNode> map ;
    static TrieNode getNewTrie(){
        TrieNode node = new TrieNode();
        node.isEndOfWord = false;
        node.map = new HashMap<>();
        return node;
    }

    static void insert(TrieNode root, String str){
        TrieNode temp = root;
        //TrieNode curr;
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);

            if(!temp.map.containsKey(ch)){
                temp.map.put(ch,getNewTrie());
            }
            temp = temp.map.get(ch);
        }
        temp.isEndOfWord = true;
    }

    public static boolean search(TrieNode root, String str) {
        TrieNode temp = root;
        if (root == null) return false;

        for (int i = 0; i < str.length(); i++) {
            if (!temp.map.containsKey(str.charAt(i))) {
                return false;
            }
            temp = temp.map.get(str.charAt(i));
        }
        return temp.isEndOfWord;
    }

    public static String findLongestCommonPrefix(TrieNode root){
        String prefix = "";
        TrieNode temp = root;
        char key=' ';
        while(temp.map.size() ==1 && temp.isEndOfWord == false){
            for(char o : temp.map.keySet()) {
                key = o;
            }
            temp = temp.map.get(key);
            prefix = prefix + key;
        }
        return prefix;
    }

    public static void main(String[] args) {
        TrieNode root = getNewTrie();

        insert(root, "anna");
        insert(root, "annapurna");
        insert(root, "annap");
        insert(root, "annaa");
        String searchString = "anna";
        boolean found = search(root, searchString);
        if(found) {
            System.out.println("Search String "+ searchString + " found");
        }else System.out.println("Search String " + searchString + " not found");
        System.out.println("Longest Common Prefix is " + " "+findLongestCommonPrefix(root));

    }
}
