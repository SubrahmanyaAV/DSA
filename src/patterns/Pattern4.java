package patterns;

public class Pattern4 {
    
    public static void main(String[] args) {
        
        System.out.println("Pattern 10");
        for(int i=0; i<2*5-1;i++)
        {
            int stars = i;
            if(i>5) stars = 2*5-i;
            
            for(int j=0; j<stars; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1; i<=2*5-1;i++)
        {
            int stars = i;
            if(i>5) stars = 2*5-i;
            
            for(int j=1; j<=stars; j++)
            {
                System.out.print("^");
            }
            System.out.println();
        }

        System.out.println("Pattern 11 - Right triangle (1,0)");
        int start = 1;
        for(int i=0; i<5;i++)
        {
            if(i%2==0) start=1;
            else start=0;
            for(int j=0;j<=i; j++)
            {
                System.out.print(start);
                start=1 -start;
            }
            System.out.println();
        }

        System.out.println(" Pattern 12");
        int space = 2*(5-1);
        for(int i=1; i<=5; i++)
        {
            //int space = 2*(5-1);//spaces not gonna work initial space before for loop like above 
            //Numbers
            for(int j=1; j<=i; j++)
            {
                System.out.print(j + " ");
            }
            //space
            for(int j=1; j<=space; j++)
            {
                System.out.print(" ");
                // space = space -2; //cannot remove space here cause the below numbers will not have the required space
            }
            //Numbers
            for(int j=i; j>=1; j--)
            {
                System.out.print(j);
            }
            System.out.println();
            space -= 2;
            //or  space = space-2; 
        }

        System.out.println(" Pattern 13");
        int num = 1;
        for(int i=0; i<=5; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print(num + " ");
                num = num + 1;
            }
            System.out.println();
        }
    }
}
