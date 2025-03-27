// find the seclargest element of an array
class SecLargeElementArray
{

public static void main(String[] args)
{

int[] arr ={10,20,50,40,30}; 
int secLarge=arr[0];
int firstLarge=arr[0];
for(int num:arr)
{
  if (num>firstLarge)
  {
        secLarge=firstLarge;
        firstLarge=num;
  }else if (num > secLarge && num < firstLarge) {  
                secLarge = num;  
            }
}
System.out.println(secLarge);
}
}