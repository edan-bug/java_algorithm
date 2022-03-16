/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tree;

/**
 *
 * @author ed
 */
public class treeNode {


    private int data;
    private treeNode leftChild;
    private treeNode rightChild;

    public void insert(int value) {
        if (value == data) {
            return;
        }

        if (value < data) {
            if (leftChild == null) {
                leftChild = new treeNode(value);
            }
            else {
                leftChild.insert(value);
            }
        }
        else {
            if (rightChild == null) {
                rightChild = new treeNode(value);
            }
            else {
                rightChild.insert(value);
            }
        }
    }

    public treeNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public treeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(treeNode leftChild) {
        this.leftChild = leftChild;
    }

    public treeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(treeNode rightChild) {
        this.rightChild = rightChild;
    }
}

