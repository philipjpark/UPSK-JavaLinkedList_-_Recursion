class preorderTraversal {

public static class Node {
    String elem;
    Node left, right;
  
    public Node(String data) {
    elem = data;
    left = right = null;
    }
  }
  
  public static class Tree {
   Node root;
  
    Tree() {root = null;}
  
    void preorder(Node node) {
      if (node == null)
        return;
  
      
      System.out.print(node.elem + "   ");
      
      preorder(node.left);
      preorder(node.right);
    }
}
    public static void main (String[] args) {
      
      Tree tree = new Tree();
  
      
      tree.root = new Node("-");
      tree.root.left = new Node("/");
      tree.root.right = new Node("+");
      tree.root.left.left = new Node("*");
      tree.root.left.right = new Node("+");
      tree.root.right.left = new Node("*");
      tree.root.right.right = new Node("6");
      tree.root.left.left.left = new Node("+");
      tree.root.left.left.right = new Node("3");
      tree.root.left.right.left = new Node("-");
      tree.root.left.right.right = new Node("2");
      tree.root.right.left.left = new Node("3");
      tree.root.right.left.right = new Node("-");
      tree.root.left.left.left.left = new Node("3");
      tree.root.left.left.left.right = new Node("1");
      tree.root.left.right.left.left = new Node("9");
      tree.root.left.right.left.right = new Node("5");
      tree.root.right.left.right.left = new Node("7");
      tree.root.right.left.right.right = new Node("4");


      System.out.println("This the preorder traversal:");
      tree.preorder(tree.root);
    }
}