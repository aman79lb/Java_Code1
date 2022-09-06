import java.util.Scanner;

public class DT {
	public static void main(String[] args) {
		int p1, p2, p3, p4;
		int count = 0;
		int r;
		p1 = STDIN_SCANNER.nextInt();
		p2 = STDIN_SCANNER.nextInt();
		p3 = STDIN_SCANNER.nextInt();
		p4 = STDIN_SCANNER.nextInt();
		if(p1 >= 10) {
			count++;
		}
		if(p2 >= 10) {
			count++;
		}
		if(p3 >= 10) {
			count++;
		}
		if(p4 >= 10) {
			count++;
		}
		System.out.print(count);
	}

	public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}