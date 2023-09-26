package patterns;

public class Pattern2 {
    
    public static void main(String[] args) {
        
        System.out.println("Pattern 2 - Right triangle");
        //pattern 2
        for(int i=0; i<5; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Pattern 3 - Right triangle (numbers)");
        //pattern 3
        /*
        1 
        1 2
        1 2 3
        1 2 3 4 
        */
        for(int i=1; i<5; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j + " "); // inner loop increment
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Pattern 4 - Right triangle (numbers)");
        //pattern 4
         /* 1
            2 2
            3 3 3
            4 4 4 4
            5 5 5 5 5 
        */
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(i + " "); // inner loop increment
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Pattern 5 - Reverse Left triangle");
        //pattern 5
        //different ways
        System.out.println("1 ");
        for(int i=5; i>0; i--)
        {
            for(int j=0; j<i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

      
        System.out.println("2");
        for(int i=0; i<=5; i++)
        {
            for(int j=5; j>i; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("3");
        for(int i=1; i<=5; i++)
        {
            for(int j=0; j<5-i+1; j++)
            {
                System.out.print("0 ");
            }
            System.out.println();
        }
        System.out.println();

        //pattern 6
        /*  12345
            1234
            123
            12
            1 */
        System.out.println("Pattern 6- Reverse Left triangle (numbers)" );
        for(int i=5; i>=0; i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();

        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=5-i+1; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();

        //pattern 7
        System.out.println("Pattern 7 - pyramid - triangle");
        for(int i=0; i<5; i++)
        {
            //space
            for(int j=0 ; j<5-i-1; j++)
            {
                System.out.print(" ");
            }
            //stars
            for(int j=0; j< 2*i+1; j++)
            {
                System.out.print("*");
            }
            //space
            //actually below lines are not required
            for(int j=0; j<5-i-1; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();

        //Pattern 8
        System.out.println("Pattern 8 - Reverse pyramid -triangle");
        for(int i=0; i<5; i++)
        {
            //space
            for(int j=0;j<i; j++)
            {
                System.out.print(" ");
            }
             //stars 
             for(int j=0; j<2*5-(2*i+1); j++)
             {
                 System.out.print("*");
             }
              //space -not necessarily required
            for(int j=0;j<i; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }

        }
}

