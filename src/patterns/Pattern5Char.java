package patterns;

public class Pattern5Char {
    
    public static void main(String[] args) {
        
        System.out.println(" Pattern 14 - right triangle (char)");
        for(int i=0; i<5; i++)
        {
            for(char ch = 'A'; ch <= 'A' + i; ch++)
            {
                System.out.print(ch + " ");
            }
            System.out.println();
        }

        System.out.println(" Pattern 15 - reverse char ");
        for(int i =0; i<=5; i++)
        {
            for(char ch='A'; ch <= 'A' + (5-i-1); ch++)
            {
                System.out.print(ch + " ");
            }
            System.out.println();
        }

        System.out.println(" Pattern 16 - right char triangle");
        
       for(int i=0; i<5; i++)
       { //have to add (char) or type mismatch cannot convert from int to char
        char ch = (char) ('A' + i); 
        for(int j=0; j<=i; j++)
        {
            System.out.print(ch);
        }
        System.out.println();
       }

       System.out.println("Pattern 17 - space,char,space (Triangle)");
       for(int i=0; i<5; i++)
       {
       //space
            for(int j=0 ; j<5-i-1; j++)
            {
                System.out.print(" ");
            }

       //characters
            char ch = 'A';
            int breakpoint = (2*i+1)/2;
            for(int j=1; j<=2*i+1; j++)
            {
                System.out.print(ch);
                if(j <= breakpoint) ch++;
                else ch--;
            }
       //space
            for(int j=0 ; j<5-i-1; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }    

       System.out.println("Pattern 18");
       for(int i=0;i<5;i++)
       {
        for(char ch=(char) ('E' - i);ch<= 'E';ch++)
        {
            System.out.print(ch + " ");
        }
        System.out.println();
       }
       System.out.println();

       for(int i=0;i<5;i++)
       {
        for(char ch= 'A'+5 -1 ;ch>= 'A' + 5-i;ch--)
        {
            System.out.print(ch + " ");
        }
        System.out.println();
       }

       System.out.println("different way - pattern 18");
       int n =5;
       for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            System.out.print((char)((64+n)-j)+" ");
        }
        System.out.println();
    }

}
    
}
