import java.lang.RuntimeException;
public class Pilha {
   int elem[];
   int topo;
public Pilha( ) {
	elem = new int[10];
    topo=-1;
}
 
 public void push(int e)
 {
	 if(isFull())
	 {
		 throw new RuntimeException("Stack Overflow");
	 }
	 topo++;
	 elem[topo] = e;
 }
   
 public int pop()
 {  if(isEmpty())
	 {
		 throw new RuntimeException("Empty Stack!");
	 }
	 int e;
	 e = elem[topo];
	 topo--;
	 return e;
 }
 
 public boolean isEmpty()
 {
	 return(topo== -1);
 }
   
 public boolean isFull()
 {
	 return(topo== 9);
 }
 
 public int top()
 {
	 if(isEmpty())
	 {
		 throw new RuntimeException("Empty Stack!");
	 }
	 return elem[topo];
 }
}
