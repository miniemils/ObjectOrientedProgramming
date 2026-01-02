package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		list.add(0, "Marco");
		list.remove("Alex"); //list.remove("1");
		System.out.println(list.size());
		System.out.println();
		
		list.removeIf(x -> x.charAt(0) == 'B');
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println();
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
		for(String x : result) {
			System.out.println(x);
		}
		
		String firstElement = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println();
		System.out.println(firstElement);
		
		sc.close();
	}

}