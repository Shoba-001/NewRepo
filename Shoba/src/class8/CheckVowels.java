package class8;

public class CheckVowels {
public void checkVowels(String name) {
	if(name.contains("a")||name.contains("e")||name.contains("i")||name.contains("o")||name.contains("u")) {
		System.out.println("Contains Vowels");
	}
	else {
		System.out.println("Doesn't contain vowels");
	}
}
}
