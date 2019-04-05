import java.util.Scanner;
public class Integerarray{
    public static void main(String args[]){
        int a[]=new int[10];
        int n,k,sum=0;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        k=s.nextInt();
        System.out.println("Enet The Value :");
        for(int i=0;i<n;i++)
        {
        a[i]=s.nextInt();
        }
        for(int i=0;i<k;i++)
        {
        sum= sum+a[i];
        }
        System.out.println("The Sum Of first Integer :"+sum);
    }
}
