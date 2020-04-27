/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.assignment;

import java.io.*;
import java.util.Scanner;
/**
 * //The binary search tree class implements the tree with the node class. The data inserted is compared to the root and either moved to the left or right depending if the value is less than or more than.
 * @author dsmith230
 */
public class trackBST<E> implements Serializable {
 
    protected Node<E> root;

    public trackBST(){
        root = null;
    }
    
    protected trackBST(Node<E> root){
        this.root = root;
        
    }
    
    public trackBST(E data, trackBST<E> leftTree, trackBST<E> rightTree){
        
        root = new Node<>(data);
        if(leftTree != null){
            root.left = leftTree.root;
        } else {
            root.left = null;
        }
        if (rightTree != null){
            root.right = rightTree.root;
        } else{
            root.right = null;
        }
        
        
        
    }
    
    public trackBST<E> getLeftSubtree(){
        if(root != null && root.left != null){
            return new trackBST<>(root.left);
        } else {
            return null;
        }
    }
    
    public boolean isLeaf(){
        return (root.left == null && root.right == null);
    }
    
    @Override
    public String toString(){
        
        StringBuilder sb = new StringBuilder();
        toString(root, 1, sb);
        return sb.toString();
    }
    
    private void toString(Node<E> node, int depth, StringBuilder sb){
        
        for(int i = 1; i < depth; i++){
           sb.append("  ");
            
        }
        if(node == null){
            
            sb.append("null\n");
        } else{
            sb.append(node.toString());
            sb.append("\n");
            toString(node.left, depth + 1, sb);
            toString(node.right, depth + 1, sb);
        }
    }
    
    public static trackBST<String> readBST(Scanner scanBST){
        String data = scanBST.nextLine().trim();
        
        try{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("trackBSTFileIn.txt"));
        trackBST<String> = (trackBST)Object readObject;
            readObject = in.readObject();
    } catch (Exception ex){
        ex.printStackTrace();
        System.exit(1);
    }
        
    

   
    /**
     * Method for displaying a list of all the tracks in ascending Artist order(preOrder).The method should traverse the tree going to the left child
     * @param node
     */
        
    public void ascendingArtist(Node node){
        
        if (node == null)
            return;
        ascendingArtist(node.left);
        ascendingArtist(node.right);
        System.out.print(node.data + " ");
    }
    public void descendingArtist(Node node){
        
        if (node == null)
            return;
        ascendingArtist(node.right);
        ascendingArtist(node.left);
        System.out.print(node.data + " ");
    }
    public void availableTrack(Node node){
        
        if (node == null)
            return;
        ascendingArtist(node.left);
        ascendingArtist(node.right);
        System.out.print(node.data + " ");
    }
    public void displayAllArtists(Node node){
        
        if (node == null)
            return;
        ascendingArtist(node.left);
        ascendingArtist(node.right);
        System.out.print(node.data + " ");
    }
        
       
        if(data.equals("null")) {
            return null;
        } else {
            trackBST<String> leftTree = readBST(scanBST);
            trackBST<String> rightTree = readBST(scanBST);
            return new trackBST<>(data, leftTree, rightTree);
            
        }
    }
    
    /*
        //these try methods are used when importing data to and from a file 
        
    try {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(trackBSTFileOut));
        out.writeObject(Track);
    } catch (Exception ex){
        ex.printDtackTrace();
        System.exit(1);
    }
    */
    /*
    try{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(trackBSTFileIn));
        objectName = (Track) in.readObject();
    } catch (Exception ex){
        ex.printStackTrace();
        System.exit(1);
    }*/
    
}
