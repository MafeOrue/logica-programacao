import java.util.Scanner;
public class AULA1709 {
	public static void main(String[] args) {
			
	
		Scanner sc = new Scanner(System.in);
	    System.out.println("Informe o primeiro valor de precisão : ");
	    int p1 = sc.nextInt();
	   
	    System.out.println("Informe o segundo valor da precisão : ");
	    int p2 = sc.nextInt();
	   
	    System.out.println("Informe o terceiro valor da precisão : ");
	    int p3 = sc.nextInt();
	   
	    if(p1 == p2 && p2 == p3) {
	    	System.out.println("As máquinas estão operando com a mesma precisão!!");	
	    } else if(p1 == p2 || p1 == p3 || p2 == p3) {
	    	System.out.println("Duas máquinas estão operando com a mesma precisão e uma precisa de ajuste!");
	    } else {
	    	System.out.println("Todas as máquinas precisam de ajustes!!!");
	    }
	   
	   
		}
	}

