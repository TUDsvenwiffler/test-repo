package com.example.test;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringUtils {
	
		
	public Optional<Character> findFirstNonRepeating(String source) {
		var groups = source.chars().boxed().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		Optional<Entry<Integer, Long>> entry = groups.entrySet().stream().filter(e -> e.getValue()==1).findFirst();
		
		if(entry.isPresent()) {
			return Optional.of(Character.valueOf((char) entry.get().getKey().intValue()));
		}
		return Optional.empty();
		
		
	}
}
