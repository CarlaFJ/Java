package pg02_Sentencias_condicionales;
import javax.swing.*;

public class Ejercicio03_sc {

	public static void main(String[] args) {
		
		String num1= JOptionPane.showInputDialog("Introduce un n�mero por favor");
		int num2= Integer.parseInt(num1);
		
		if (num2>0) {
			System.out.println("El n�mero es positivo");
		}
		
		if (num2<0) {
			System.out.println("El n�mero es negativo");
		}
		
		else if(num2==0) {
			System.out.println("El n�mero es nulo");
		}
	}

}
