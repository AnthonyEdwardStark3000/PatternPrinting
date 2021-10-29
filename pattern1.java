public class pattern1
	{
  public static void main(String args[])
	    {
         patternbox(4);
	 System.out.println("\nNext pattern :");
         patternprint(4);
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

	  }