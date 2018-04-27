import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;



public class Uri1696 {
	
	public static Node root = null;
	public String Turno = "J1";
	
	public static int listSize() {//Length of Queue
		
		int counter = 0;
		Node temp = root;
		
		while(temp != null)
		{
			
			counter +=1;
			temp = temp.next;
			
		}
		
		return counter;		
	}
	
	
	public static boolean isEmpty() {
		return root == null? true : false;
	}
	
	
	public static void Insert(int value) {
		
		if (isEmpty()) {
			Node temp = new Node(value);
			root =temp;
		}
		else {
			
			Node temp = root;
			Node parent = root;
			
			while(temp != null) {
				parent = temp;
			}
		}
				
				
	}
	
	public void cambiarTurno ( ){
		
		if (Turno == "J1")
			this.Turno= "J2";
		else
			this.Turno= "J1";
	
	}
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		Uri1696 Turno = new Uri1696();
	
		bw.write("escriba el numero de posibles juegos \n");
		bw.flush();

		int T= Integer.parseInt(br.readLine());
		bw.write("cantidad de numeros y cantidad de cambios \n");
		bw.flush();

		String entrada = br.readLine();
		int N = Integer.parseInt(entrada.split(" ")[0]);
		int Q = Integer.parseInt(entrada.split(" ")[1]);
		try{
		
			if (N<= 0  )
			System.out.println(" E R R O R");
		
			else{
				
				
				for( int j = 0 ; j < T ; j++){
					
					if (N > 0 && Q == 0){
						Turno.cambiarTurno();
						for (int i =0 ; i < N ; i++){
							String entrada2= br.readLine();			
							Insert((Integer.parseInt(entrada2.split(" ")[i])));
							if (Insert() ==  )
					}
				}
			}
		
		}
			
			
		}catch( Exception ex){}		
			
			
		
	}		
		
	
	
	
}