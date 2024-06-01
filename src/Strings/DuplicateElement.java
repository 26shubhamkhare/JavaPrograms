package Strings;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElement {

	public static void main(String[] args) {
		// Print duplicate word from String s

		String books[] = { "Java", "C++", "Python", "Ruby", "JavaScript", "Python", "C++" };

		// 1. compare each element :O(n*n) worst solution
		for (int i = 0; i < books.length; i++) {
			for (int j = i + 1; j < books.length; j++) {
				if (books[i].equals(books[j])) {
					System.out.println("The duplicate word is:" + books[i]);
				}
			}
		}
		System.out.println("-----------------2. Using Set------------------------------");
		// 2. Using Hashset(Collection): Set it Store Unique Values TC: O(N)
		Set<String> set = new HashSet<String>();
		for (String i : books) {
			if (set.add(i) == false) {
				System.out.println("The duplicate Sting is:" + i);
			}
		}
		System.out.println("-----------------3. Using HashMap-TC: O(2n)/O(n)-----------------------------");

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String j : books) {
			Integer count = map.get(j);
			if (count == null) {
				map.put(j, 1);

			} else {
				map.put(j, ++count);

			}
		}
		// get the values from this HashMap
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		for(Entry<String,Integer> entry : entrySet ) {
			if(entry.getValue()>1) {
				System.out.println("Duplicate using HashMap:" + entry.getKey());
			}
		}
		}

}
