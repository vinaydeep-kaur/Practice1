

public class test {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abc");
		sb.append(1);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb.toString());
		sb.insert(3, "xyz");
		System.out.println(sb);
		sb.replace(2, 3, "ABC");
		System.out.println(sb);
		String sub = sb.substring(2,4);
		System.out.println(sub);
		sb.delete(0,1);
		System.out.println(sb);
	}
}
