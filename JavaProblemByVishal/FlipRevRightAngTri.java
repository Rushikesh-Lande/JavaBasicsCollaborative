//write the flip reverserightangletriangle * pattern program ?

public class FlipRevRightAngTri
{
public void showTriangle(int row)   

{
for(int i=1; i<=row; i++)  
    {  

	for (int k=1;k<=row-i;k++)                              
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
FlipRevRightAngTri tP = new FlipRevRightAngTri();
tP.showTriangle(5);
}
}