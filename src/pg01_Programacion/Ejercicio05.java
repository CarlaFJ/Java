package pg01_Programacion;
import java.util.*;
public class Ejercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce tres n�meros por favor");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int suma = num1 + num2 + num3;
		
		System.out.println(suma + " es la suma de los tres n�meros ");
		
		sc.close();

	}

}
