package arrey;

import java.util.Scanner;

public class exc03 {
	public static void main(String[]args) {
		double soma = 0,media = 0,notas[] = new double[5];
		Scanner entrada = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			System.out.println("informe uma nota: ");
			notas[i] = entrada.nextDouble();
			}
		for(double n: notas) {
			soma += n; }
		
			media = soma/notas.length;
			System.out.printf("a media dos alunos e %.2f",media);
	}
}
