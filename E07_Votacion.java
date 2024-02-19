
import java.io.*;
import java.util.Scanner;
 
public class E07_Votacion {
 
    public static void main(String[] args) throws Exception {
 
    	Scanner teclat = new Scanner (System.in);
    	System.out.print("Entra número de candidatos: ");
    	int candidatos = teclat.nextInt();
    	System.out.print("Entra número de votantes: ");
    	int votantes = teclat.nextInt();
    	int botos[] = new int [candidatos];
    	
    	for(int a = 1; a<=votantes; a++) {
    		
    		boolean correcte = false;
    		do {
    			teclat.nextLine();
	    		try {
	    			System.out.print("Votante "+a+", entra tu voto (1-"+candidatos+"): ");
	    			int boto = teclat.nextInt();
	    			if (boto<=candidatos && boto>=1) {
	            		botos[boto-1]++;
	            		correcte = true;
	            	}
	            	else {
	            		System.out.println("Valor invalid");
	            	}
	    		}catch(java.util.InputMismatchException e) {
	    			System.out.println("Valor invalid");
	    		}
	    	}while(!correcte);
    	};
    	System.out.println("");
    	System.out.println("Resultados:");
    	System.out.println("------------------");
    	for(int a = 1; a<=candidatos; a++) {
    		System.out.println("Candidato "+a+", "+botos[a-1]+" votos");
    	};
		
 
 
    }
}
