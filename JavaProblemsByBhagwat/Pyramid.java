//Write a program to print a pyramid 

public class Pyramid {
    void printPyramid(int rows) {
        int i, j, k;
        for (i = 1; i <= rows; i++) {  
            
            for (j = rows; j > i; j--) {  
                System.out.print(" ");
            }
            
           
            for (k = 1; k <= (2 * i - 1); k++) {  
                System.out.print("*");
            }
            
            System.out.println(); 
        }
    }

    public static void main(String[] args) {
        Pyramid p = new Pyramid();
        p.printPyramid(5);
    }
}