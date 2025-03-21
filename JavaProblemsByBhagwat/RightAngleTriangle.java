//Write a program to print a right angle traingle  

public class RightAngleTriangle{
public void patternProgran(int rows){
             
            for (int i =1; i<=rows; i++) {  
           for (int j=1; j<=i; j++) {  
             System.out.print("* ");           
        }     
System.out.println();     
        }
                            

    }

    public static void main(String[] args) {
        RightAngleTriangle rt = new RightAngleTriangle();
       rt.patternProgran(5);
    }
}