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
		if (valorHora <= 100 && salario <= pisoSalarial) {
			System.out.printf("Você tem a mesma renda que 70 por cento da população brasileira: %.2f %n" , salario);
			System.out.println("O valor da sua hora de trabalho está entre 0 e R$ 100.");

		} else if(valorHora > 100 || salario >= pisoSalarial2){
			System.out.printf("Você tem uma renda maior que 90 por cento da população brasileira: R$ %.2f %n" , salario);
			System.out.println("O valor da sua hora é maior que R$ 100.");
		}
			
		
		System.out.printf("A sua hora vale R$ %.2f", valorHora);

	}
}
