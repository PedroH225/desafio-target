import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class main {

	public static void main(String[] args) {
		// Questão 1
		fibonacci(34);
		
		// Questão 2
		verifyA("Abacate");

	}
	
	private static void fibonacci(Integer num) {
		List<Integer> sequence = new ArrayList<Integer>();
		sequence.add(0);
		sequence.add(1);
		
		for (int i = 1; sequence.get(i) <= num; i++) {
			Integer sum = sequence.get(i);
			sum += sequence.get(i - 1);
			sequence.add(sum);
		}
		if (sequence.contains(num)) {
			System.out.println("O número inserido está presente na sequência.");
		} else {
			System.out.println("O número inserido não está presente na sequência.");
		}
	}
	
	private static void verifyA(String string) {
		Integer quantity = 0;
		List<Integer> list = new ArrayList<Integer>();
		String newString = string.toLowerCase();
		String[] letters = newString.split("");
		
		for (String tempString : letters) {
			if (tempString.equals("a")) {
				quantity++;
			}
		}
		
		System.out.println("Quantidade de vezes em que a letra 'a' aparece: " + quantity);
	}

}
