package guviTask5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Questionthree {

	public static void main(String[] args) {
		List<String> names=new ArrayList<>(
		Arrays.asList("Gandhi","Nehru","Kamaraji","Annamalai","Modi","Amith saha","Soniya Gandhi","RajendraPrasath","APJ","Naidu"));
		System.out.println("The Listed name:"+names);
		List<String> finalListedNames=names.stream().filter(n->n.startstWith("K")).collect(Collectors.toList());
		System.out.println("List containing only the names starting with 'K':"+finalListedNames);

}
}
