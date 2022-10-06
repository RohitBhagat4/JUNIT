package JunitSample.JunitProject;

import java.util.Arrays;
import java.util.List;

public class ToDoServiceStub implements TodoService {

	@Override
	public List<String> retrieveTodos(String user) {
		// TODO Auto-generated method stub
		return Arrays.asList("Learn Spring", "Lear Java",
                         "Learn Spring Boot");
	}

}
