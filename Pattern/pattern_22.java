public class pattern_22 {
    public static void main(String[] args) {
         int n=5;
         for(int i=1;i<=n;i++)
         {
             for(int j=1;j<=n*2-1;j++)
             {
                 if(i+j==n+1 || j-1==n-1 )
                 System.out.print("*  ");//2 space
                 else 
                 System.out.print("   ");//3 space
             }
             System.out.println();
         }
    }
}
