package tiposPrimitivos;

import java.util.Scanner;

public class TiposPrimitivos {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		System.out.print("Digite a sua nota: ");
		float nota = entrada.nextFloat(); //nextFloat() aceita valores com v�rgula
		
		System.out.println("\nNota digitada: " + nota);
		System.out.printf("A nota do %s �: %.2f", nome, nota);
		
		//Convers�o de valores
		int num = 5;
		String texto = Integer.toString(num);
		
		num=Integer.parseInt(texto);
		
		nota=Float.parseFloat(texto);
		texto=Float.toString(nota);
	}
}
