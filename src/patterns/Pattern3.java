package patterns;

public class Pattern3 {
    
    public static void main(String[] args) {
        
        System.out.println("Pattern 9 - (Diamond) combination of 7 & 8");
        for(int i = 0; i < 5; i++)
        {   //top
            for(int j = 0; j < 5-i-1 ; j++)
            {
                System.out.print(" ");
            }
            for(int j = 0; j < 2*i+1; j++)
            {
                System.out.print("*");
            }
            for(int j = 0; j < 5-i-1; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
        //bottom
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < i; j++)
            {
                System.out.print(" ");
            }
            for(int j = 0; j < 2*5-(2*i+1); j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("To print diamond( middle spaces)");
          // another way with middle space
          for(int i = 0; i < 5; i++)
          {
              for(int j = 5-i-1; j > 0; j--)
              {
                  System.out.print(" ");
              }
              for(int j = i+1; j > 0; j--)
              {
                  System.out.print("*" + " ");
              }
              System.out.println();
          }
          for(int i = 5; i > 0; i--){
              for(int j = 5-i; j > 0; j--)
              {
                  System.out.print(" ");
              } 
              for(int j = i-1+1; j > 0; j--)
              {
                  System.out.print("*" + " ");
              }
              System.out.println();
          }

    }
}
