package curso.executavel;

import javax.swing.JOptionPane;

public class HoraTrabalho {

	/* Main � um m�todo auto execut�vel em Java */
	public static void main(String[] args) {

		System.out.println("Digite qual carga de horas acordada no contrato.");

		double horasTrabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas: "));
		double salario = Integer.parseInt(JOptionPane.showInputDialog("Digite seu sal�rio: "));

		double pisoSalarial = 1800;
		double pisoSalarial2 = 3500;

		double valorHora = salario / horasTrabalhadas;
		if (valorHora <= 100 && salario <= pisoSalarial) {
			System.out.printf("Voc� tem a mesma renda que 70 por cento da popula��o brasileira: %.2f %n" , salario);
			System.out.println("O valor da sua hora de trabalho est� entre 0 e R$ 100.");

		} else if(valorHora > 100 || salario >= pisoSalarial2){
			System.out.printf("Voc� tem uma renda maior que 90 por cento da popula��o brasileira: R$ %.2f %n" , salario);
			System.out.println("O valor da sua hora � maior que R$ 100.");
		}
			
		
		System.out.printf("A sua hora vale R$ %.2f", valorHora);

	}
}
