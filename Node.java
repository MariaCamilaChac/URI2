public class Node {
	

	public int Num; //global variable
	
	public Node next; //pointer
	public int value;

	
	public Node() {} //empty constructor
	
	public Node (int num) {
		
		this.Num=num;
	}
	
	
	public String toString() { //print in console
		return "Numero: " + this.Num; 
	}
	
	
	public Node clone() { //clone the principal list
		Node clone = new Node (this.Num);
		return clone;
	}

}