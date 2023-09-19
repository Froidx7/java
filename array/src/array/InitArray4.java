package array;
import java.util.Scanner;
public class InitArray4 {
	
 
	public double[] PopulaVetor(int tamanhoVetor) {
		double array[]= new double[tamanhoVetor];
		Scanner input= new Scanner(System.in);
		for(int contador=0; contador < array.length; contador++) {
			System.out.print("Digite o valor:");
			array[contador]= input.nextDouble();	
			}
		
		
		
		return array;
		
	}//fim PopulaVetor
	
	public double Somatorio(double array[]) {
		double total=0.0;
		
		for(int contador=0; contador < array.length; contador++) {
			total= total + array[contador];
		}
		
		return total;
	}//fim Somatorio
}
