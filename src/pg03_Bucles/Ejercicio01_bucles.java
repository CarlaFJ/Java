package pg03_Bucles;
import java.util.*;
public class Ejercicio01_bucles {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner (System.in);
		
		//System.out.println("Introduce un n�mero");
		
		//int numero= entrada.nextInt();
		
		//while (numero<1 || numero>10) {
			//System.out.println("introduce otro n�mero ");
		//	numero= entrada.nextInt();
		//}
		
		//System.out.println("N�mero correcto ");
		
		int num;
		
		do {System.out.println("introduce un n�mero");
		num= entrada.nextInt();
		} while (num<1 || num>10);
		
		System.out.print("Ok, bien hecho");
		entrada.close();
	}

}
