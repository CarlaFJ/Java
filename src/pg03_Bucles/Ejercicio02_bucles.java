package pg03_Bucles;
import java.util.*;
public class Ejercicio02_bucles {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner (System.in);
		
		int num1, num2, num3, num4, num5;
		int numerosPositivos= 0;
		
		System.out.println("Introduce un n�mero");
		num1= entrada.nextInt();
		if(num1>0) {numerosPositivos= 1;}
		
		System.out.println("Introduce un segundo n�mero");
		num2= entrada.nextInt();
		if(num2>0) {numerosPositivos +=1;}
		
		System.out.println("Introduce un tercer n�mero");
		num3= entrada.nextInt();
		if(num3>0) {numerosPositivos +=1;}
		
		System.out.println("Introduce un cuarto n�mero");
		num4= entrada.nextInt();
		if(num4>0) {numerosPositivos +=1;}
		
		System.out.println("Introduce un quinto n�mero");
		num5= entrada.nextInt();
		if(num5>0) {numerosPositivos +=1;}
		
		System.out.println("Hay " + numerosPositivos + " n�meros positivos");

	}

}
