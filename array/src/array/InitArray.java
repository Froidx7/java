package array;

public class InitArray {

	public static void main(String args[]) {
		int array [];
				array= new int[10];	
				System.out.printf("%s%7s\n", "Indice","Valor");
				for(int contador=0; contador < array.length; contador++) {
					System.out.printf("%d%10d\n", contador, array[contador]);
				}//fim for
				}

	
}
