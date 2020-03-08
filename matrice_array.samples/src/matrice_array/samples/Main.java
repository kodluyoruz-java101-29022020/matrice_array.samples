package matrice_array.samples;

public class Main {

	public static void main(String[] args) {
		
		MatriceOperation matriceOperation = new MatriceOperation();
		
		int[][] matrice1 = matriceOperation.fillMatrice(3, 5);
		int[][] matrice2 = matriceOperation.fillMatrice(3, 5);
		
		matriceOperation.printMatriceSize(1, matrice1);
		matriceOperation.printMatriceSize(2, matrice2);
		
		
		int[][] resultMatrice = matriceOperation.sumMatrices(matrice1, matrice2);


		matriceOperation.printMatrice(matrice1);
		
		System.out.println("----------------------");
		
		matriceOperation.printMatrice(matrice2);
		
		System.out.println("----------------------");
		
		matriceOperation.printMatrice(resultMatrice);
		
		System.out.println("----------------------");
		
	}
	

}
