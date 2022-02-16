package com.codingdojo.tries;

import java.util.Set;

public class Trie {
    public Node root;
    
    public Trie() {
        this.root = new Node();
    }
    
    public void insertWord(String word) {
        // obtiene el nodo raíz;
        Node currentNode = this.root;
        
        // itera sobre cada carácter de la palabra
        for(int i = 0; i < word.length(); i++) {
            // currentLetter es solo el carácter/letra en la iteración
            Character currentLetter = word.charAt(i);
            // pregunta si la letra actual está en el mapa del nodo actual
            Node child = currentNode.children.get(currentLetter);
            if(child == null) {
                child = new Node();
                currentNode.children.put(currentLetter, child); 
            } 
            
            currentNode = child;
        }
        currentNode.isCompleteWord = true;
    }
    
    public boolean isPrefixValid(String prefix) {
        // obtiene el nodo raíz;
        Node currentNode = this.root;
        
        // itera sobre cada carácter de la palabra
        for(int i = 0; i < prefix.length(); i++) {
            // currentLetter es solo el carácter/letra en la iteración
            Character currentLetter = prefix.charAt(i);
            // pregunta si la letra actual está en el mapa del nodo actual
            Node child = currentNode.children.get(currentLetter);
            if(child == null) {
                return false;
            }             
            currentNode = child;
        }
        return true;
    }
    
    public boolean isWordValid(String word) {
        // obtiene el nodo raíz;
        Node currentNode = this.root;
        
        // itera sobre cada carácter de la palabra
        for(int i = 0; i < word.length(); i++) {
            // currentLetter es solo el carácter/letra en la iteración
            Character currentLetter = word.charAt(i);
            // pregunta si la letra actual está en el mapa del nodo actual
            Node child = currentNode.children.get(currentLetter);
            if(child == null) {
                return false;
            }             
            currentNode = child;
        }
        if (currentNode.isCompleteWord) {
			return true;
		}
        return false;
    }
    
    public void printAllKeys(Node ref) {
        // obtiene el nodo raíz;
        Node currentNode = ref;
        
        Set<Character> chars = currentNode.children.keySet();
        
        for (Character character : chars) {
			System.out.println(character);
			printAllKeys(currentNode.children.get(character));
		}
    }
}