package Lecture12;

public class WavePrintColoumnwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{1,2,3,4}, 
				{11,22,33,44},
				{15,26,35,47},
				{13,24,35,43}};
		
		for (int col = 0; col < arr[0].length; col++) {
			if(col%2 == 0) {//even col
				for (int row = 0; row < arr.length; row++) {
					System.out.print(arr[row][col]+ " ");
				}
			}
			else {
				for (int row = arr.length-1; row>=0; row--) {
					System.out.print(arr[row][col]+ " ");
				}
			}
		}
	}

}
