
public class PowerOfNumber {
    public static void main(String[] args) {
        System.out.println(pow(8, 2));
        System.out.println("printing square of  1 to 20 numbers :: ");

        for (int i=1; i<=20; i++){
            System.out.print(pow(i, 2)+ " ");
        }
    }

    static int pow(int n, int power ){
        if(power == 0)return 1;
        int res = n*pow(n, power-1);
        return res;

    }
}
