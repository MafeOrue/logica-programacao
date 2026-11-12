
public class Aula2 { // escopo e tudo que está dentro da abertura da chave até o final da chave

public static void main(String[] args) { // String(Classe) não é uma variável, ela é um conjunto de caracteres por isso iniciar sempre com a letra Maiuscula
	
	
	//String usa aspas sempre
	System.out.println("Maria Fernanda");
	System.out.println("Mayor Otano / Itapua");
	
	
	//System.out.println(2 * 3); //operador aritmetico multiplicação, não usa aspas
	//double numeroUm= 7.5; //64byts
	//float numeroDois = 8.5f; // 32bytes 
	//long numeroTres = 80111323932L; //64bytes, Long seria números grandes
	
	//EXEMPLO DE USO DE VARIAVEIS 
	
	//Números inteiros
	int idade = 20;
	//Numeros com virgula
	double preco = 4.7;
	//Letras
	char genero = 'M';
	//Valores verdadeiro ou falso
	boolean usuarioAtivo = true;
	//Texto
	String nome = "Maria";
	
	//EXEMPLOS DE SAIDA DE CÓDIGO
	System.out.println("Sua idade é: " + idade);
	System.out.println("O item custa: R$" + preco);
	System.out.println("O usuario é do genero: " + genero);
	System.out.println("Ativação do usuario: " + usuarioAtivo);
	System.out.println("Nome do Usuario: " + nome);
	
	//Código que soma duas idades e mostra o resultado System.out.printlin();
    int idade1 = 20;
    int idade2 = 24;
    
    int somaIdades = idade1 + idade2;
    System.out.println("A soma das idades é de: " + somaIdades);
   
    
    //ATIVIDADE 1
    
    int idade3 = 50;
    int idade4 = 60;
    
    System.out.println("A soma das idades é de: " + (idade3 + idade4));
    
    //Operadores Aritmeticos
    // + SOMA, - SUBTRAÇÃO, * MULTIPLICAÇÃO, / DIVISÃO, % MOD RESTO DA DIVISÃO

    
    // EXERCICIO 1
    
    int numero1 = 25;
    int numero2 = 25;
    
    int soma = numero1 + numero2;
    int subtracao = numero1 - numero2;
    
    int mult = numero1 * numero2;
    double div = numero1 / numero2;
    
    System.out.println("A soma é de: " + soma);
    System.out.println("A subtracao é de: " + subtracao);  // SEMPRE VAI SER O SINAL DO MAIS DO LADO
    System.out.println("A mult é de: " + mult);
    System.out.println("A div é de: " + div);


    ////////////////////
     //EXERCECIO 2
    
    int num1 = 5;
    int num2 = 1;
    
    int sucessor = num1 + num2;
    int antecessor = num1 - num2;
    System.out.println("O sucessor é: "  + sucessor);
    System.out.println("O Antecessor é: "  + antecessor);
    
    
    ////////////////////
    // EXERCICIO 3
    
    int n1 = 2;
    
    int dobro = n1 * 2;
    int triplo = n1 * 3;
    int metade = n1 / 2;
    
    System.out.println("O dobro é : " + dobro);
    System.out.println(" O triplo é : " + triplo);
    System.out.println("A metade é : " + metade);
   
   /////////
   //EXERCICIO 4
    
    int idadee = 20;
    
    int ano = idadee * 365;
    int mes = idadee * 12;
    int dias = idadee * 30;
    
    
     System.out.println("A quantidade é : " + idade * ano );
     System.out.println("A quantidade é : " + idade * mes );
     System.out.println("A quantidade é :" + idade * dias);

    
    	

    

    
   
    
    
     
    
    	




	
			
}

}
