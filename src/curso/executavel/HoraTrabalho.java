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
		if (salario <= pisoSalarial || valorHora <= 9 ) { 
			System.out.printf("Voc� faz parte dos 70 por cento da popula��o brasileira em rela��o a m�dia salarial: %.2f %n" , salario);
			System.out.println("O valor da sua hora de trabalho est� entre 1 e R$ 10.00");

		} else if(salario >= pisoSalarial2||valorHora >= 16 ){ 
			System.out.printf("Voc� tem uma renda maior que 90 por cento da popula��o brasileira: R$ %.2f %n" , salario);
			System.out.println("O valor da sua hora � maior que  R$ 16.00");
		}else {
			System.out.println("Sua renda � maior que 70 por cento da popula��o! R$ " + salario);
		}
			
		
		// base de horas -->> 220 horas de trabalho/m�s.

	}
}
