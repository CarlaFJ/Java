package pg01_Programacion;
import javax.swing.JOptionPane;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		
		String num1 = JOptionPane.showInputDialog("Introduce un n�mero por favor ");
		
		int num_1 = Integer.parseInt(num1);
		
		String num2 = JOptionPane.showInputDialog("Introduce un segundo n�mero");
		
		int num_2 = Integer.parseInt(num2);
		
		System.out.println("El producto de esos n�meros es " + num_1* num_2);

	}

}
