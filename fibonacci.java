import java.util.Scanner;
// printiing the fibonacci series upto n and also the fibonacci number at n th index
public class fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Fibo Series upto position no - ");
        int n = sc.nextInt();
        for(int i = 0 ; i<=n ; i++){
            System.out.print(fiboAt(i)+ " ");
        }
        System.out.println();
        System.out.print("And the fibonacci number at "+ n + "th index : ");
        System.out.println(fiboAt(n));
        
    }
    static int fiboAt(int n ){
        if(n==0||n==1)return n;
        int res = fiboAt(n-1) + fiboAt(n-2);
        return res;
    }
}
 
