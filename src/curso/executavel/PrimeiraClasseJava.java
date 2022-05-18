package curso.executavel;

public class PrimeiraClasseJava {
	
	/* Main é um método auto executável em Java*/
	public static void main(String[] args) {
		System.out.println("IF e Else");
		
		int num = 7;
		int num1 = 150;
		int soma = num+num1;
		
		
		if(soma <= 100) {
			System.out.println("O valor está entre 0 e 100");
		}else if((soma >= 100)&& ((soma <= 200))){
			System.out.println("A soma está entre 100 e 200");
		}else {
			System.out.println("A soma é maior que 300");
		}
		
		System.out.println("Soma de valores inteiros abaixo!!");
		System.out.println(soma);
	}
	
}
