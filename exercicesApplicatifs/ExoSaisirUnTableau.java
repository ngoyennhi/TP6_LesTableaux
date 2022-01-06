package exercicesApplicatifs;

import java.util.Scanner;

public class ExoSaisirUnTableau {
	public static void main(String[] args) {

		int [] tab ; // celui-ci un tableau vide qui contient les numéro en type int
		int n; 
		n = 5;
		tab = new int[n]; // creer un tableau 5 élements
		Scanner src = new Scanner(System.in);
		
		//saisir les numeros selon sa positon dans le tableau
		System.out.println("Saissiez votre numero, svp");
		tab[0] = src.nextInt();
		System.out.println("Saissiez votre numero, svp");
		tab[1] = src.nextInt();
		System.out.println("Saissiez votre numero, svp");
		tab[2] = src.nextInt();
		System.out.println("Saissiez votre numero, svp");
		tab[3] = src.nextInt();
		System.out.println("Saissiez votre numero, svp");
		tab[4] = src.nextInt();
		
		//Solution1:
		//faire les calculs moyenne/max/min à partir de methods dans la class MathCamcumMethodes
		MathCalculMethodes.averageTab(tab);
		MathCalculMethodes.maxTab(tab);
		MathCalculMethodes.minTab(tab);
		/*
		Solution2:
		MathCalculMethodes.max_array(tab);
		MathCalculMethodes.min_array(tab);*/
		
		
		
}
}
