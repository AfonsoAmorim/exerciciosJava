package curso.executavel;

import javax.swing.JOptionPane;

public class HoraTrabalho {

	/* Main é um método auto executável em Java */
	public static void main(String[] args) {

		System.out.println("Digite qual carga de horas acordada no contrato.");

		double horasTrabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas: "));
		double salario = Integer.parseInt(JOptionPane.showInputDialog("Digite seu salário: "));

		double pisoSalarial = 1800;
		double pisoSalarial2 = 3500;

		double valorHora = salario / horasTrabalhadas;
		if (salario <= pisoSalarial || valorHora <= 9 ) { 
			System.out.printf("Você faz parte dos 70 por cento da população brasileira em relação a média salarial: %.2f %n" , salario);
			System.out.println("O valor da sua hora de trabalho está entre 1 e R$ 10.00");

		} else if(salario >= pisoSalarial2||valorHora >= 16 ){ 
			System.out.printf("Você tem uma renda maior que 90 por cento da população brasileira: R$ %.2f %n" , salario);
			System.out.println("O valor da sua hora é maior que  R$ 16.00");
		}else {
			System.out.println("Sua renda é maior que 70 por cento da população! R$ " + salario);
		}
			
		
		// base de horas -->> 220 horas de trabalho/mês.

	}
}
