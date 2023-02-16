import java.util.Scanner;

import Exceptions.ParametrosInvalidosException;

public class Contador {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o parametro 1: ");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o parametro 2:");
		int parametroDois = terminal.nextInt();

		try {
			contar(parametroUm,parametroDois);
			
		} catch (ParametrosInvalidosException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		terminal.close();
	}

	private static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if(parametroUm>parametroDois) {
			throw new ParametrosInvalidosException("Parametro Dois deve ser maior que o primeiro");
		}
		int contagem= parametroDois-parametroUm;
		for(int i=1;i<=contagem;i++) {
			System.out.println(i);
		}

	}
}