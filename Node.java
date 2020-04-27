/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.assignment;

//import java.io.*;
import java.io.Serializable;

/**
 * // The node class is used in the binary search tree to link data to the parent and child nodes.
 * @author dsmith230
 * @param <E>
 */
public class Node<E> implements Serializable {

    protected E data;
    protected Node<E> left;
    protected Node<E> right;

    public Node(E data) {
        this.data = data;
        left = null;
        right = null;
    }

    @Override
    public String toString() {
        return data.toString();
    }

}
