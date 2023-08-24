package testcasesreservation;

import org.testng.annotations.Test;

public class TestCases {

	// Priority well be High for Least Number
	// Priority Well Be low for largest Number
	@Test(priority = 1, groups = { "sanity" })
	public void ab() {
		System.out.println("ab");
	}

	@Test(priority = 0, groups = { "smoke" })
	public void ef() {
		System.out.println("ef");
	}

	@Test(groups = { "sanity", "regrassion" })
	public void gh() {
		System.out.println("gh");
	}

	@Test(groups = { "sanity", "system" })
	public void cd() {
		System.out.println("cd");
	}

	@Test(groups = { "smoke", "sanity", "regrassion" })
	public void ij() {
		System.out.println("ij");
	}

}
