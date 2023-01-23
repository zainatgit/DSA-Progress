package programming.tree;

import java.util.*;

//[1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1]
public class BinaryTree {
    Node root;
    static int idx = -1;

    public static void main(String[] args) {
        //int arr[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        int arr[] = {1,3,-1,-1,2,-1,-1};
        Node root = preOrderFill(arr);
        System.out.print("PreOrder : ");
        preOrderTraversal(root);
        System.out.println();
        System.out.print("InOrder : ");
        inOrderTraversal(root);
        System.out.println();
        System.out.print("PostOrder : ");
        postOrderTraversal(root);
        System.out.println();
        System.out.println("LevelOrder : ");
        levelOrderTraversal(root);
        System.out.println("Reverse LevelOrder : ");
        reverseLevelOrderTraversal(root);
        System.out.println("Count of Nodes : "+countOfNodes(root));
        System.out.println("Sum of Nodes : "+sumOfNodes(root));
        System.out.println("Height of Tree : "+heightOfTree(root));
        System.out.println("Diameter of Tree [O(n^2)]: "+diameterOfTreeApproach1(root));
        System.out.println("Diameter of Tree [O(n)]: "+diameterOfTreeApproach2(root).diameter);
        System.out.println("Left view of tree : ");
        leftViewOfTree(root);

    }

    public static Node preOrderFill(int[] nodes){
        idx++;
        if(nodes[idx] == -1){
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.setLeft(preOrderFill(nodes));
        newNode.setRight(preOrderFill(nodes));
        return newNode;
    }

    public static void preOrderTraversal(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.getVal()+" ");
        preOrderTraversal(node.getLeft());
        preOrderTraversal(node.getRight());
    }

    public static void inOrderTraversal(Node node){
        if(node == null){
            return;
        }
        inOrderTraversal(node.getLeft());
        System.out.print(node.getVal()+" ");
        inOrderTraversal(node.getRight());
    }

    public static void postOrderTraversal(Node node){
        if(node == null){
            return;
        }
        postOrderTraversal(node.getLeft());
        postOrderTraversal(node.getRight());
        System.out.print(node.getVal()+" ");
    }

    public static void levelOrderTraversal(Node node){
        Queue<Node> queue = new LinkedList<>();
        if(node == null){
            return;
        }
        queue.add(node);
        queue.add(null);

        while(!queue.isEmpty()){
            Node current = queue.remove();
            if(current == null){
                System.out.println();
                if(queue.isEmpty()){
                    break;
                }else{
                    queue.add(null);
                }
            }else{
                System.out.print(current.getVal() + " ");
                if(current.getLeft()!=null){
                    queue.add(current.getLeft());
                }
                if (current.getRight()!=null){
                    queue.add(current.getRight());
                }
            }
        }
    }

    public static int countOfNodes(Node node){
        if(node == null) return 0;
        return countOfNodes(node.getLeft()) + countOfNodes(node.getRight()) + 1;
    }

    public static int sumOfNodes(Node node){
        if(node == null) return 0;
        return sumOfNodes(node.getLeft()) + sumOfNodes(node.getRight()) + node.getVal();
    }

    public static int heightOfTree(Node node){
        if(node == null){
            return 0;
        }
        return Math.max(heightOfTree(node.getLeft()), heightOfTree(node.getRight())) + 1;
    }
    // Basic approach O(n^2)
    public static int diameterOfTreeApproach1(Node node){
        if(node == null){
            return 0;
        }
        int diaLST = diameterOfTreeApproach1(node.getLeft());
        int diaRST = diameterOfTreeApproach1(node.getRight());
        int diaViaRoot = heightOfTree(node.getLeft()) + heightOfTree(node.getRight()) + 1;
        return Math.max(diaViaRoot,Math.max(diaLST,diaRST));
    }
    // Optimised approach O(n)
    static class TreeNode{
        int height;
        int diameter;

        TreeNode(int height,int diameter){
            this.height = height;
            this.diameter = diameter;
        }
    }

    public static TreeNode diameterOfTreeApproach2(Node node){
        if(node == null){
            return new TreeNode(0,0);
        }
        TreeNode leftTreeNode = diameterOfTreeApproach2(node.getLeft());
        TreeNode rightTreeNode = diameterOfTreeApproach2(node.getRight());
        int myHeight = Math.max(leftTreeNode.height,rightTreeNode.height) + 1;
        int myDiameter = Math.max(Math.max(leftTreeNode.diameter, rightTreeNode.diameter), leftTreeNode.height + rightTreeNode.height + 1);
        return new TreeNode(myHeight,myDiameter);
    }

    public static void reverseLevelOrderTraversal(Node node){
        Queue<Node> queue = new LinkedList<>();
        if(node == null){
            return;
        }
        queue.add(node);
        queue.add(null);
        List<List<Integer>> l2List = new ArrayList<>();
        List<Integer> l1List = new ArrayList<>();
        while(!queue.isEmpty()){
            Node current = queue.remove();
            if(current == null){
                l2List.add(l1List);
                l1List = new ArrayList<>();
                if(queue.isEmpty()){
                    break;
                }else{
                    queue.add(null);
                }
            }else{
                l1List.add(current.getVal());
                if(current.getLeft()!=null){
                    queue.add(current.getLeft());
                }
                if (current.getRight()!=null){
                    queue.add(current.getRight());
                }
            }
        }
        Collections.reverse(l2List);
        for(List<Integer> eachL1List : l2List){
            System.out.println(eachL1List);
        }
    }
    public static void leftViewOfTree(Node node){
        Queue<Node> queue = new LinkedList<>();
        if(node == null){
            return;
        }
        queue.add(node);
        queue.add(null);
        ArrayList<Integer> list = new ArrayList<>();
        boolean leftViewFlag = true;
        while(!queue.isEmpty()){
            Node current = queue.remove();
            if(current == null){
                if(queue.isEmpty()){
                    break;
                }else{
                    leftViewFlag = true;
                    queue.add(null);
                }
            }else{
                if(leftViewFlag){
                    list.add(current.getVal());
                    leftViewFlag = false;
                }
                if(current.getLeft()!=null){
                    queue.add(current.getLeft());
                }
                if (current.getRight()!=null){
                    queue.add(current.getRight());
                }
            }
        }
        list.forEach(e -> System.out.print(e+" "));
    }
}

class Node {
    int val;
    Node left;
    Node right;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
