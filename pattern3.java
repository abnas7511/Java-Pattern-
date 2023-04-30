public class pattern3 {
    public static void main(String[] args) 
    {
        pattern(5);
        System.out.println();
        patterncode2(5);
    }
    static void pattern (int n){
    
       for(int row=1;row<=n;row++)
       {
         for(int col=row;col<=n;col++)
         {
          System.out.print("* ");
         }
         //add a new line
         System.out.println();
       }
    }
    static void patterncode2 (int n){
    
        for(int row=1;row<=n;row++)
        {
          for(int col=1;col<=n-row+1;col++)
          {
           System.out.print("* ");
          }
          //add a new line
          System.out.println();
        }
     }
   }

