import java.util.Scanner;

public class Bai_1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Double r = sc.nextDouble();
		Double a = 3.14;
		Double C = 2*r*a;
		Double S = r*r*a;
		System.out.println(C+" "+S);
        sc.close();
	}
}
