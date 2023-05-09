import java.util.Scanner;
class A
{
    public static void main(String[] args){
        int n, count;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
       if(count==2){
        System.out.println(n+" is a prime number");
    }
    else{
        System.out.println(n+" is not a prime number");
    }
}