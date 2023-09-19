package array;

public class InitArray3 {
	public static void main(String args[]) {
		 final int tamanhoArray=10;
		 int array[]= new int[tamanhoArray];
		 
				for(int contador=0; contador < array.length; contador++)
				{
				   array[contador]= 2*contador +2;	
				}//fim for
				for(int cont=0; cont < array.length; cont++)
				{ 
					System.out.println("Indice:"+cont + " valor:"+array[cont]);
				}
					
				}
}
