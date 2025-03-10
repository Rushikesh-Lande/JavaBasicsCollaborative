public class StringMethods {

	public static void main(String[] args) {
		String p = "TheGreenHulk";
		String q = "TheGreenBulk";
		System.out.println(p.toLowerCase());
		System.out.println(p.toUpperCase());
		System.out.println(p.toString());
		System.out.println(p.substring(3, 8));
		System.out.println(p.charAt(1));
		System.out.println(p.indexOf("G"));
		System.out.println(p.lastIndexOf('e'));
		System.out.println(p.length());
		System.out.println(p.trim());
		System.out.println(p.isEmpty());
		System.out.println(p.isBlank());
		System.out.println(p.contains("Green"));
        System.out.println(p.replace('G', 'C'));
        System.out.println(p.replaceAll("The", "This"));
        System.out.println(p.concat(" Kiran"));
        System.out.println(p.startsWith("The"));
        System.out.println(p.endsWith("Hulk"));
        System.out.println(p.equals(q));
    
	}

}
