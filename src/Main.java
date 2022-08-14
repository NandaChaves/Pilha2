
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pilha p = new Pilha();
		
		p.push(5);
		p.push(10);
		p.push(34);
		p.push(89);
		p.push(76);
		
		//show the last added element  
		int elemento = p.top();
		System.out.println("Desempilhei "+ elemento);
		//show all elements FIFO
		System.out.println("\nMostrar toda a pilha");
		while(!p.isEmpty())
		{   int element = p.pop();
			System.out.println("Desempilhei "+ element);
		}
	}

}
