import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {

	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static int height(Node root) {
        
        
        if(root == null){return -1;}
        
        int left_depth = height(root.left);
        int right_depth = height(root.right);

        if(right_depth > left_depth){
            return right_depth+1;
        }else{
            return left_depth+1;
        }



    }

	public static Node insert(Node root, int data) {
