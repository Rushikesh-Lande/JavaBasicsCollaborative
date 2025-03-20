// remove the spaces before the String and After the Strig  ?
public class WithoutTrim {

	public static String removeSpace(String str) {
		int start = 0;
		int end = str.length() - 1;//14

		while (start <= end && str.charAt(start) == ' ')
		{
			start++;
		}

		while (end >= start && str.charAt(end) == ' ') {
			end--;
		}

		return str.substring(start, end + 1);

	}

	public static void main(String[] args) {

		WithoutTrim wt = new WithoutTrim();
		String removedSp = wt.removeSpace("  Hello World  ");
		System.out.println(removedSp);

	}

}