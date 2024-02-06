/*
 
Programa que permite realizar el recuento de votos en unas elecciones.
El programa pide el número de candidatos y el número de votantes.
 
Luego pregunta a cada votante a que candidato vota.
Al final muestra el total de votos para cada candidato.
No es necesario almacenar todos los votos, solo irlos contando.
 
Utilizar un array de contadores. Cada vez que se introduce un voto se incrementa el
contador correspondiente.
 
Validar cualquier posible error al votar.
 
 
Salida del programa :
------------------------------------
Entra número de candidatos: 3
Entra número de votantes: 4
 
Votante 1, entra tu voto (1-3): 1
Votante 2, entra tu voto (1-3): 3
Votante 3, entra tu voto (1-3): x
Voto inválido.
Votante 3, entra tu voto (1-3): 5
Voto inválido.
Votante 3, entra tu voto (1-3): 2
Votante 4, entra tu voto (1-3): 1
 
Resultados:
-----------------------
Candidato 1: 2 votos.
Candidato 2: 1 votos.
Candidato 3: 1 votos.
 
 
*/
 
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