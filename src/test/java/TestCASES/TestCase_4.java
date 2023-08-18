package TestCASES;

import org.testng.annotations.Test;

public class TestCase_4 {
	@Test(groups = "smoke")
	public void rename() {
		System.out.println("-----rename111111 org-----");
	}
	@Test(groups = "update")
	public void update() {
		System.out.println("-----update007 org-----");
	}
	@Test(groups = "smoke")
	public void delete() {
		System.out.println("-----delete 222222org-----");
	}
}


