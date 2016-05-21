package com.pkg.tries;

import java.util.*;

/**
 * 
 * @author nmudnal
 *         http://www.programcreek.com/2014/05/leetcode-implement-trie-prefix-
 *         tree-java/ 
 *         
 *         https://www.cise.ufl.edu/~sahni/dsaaj/enrich/c16/tries.htm
 *         - Tries/Compressed/TernarySearchTree
 */
class TrieNode {
	char c;
	boolean isLeaf;
	Map<Character, TrieNode> children = new HashMap<Character, TrieNode>();

	public TrieNode(char c) {
		this.c = c;
	}
}

public class Trie {
	private static String[] input = { "bed", "ted", "but", "mutter", "naveen", "bedding" };
	TrieNode root;

	public Trie(char c) {
		root = new TrieNode(c);
	}

	private void insertNode(String str) {

		Map<Character, TrieNode> children = root.children;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			TrieNode t;
			if (children.containsKey(c))
				t = children.get(c);
			else {
				t = new TrieNode(c);
				children.put(c, t);
			}
			children = t.children;
			if (i == str.length() - 1) {
				t.isLeaf = true;
				System.out.println("inserted str : " + str);
			}
		}

	}

	private boolean searchNode(String str) {

		Map<Character, TrieNode> children = root.children;
		TrieNode t = null;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (children.containsKey(c)) {
				t = children.get(c);
				children = t.children;
			} else {
				System.out.println(str + " doesn't exist");
				return false;
			}
		}
		if (t != null && t.isLeaf) {
			System.out.println("Found match : " + str);
			return true;
		} else {
			System.out.println(str + " doesn't exist");
			return false;
		}
	}

	public static void main(String[] args) {

		Trie t = new Trie('#');
		for (int i = 0; i < input.length; i++) {
			t.insertNode(input[i]);
		}

		t.searchNode("naveen");
	}
}