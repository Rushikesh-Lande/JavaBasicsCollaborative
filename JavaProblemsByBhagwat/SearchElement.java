//Write a program to find the Specific array in java 
public class SearchElement{
public boolean foundElement(int[]a,int key){
boolean flag = false;
for(int i=0;i<a.length;i++){
if(a[i]==key){
      flag=true;
        break;
}
}
if(flag){
System.out.println("Element found in the array:"+key);
}else{
System.out.println("Element not found in an array:"+key);
}return flag;
}
public static void main(String[] args){
 SearchElement se = new SearchElement();
int []a={10,20,30,40,50};
int key =30;
boolean result = se.foundElement(a,key);
}
}