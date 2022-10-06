package JunitSample.JunitProject;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TodoServiceImplMockTest {

 TodoServiceImpl todoBusiness;

 // The Mockito.mock() method allows us to
 // create a mock object of a class or an interface
 TodoService todoServiceMock=mock(TodoService.class);

 // Methods annotated with the @Before
 // annotation are run before each test
 @Before
 public void setUp()
 {
     todoBusiness = new TodoServiceImpl(todoServiceMock);
 }



 // @Test
 // Tells the JUnit that the public void method
 // in which it is used can run as a test case
 @Test
 public void testRetrieveTodosRelatedToSpring_usingMock()
 {
     List<String> todos
         = Arrays.asList("Learn Spring", "Lear Java",
                         "Learn Spring Boot");
     when(todoServiceMock.retrieveTodos("User"))
         .thenReturn(todos);
 
     List<String> filteredTodos
         = todoBusiness.retrieveTodosRelatedToJava(
             "User");
     assertEquals(1, filteredTodos.size());
 }

 @Test
 public void
 testRetrieveTodosRelatedToSpring_withEmptyList_usingMock()
 {
     List<String> todos = Arrays.asList();
     when(todoServiceMock.retrieveTodos("Dummy"))
         .thenReturn(todos);

     List<String> filteredTodos
         = todoBusiness.retrieveTodosRelatedToJava(
             "Dummy");
     assertEquals(0, filteredTodos.size());
 }
}