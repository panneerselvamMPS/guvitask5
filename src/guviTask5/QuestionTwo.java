package guviTask5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class QuestionTwo {

	public static void main(String[] args) {
		List<String> name= new ArrayList<>(Arrays.asList("abc","","def","jkl","","","def"));
		List<String> selectedList=name.stream().filter(n->!(n.isEmpty())).collect(Collectors.toList());
		System.out.println(selectedList);// TODO Auto-generated method stub

	}

}
