
import java.util.Scanner;

public class Bai_2 {
    public static void main(String[] args) {
        Scanner Ip=new Scanner(System.in);
        int n = Ip.nextInt(); 
        int a[] = new int[n]; 
        for(int i = 0 ; i < n; i++){
            a[i]= Ip.nextInt(); 
        }
        for(int i =0 ; i < n ; i++){
            if(i % 2 != 0){ 
                int p = 0;
                if(i == n-1){ 
                    p= a[i-1];
                }
                else {
                    p = a[i - 1] - a[i + 1]; 
                    if (p < 0) p *= -1;
                }
                a[i]+=p;
            }
        }

        for(int i = 0 ; i < n ; i++){
            System.out.print(a[i] + " ");
        }
    }
}