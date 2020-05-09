package Y_Ruby;



public class Lesson__3__Exception2 {
	public static void main(String[] args)  {
		try {
		Array(3, 5, 7,8 );
		}catch(Exception e) {
			System.out.println(e);
		}
		String[] array2 = {"emre","gulen","reyhan","senel"};
	     for (String list : array2) {
		System.out.print(list+" ");	
		}
	}
	public static void Array(int num, int num2, int num3, int num4) {
		if (num % 2 == 0 || num2 % 2 == 0 || num3 % 2 == 0 || num4 % 2 == 0) {
			throw new EvenNumberException("you can not input even numbers");
		}
		int[] array = { num, num2, num3, num4 };
		for (int i : array) {
			System.out.print(i + " ");
		}
	}
}
class EvenNumberException extends RuntimeException {
	EvenNumberException(String message) {
		super(message);
	}
}