import java.util.*;
public class divisible {
    public int Sol(int a[],int n){
        int count=0;int sum=0;
        for (int i=0;i<n;i++){
            sum+=a[i];
        }
        if(sum%3==0){
            count+=1;
        }
        else{
            count+=0;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("n");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        divisible value=new divisible();
        System.out.println(value.Sol(a,n));
    }
}