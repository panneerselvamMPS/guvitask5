package guviTask5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Qestionone {

	public static void main(String[] args) {
		List<String> name = new ArrayList<String>(Arrays.asList("panneer","selvam","mps"));
		List<String> mps=name.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(mps);
		// TODO Auto-generated method stub

	}

}
