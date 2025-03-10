

public class StringMethods {

	public static void main(String[] args) {

		String str = "VishalNarayanDutonde ";
		String s1 ="java";
		String s2 = "java";
		
	        System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.substring(13));// from beginindex  
		System.out.println(str.substring(6, 13));// from beginindex to endIndex
		System.out.println(str.length());
		System.out.println(str.charAt(4));
		System.out.println(str.isEmpty());
		System.out.println(str.isBlank());
		System.out.println(str.indexOf('a'));
		System.out.println(str.lastIndexOf('a'));
		System.out.println(str.trim());
		System.out.println("******str.contains********");
		System.out.println(str.contains("Vishal"));
		System.out.println(str.replace("Vishal", "Shalini"));
		System.out.println(str.replaceAll("Vishal","Sarala"));
                System.out.println(str.concat("patil"));
		System.out.println(str.startsWith("Vishal")); 
		System.out.println(str.endsWith("Dutonde"));	
		System.out.println(s1.equals(s2));
        	System.out.println(s1.compareTo(s2));	   
	        System.out.println(s1==s2);	
	}

}
