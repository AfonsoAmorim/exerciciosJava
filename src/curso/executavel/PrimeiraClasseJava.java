package curso.executavel;

import javax.swing.JOptionPane;

public class PrimeiraClasseJava {
	
	/* Main � um m�todo auto execut�vel em Java*/
	public static void main(String[] args) {
		System.out.println("Hora de Trabalho");
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite seu sal�rio"));
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite dias trabalhados"));
		int valorHora = num/num1;
		if(valorHora <= 100) {
			System.out.println("O valor da sua hora de trabalho est� entre 0 e R$ 100.");
		}else if((valorHora > 100)&& ((valorHora <= 200))){
			System.out.println("O valor da sua hora est� entre R$100 e R$200.");
		}else {
			System.out.println("O valor da sua hora � maior que R$ 300.");
		}
		
		System.out.println("A sua hora vale R$" + valorHora);
		
		
		
	}
	
}
