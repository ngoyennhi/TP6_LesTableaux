package exercicesApplicatifs;

import java.util.Arrays;
import java.util.OptionalInt;

public class MathCalculMethodes {
public static void averageTab(int[] tab) {
	// calcul la moyenne
			//Une variable "somme" ajoute a chaque itération la valeur de la position courante, 
			int somme = 0;
			for(int i=0;i<tab.length;i++){
				somme+=tab[i]; // calcul somme total
			}
			//"somme" est divisée par la taille du tableau
			float moyenne = somme/tab.length;
			
			System.out.println("la moyenne est " + moyenne) ;
			
}

// Solution 1: Max Min
public static void maxTab(int[] tab) {
	//la plus grand valeur
	int minVal= Integer.MIN_VALUE;
	
	   for(int i = 0; i < tab.length; i++){

	         if(tab[i] > minVal)
	           minVal = tab[i];
	       }
	
	System.out.println("le plus grand est le " + minVal);
}
public static void minTab(int[] tab) {

	//la plus petite valeur
	int maxVal = Integer.MAX_VALUE;
	
	   for(int i = 0; i < tab.length; i++){
	         if(tab[i] < maxVal)
	           maxVal = tab[i];

	       }
	
	System.out.println("le plus petit est le  " + maxVal);
}

/*
 * //Solution 2: max min
public static void max_array (int[] tab) {
    OptionalInt max = Arrays.stream(tab).max();
    //ou
    //OptionalInt max = IntStream.of(tab).max();
	
	System.out.println("le plus grand est le " + max);
}

public static void min_array (int[] tab) {
    OptionalInt min = Arrays.stream(tab).min();
    //ou
    //OptionalInt min = IntStream.of(tab).min();

	System.out.println("le plus petit est le  " + min);}
 */


}
