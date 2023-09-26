package patterns;

public class Pattern6 {
    
    public static void main(String[] args) {
        
        System.out.println(" Pattern 19 ");
        //top half
        int initialSpace = 0;
        for(int i=0;i<5;i++)
        
        {
            //stars
            for(int j=1; j<=5-i;j++)
            {
                System.out.print("*");
            }
            //space
            for(int j=0; j<initialSpace; j++)
            {
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=5-i;j++)
            {
                System.out.print("*");
            }
            initialSpace += 2;
            System.out.println();
        }

        //bottom half
        initialSpace = 8 ; //2*n-2
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=0;j<initialSpace;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            initialSpace -= 2;
            System.out.println();
        }
        System.out.println();

        System.out.println(" Pattern 20 ");

        int spaces = 2*5-2;
        for(int i=1; i<=2*5-1; i++)
        {
            int stars = i;
            if(i > 5) stars = 2*5-i;
            //stars
            for(int j=1; j<=stars; j++)
            {
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=spaces;j++)
            {
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=stars; j++)
            {
                System.out.print("*");
            }
            System.out.println();
            if(i < 5) spaces -=2;
            else spaces += 2;
        }

        System.out.println();
         //bottom half
        initialSpace = 8 ; //2*n-2
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(int j=0;j<initialSpace;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            initialSpace -= 2;
            System.out.println();
        }


        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            for(int j=1;j<=2*5-2*i;j++)
            {
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println(" Pattern 21 - stars in the boundaries");
        //n = 5
        for(int i=0; i<5; i++)
        {
            for(int j=0;j<5;j++)
            {
                if(i == 0 || j == 0 || i == 5-1 || j == 5-1 )
                {
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern 22 ");
        int n = 4;
        for(int i=0; i<2*n-1; i++)
        {
            for(int j=0;j<2*n-1; j++)
            {
                int top = i;
                int left = j;
                int right = (2*n-2)-j;
                int bottom = (2*n-2)-i;

                System.out.print(n- Math.min(Math.min(top,bottom) ,  Math.min(left,right)));
            }
            System.out.println();
        }


    }


    
}
