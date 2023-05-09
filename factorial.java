import java.util.Scanner;
class F{
    public static void main(String[] args) {
        int n , fact=1;
        System.out.println("Enter a ny number ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1; i<=n;i++){
            fact=fact*i;
            if(n=0){
                System.out.println("Answer is 1 ")


            }

        }
        System.out.println("Factorial",fact);
}