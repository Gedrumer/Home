package by.academy.homework7;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
	private static List<Long> generateLongList(Integer seed, Integer size) {
		Supplier<Long> s = () -> new Random().nextLong(seed);
		return Stream.generate(s).limit(size).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		List<Long> longList = generateLongList(100, 100);
		List<Long> sortedList = longList.stream().map(i -> ((long) (i * Math.PI) - 20)).filter(i -> i < 100).sorted()
				.skip(3).collect(Collectors.toList());
		System.out.println(sortedList);
		Map<Long, String> mapList = sortedList.stream()
				.collect(Collectors.toMap(i -> i, p -> "Number: " + p, (v1, v2) -> v1));
		System.out.println(mapList);
	}

}
