package telran.auto.park;

public class TripList {

    private Node first = null;
    private Node last = null;
    private int size = 0;
    
    
//    public Node remove(Trip element) {
//  }
    
    
    public void add (Trip element) {
	
	Node node=new Node();
	node.setObj(element);
	if(first==null) {
	    first = node;
	    node.setNext(null);
	    node.setPrev(null);
	} else {
	    last.setNext(node);
	    node.setPrev(last);
	    node.setNext(null);	    
	}
	    last = node;
	    size++;
    }
    
    public void add (Trip element, int pos) {
	if(pos>=size) {
	    add(element);
	} else {
		Node node=new Node();
		node.setObj(element);
		Node currentNode = find (pos);
		if(currentNode!=null) {
		    currentNode.getPrev().setNext(node);
		    node.setPrev(currentNode.getPrev());
		    node.setNext(currentNode);
		    currentNode.setPrev(node);
		    size++;
		}
		
		
	}
	

    }
    //   node
    //    []
    //      curNode
    // []    []    []
    //
    
    public Node find(int pos) {
	if (pos<=0) return  first;
	if (pos>=size) return  last;
	Node n = first;
	int i=0;
	while (n!=null&& i<pos) {
	    n=n.getNext();
	    i++;
	}
	return n;
    }
    
    
    
    
    public void print() {
	Node n = first;
	while (n!=null) {
	    System.out.println(n.getObj().toString());
	    n=n.getNext();
	}
	System.out.println("------ "+ size + " trips");
	
    }
    
}

class Node{
    
    private Trip obj = null;
    private Node next = null;
    private Node prev = null;
    
    //[trip] [adress trip] [adress prev] [adress next]
    
    public Trip getObj() {
        return obj;
    }
    public void setObj(Trip obj) {
        this.obj = obj;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    public Node getPrev() {
        return prev;
    }
    public void setPrev(Node prev) {
        this.prev = prev;
    }
    
    
    
}
