/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tree;

/**
 *
 * @author ed
 */
public class tree {

    private treeNode root;

    public void insert(int value) {
        if (root == null) {
            root = new treeNode(value);
        }
        else {
            root.insert(value);
        }
    }


}

