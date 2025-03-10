

public class StringComparision {
// equals() method checked the containt or data of the object.
// == operator it will checked object referenced or memory reference (where it is stored)
	
	
	 public static void main(String[] args) {
	 String str1 = "java"; // String literal process
	 String str2 = "java";
	 String str3 =  new String("java");// new operator process
	 System.out.println(str1.equals(str2));
	 
	 System.out.println(str1 == str2);
	 
	 System.out.println(str1.equals(str3));
	 
	 System.out.println(str1 == str3);//false 


	}

}
