import java.util.Scanner;

public class I {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int maxCols = 30;
//		int alturas[] = {5, 6, 5, 8, 9, 10, 5, 8, 9, 5, 7, 9, 9, 9, 6, 3};
		int alturas[] = {5, 6, 5, 8, 9, 10, 5, 8, 9, 5, 7, 9, 9, 9, 6, 3, 10, 7, 8, 8, 4, 7, 2, 8, 9, 9, 10, 8, 4, 7};
		
		int base = 1;
		int maxH = -1;
		int pos = 0;
		for (pos = 0; (pos + (((base + 1)/2) -1)) <= maxCols; pos++) {
			System.out.println("it = " + pos);
			if (isPossibly(pos, base, alturas)){
				maxH = (((base + 1)/2));
				base += 2;
			}
		}
		if (maxH < 0)
			System.out.println("0");
		else
			System.out.println(maxH);
	}

	private static boolean isPossibly(int pos, int base, int[] alturas) {
		int iniBase = (pos - (((base + 1)/2) -1));
		if (base == 1){
			if (alturas[pos] >= 1)
				return true;
		}
		int temp = iniBase;
		for (int j = 1; j <= base/2; j++, temp ++) {
			if (alturas[temp] < j ){
				return false;
			}
		}
		temp = pos;
		for (int j = ((base + 1)/2); j > 0; j--, temp ++) {
			if (alturas[temp] < j ){
				return false;
			}
		}
		return true;
	}

}
