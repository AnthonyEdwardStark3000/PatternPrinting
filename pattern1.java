public class pattern1
	{
  public static void main(String args[])
	    {
         patternbox(4);
	 System.out.println("\nNext pattern :");
         patternprint(4);
         reverseTriangle(5);
         printNumber(5);
         printTwotriangle(5);
	 printDiamond(5);
              }
   static void patternbox(int n)
            {
      System.out.println("Box pattern");
      for(int row=1;row<=n;row++)
               {
       for(int col=1;col<=n;col++)
                  {
          System.out.print("*");
                   }
          System.out.println();
                 }
              }

   static void patternprint(int n)
	       {
         for(int row=1;row<=n;row++)
		{
          for(int col=1;col<=row;col++)
                   {
              System.out.print("*");
                     }
              System.out.println();
		  }

                 }
    static void reverseTriangle(int n)
		{
          System.out.println("\nTriangle in reverse :\n");
          for(int row=1;row<=n;row++)
                  {
               for(int col=row;col<=n;col++)
                     {
                System.out.print("*");
		       }
                 System.out.println();
		    }
               
		}
      static void printNumber(int n)
                 {
         System.out.println("\nPrinting numbers:\n");
           for(int row=1;row<=n;row++)
                   {
             for(int col=1;col<=row;col++)
                     {
                System.out.print(col);
                      }
                System.out.println();
                    }
                  }
   static void printTwotriangle(int n)
	{
      System.out.print("\nHalf diamond :\n\n");
      for(int row=1;row<=2*n;row++)
           {
       int totalcols=row>n ? 2*n-row :row;
       for(int col=1;col<=totalcols;col++)
              {
        System.out.print("*");
	       }

        System.out.println();
	     }
	 }

    static void printDiamond(int n)
	{
     for(int row=0 ;row < 2 * n;row++)
          {
       int totalcol=row > n ? 2 * n - row: row;
       int space = n-totalcol;
       for(int s=0;s<space;s++)
	   {
         System.out.print(" ");
              }
       for(int col=0;col<totalcol;col++)
              	{
           System.out.print("* ");
		  }

        System.out.println();
            }
	 }	

	  }