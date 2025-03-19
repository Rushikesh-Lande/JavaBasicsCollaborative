//write a program to print this pyramid, take a user input to decide the rows?
public class PyramidPattern
{

public void showPyramid(int row)
{
  for(int i = 1; i<=row; i++ )//row
  {
     for(int j=row;j>i;j--)
     { 
        System.out.print(" ");   
     }
     
     for(int k=1; k<=i;k++)
     {
             System.out.print("* ");   
     }
             System.out.println();   

  }
}

public static void main(String[] args)
{
    PyramidPattern pp = new PyramidPattern();
    pp.showPyramid(5);
}
}