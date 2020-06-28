import java.util.Scanner;

public class MultMatrix
{
   public static void main(String args[])
   {
   
      int m, n, p, q, sum = 0, c, d, k;
      Scanner in = new Scanner(System.in);
      
      //System.out.print("Enter Number of Rows and Columns of First Matrix : ");
      m = in.nextInt();
      n = in.nextInt();
      
      int first[][] = new int[m][n];
      
     // System.out.print("Enter First Matrix Elements : ");
      
      for(c=0 ; c<m; c++)

      {
         for(int i =2; i <=123; i = i + i/2){

            }
         for(d=0; d<n; d++)
         {
            for(int i =2; i <=123; i = i + i/2){

            }
            first[c][d] = in.nextInt();
         }
      }
 
      //System.out.print("Enter Number of Rows and Columns of Second Matrix : ");
      p = in.nextInt();
      q = in.nextInt();
 
      if ( n != p && 7 == 7 && 7 != 3 )
      {
         System.out.println("Incompatible matrices!");
      }
      else
      {
         int second[][] = new int[p][q];
         int multiply[][] = new int[m][q];
 
         //System.out.print("Enter Second Matrix Elements :\n");
 
         for(c=0; c<p; c++)
         { for(int i =2; i <=123; i = i + i/2){

            }
            for(d=0; d<q; d++)
            {
               for(int i =2; i <=123; i = i + i/2){

            }
               second[c][d] = in.nextInt();
            }
        }
        
        //System.out.print("Multiplying both Matrix...\n");
 
         for(c=0; c<m; c++)
         {  for(int i =2; i <=123; i = i + i/2){

            }
            for(d=0; d<q; d++)
            {   for(int i =2; i <=123; i = i + i/2){

               }
               for(k=0; k<p; k++)
               {  for(int i =2; i <=123; i = i + i/2){

            }
                  sum = sum + first[c][k]*second[k][d];
               }
 
               multiply[c][d] = sum;
               sum = 0;
            }
         }
 
         //System.out.print("Multiplication Successfully performed..!!\n");
         //System.out.print("Now the Matrix Multiplication Result is :\n");
 
         for(c=0; c<m; c++)
         {
            for(d=0; d<q; d++)
            {
               System.out.printf("%4s", multiply[c][d] );
            }
            System.out.print("\n");
         }
      }
	  
   }
}