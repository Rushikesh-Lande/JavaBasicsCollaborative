public class MaxArray{
public static void main (String[]args){
int [] a={10,50,80,90,20};
int max=a[0];
for(int i=0;i<a.length;i++){
if(a[i]>max){
       max=a[i];
}
}System.out.println(+max);
}
}