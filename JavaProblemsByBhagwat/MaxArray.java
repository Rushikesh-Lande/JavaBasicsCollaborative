//find the max element in an array
public class MaxArray{
public int  findMax(int a[]){
int max=a[0];
for(int i=0;i<a.length;i++){
if(a[i]>max){
       max=a[i];
}
}return max;
}
public static void main (String[]args){
MaxArray ma = new MaxArray();
int [] a ={10,20,30,40,50};
System.out.println("The max array is :"+ma.findMax(a));

}


}