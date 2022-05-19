public class Fabonacci {
    public static void main(String args[]){

        int a=0,b=1,c,i,n=20;
        System.out.println("enter a no ");
        for(i=1;i<=n;i++)
        {
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
    
}
 