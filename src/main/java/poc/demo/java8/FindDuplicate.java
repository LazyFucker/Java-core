package poc.demo.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicate {
	public static void main(String[] args) {
		List<Integer> numberList=Arrays.asList(1,2,3,4,2);
		
		Set<Integer> unIntegers=new HashSet<>();
		Set<Integer> duplicateSet=numberList.stream().filter(num->!unIntegers.add(num)).collect(Collectors.toSet());
	
		System.out.println(duplicateSet);
	}

}
