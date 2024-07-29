import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 1; i < n-1; i++) { 
            if (a[i] % 2 == 1) { 
                a[i] = Math.abs(a[i - 1] - a[i + 1])+a[i];
            }
        }
        a[n-1]=a[n-2]+a[n-1];
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        s.close();
    }
}
