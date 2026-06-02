package selenuimTest;

import java.util.NoSuchElementException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider2 {

	@Test(dataProvider ="verifyLoginWithDataSet",expectedExceptions =NoSuchElementException.class)
	public void verifyTheLogin(String id, String password) {
		System.out.println("id=" + id);
		System.out.println("password=" + password);

	}
	
	@DataProvider(name="verifyLoginWithDataSet")
	public Object[][] testData(){
		
		Object[][] data= {
				{"ajeet@gmail.com","123@kum"},{"ajeet@yopmail","123345"},{"test@gmail.com","1234567"}
				
		};
		return data;
		
	}
	
}
