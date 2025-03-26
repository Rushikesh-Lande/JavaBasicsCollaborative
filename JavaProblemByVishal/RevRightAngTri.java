//write the reverse right angle triangle * pattern program ?

public class RevRightAngTri
{
public void showTriangle(int row)   

{
for(int i=row; i>=1; i--)  
    {  
	for (int j=1;j<=i;j++)                              
	{  
           System.out.print("* ");
        }
     System.out.println();
    }
}


public static void main(String[] args)
{
RevRightAngTri tP = new RevRightAngTri();
tP.showTriangle(5);
}
}