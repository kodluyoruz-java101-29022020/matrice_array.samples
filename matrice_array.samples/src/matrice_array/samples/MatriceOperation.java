package matrice_array.samples;

public class MatriceOperation 
{
	public void printMatrice(int[][] matrice) {
		
		for(int i=0; i < matrice.length; i++) {
			
			for(int j=0; j < matrice[0].length; j++) {
				
				System.out.print(matrice[i][j] + " ");
			}
			
			System.out.print("\n");
		}
	}
	
	public int[][] sumMatrices(int[][] firstMatrice, int[][] secondMatrice) {
		
		int[][] resultMatrice = new int[firstMatrice.length][secondMatrice[0].length];
		
		for(int i=0; i < firstMatrice.length; i++) {
			
			for(int j=0; j < firstMatrice[0].length; j++) {
				
				int result = firstMatrice[i][j] + secondMatrice[i][j];
				resultMatrice[i][j] = result;
			}
			
		}
		
		return resultMatrice;
	}

	public int[][] fillMatrice(int rowCount, int columnCount) {
		
		int[][] matrice = new int[rowCount][columnCount];
		
		for(int i=0; i < matrice.length; i++) {
			
			for(int j=0; j < matrice[0].length; j++) {
				
				int matriceValue = (int)(Math.random() * 100);
				matrice[i][j] = matriceValue;
			}	
		}
		
		return matrice;
		
	}
	
	public void printMatriceSize(int id, int[][] matrice) {
		
		String result = formatMatriceResult(id, matrice.length, matrice[0].length);
		System.out.println(result);
	}
	
	private String formatMatriceResult(int id, int rowCount, int columnCount) {
		
		return String.format("Matrice %d Row Count: %d, Column Count: %d", id, rowCount, columnCount); 
	}
	
	
	
	
	
	
	
	
	
	
	
}
