package udemy.global.properties;

import java.io.IOException;

import org.testng.annotations.Test;

public class ExecuteTestBaseClass extends TestBase {

	@Test
	public void executeParentClass() throws IOException{
		details();
	}
}
