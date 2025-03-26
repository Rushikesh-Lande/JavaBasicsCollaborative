//write the lefthand rightangletriangle * pattern program ?

public class LeftHandRightAngTri
{
public void showTriangle(int row)   

{
for(int i=row; i>=1; i--)  
    {  
        for (int k=0;k<row-i;k++)                              
	{  
           System.out.print(" ");
        }
        for (int j=1;j<=i;j++)                              
	{  
           System.out.print("*");
        }
	

	
     System.out.println();
    }
}


public static void main(String[] args)
{
LeftHandRightAngTri tP = new LeftHandRightAngTri();
tP.showTriangle(5);
}
}