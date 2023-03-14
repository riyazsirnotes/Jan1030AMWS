package mar14th;

public class MethodsDemo3 {

	public static void main(String[] args) {

		MethodsDemo3 abc=new MethodsDemo3();
		abc.natSum(5);

	}

	private int natSum(int num) {

		int res = 0;

		for (int i = 1; i <= num; i++) {
			res = res + i;
		}
		return res;

	}

}
