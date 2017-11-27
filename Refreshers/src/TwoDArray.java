
public class TwoDArray {

	public static void main(String[] args) {
	
		int arr[][] = new int[2][3]; //rows and columns
		arr[0][0] = 12;
		arr[0][1] = 24;
		arr[1][0] = 36;
		arr[1][1] = 48;
		
		for(int rows=0; rows < 2; rows++) {
			
			for(int col=0; col < 3; col++) {
				System.out.print(arr[rows][col] + " ");
			}
			System.out.println();
		}
	}
	
}
