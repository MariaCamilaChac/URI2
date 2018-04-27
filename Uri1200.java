import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Uri1200 {
	Node_Tree root =null;
	
	public void Insert(int value) {
		if (isEmpty()) {
			Node_Tree temp = new Node_Tree(value);
			root =temp;
		}
		else {
			
			Node_Tree temp = root;
			Node_Tree parent = root;
			
			while(temp != null) {
				parent = temp;
				if (temp.value<value)
					temp= temp.Tree_rigth;
				
				else
					temp=temp.Tree_left;
			}
			
			Node_Tree newNode = new Node_Tree (value);
			if (parent.value < value) 
				parent.Tree_rigth=newNode;
			else 
				parent.Tree_left=newNode;
		
		}
	}
			
	public boolean isEmpty() {
	
		return root == null? true : false;
	}
	
	public void Preorder(Node_Tree node) {
		if(node != null) {
			System.out.println(node.value+ " ");
			Preorder(node.Tree_left);
			Preorder(node.Tree_rigth);

		}
	}
	
	
	public void Postorder(Node_Tree node) {
		if(node != null) {
			
			Postorder(node.Tree_left);
			Postorder(node.Tree_rigth);
			System.out.println(node.value+" ");
		}
	}
	
	
	public void Inorder(Node_Tree node) {
		if(node != null) {
			
			Inorder(node.Tree_left);
			System.out.println(node.value+" ");
			Inorder(node.Tree_rigth);
			
		}
	}
	


	public Node_Tree Search (int value) {
		
		Node_Tree temp= root;
		
		while (temp != null) {
			
			if(temp.value==value) {
		
				break;
			}
			if (value < temp.value) 
				temp = temp.Tree_left;
			
			else
				temp = temp.Tree_rigth;
		}
		return temp;
	}
	
	
	public static void main(String[] args) {
		
		Uri1200 node = new Uri1200();
		
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String insert = "I";
		String Search = "P";
		String Pos = "POSFIXA";
		String In = "INFIXA";
		String Pre = "PREFIXA";
		
		
		String Entrada = br.readLine();
		
		switch ( Entrada ) {
		case 1:
			if (Entrada == "I") {
				node.Insert(value);
			}
		break;
		case 2: 
			if (Entrada == "P") {
				
			node.Search(value);
				
			}
		case 3:
			if (Entrada == "POSFIXA" ) {
				
			}
		case 4:
			if (Entrada == "PREFIXA") {
				
			}
		case 5:
			if (Entrada == "INFIXA"){
				
			}
		
	
		
	}

}
}
