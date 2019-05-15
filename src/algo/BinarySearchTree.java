package algo;

public class BinarySearchTree {

	static class Node {
	    public int value;
	    public Node left, right;

	    public Node(int value, Node left, Node right) {
	        this.value = value;
	        this.left = left;
	        this.right = right;
	    }
	}


    public static boolean contains(Node root, int value) {

    	if (root.value == value) return true;
	  	if(root.left != null &&  value < root.value) return contains(root.left, value);
	  	if(root.right != null && value > root.value) return contains(root.right, value);
        return false;
        
    }
    
    public boolean isValidBST(Node p, double min, double max){
        if(p==null) 
            return true;
     
        if(p.value <= min || p.value >= max)
            return false;
     
        return isValidBST(p.left, min, p.value) && isValidBST(p.right, p.value, max);
    }
    
    public Node insert(Node node, int value) {
    	Node newNode = new Node(value, null, null);
    	if(node == null) {
    		return newNode;
    	} else {
    		
    	}
    	return node;
    }
    
    
//    let node = new Node(value);
//    if(!this.root) this.root = node;
//    else{
//       let current = this.root;
//       while(!!current){
//          if(node.value < current.value){
//          if(!current.left){
//              current.left = node;
//              break;
//            }
//            current = current.left;
//            } 
//          else if(node.value > current.value){
//            if(!current.right){
//               current.right = node;
//               break;
//              }
//             current = current.right;
//             } 
//           else {
//             break; 
//             }
//            }
//           }
//       return this;
//    };
    
    public static void main(String[] args) {
    	
        Node n1 = new Node(1, null, null);
        Node n3 = new Node(3, null, null);
        Node n2 = new Node(2, n1, n3);
        
        System.out.println(contains(n2, 3));
    }
	

}
