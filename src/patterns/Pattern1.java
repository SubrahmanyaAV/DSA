package patterns;

public class Pattern1 {


    //You don't need to input anything. Complete the function printSquare() which takes  an integer n  as the input parameter and print the pattern.
    //Constraints: 1<= N <= 20

    //Test cases => program will run for multiple cases ,test cases can be 2, 4, 5
    static void printHash(int n){
            
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        // 1 
        printHash(5);
        
        

        //2
        for(int i=0; i<5; i++)
        {
            for(int j=0; j<4; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("____________");


        //3
        for(int a=0; a<10 ; a++)
        {
            for(int b=0; b<7; b++)
            {
                System.out.print("$ ");
            }
            System.out.println();
        }

    }
    
}
