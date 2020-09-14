import java.sql.Time;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Banking {

	Calculator calc = new Calculator();

	public void profit() {

	}

	public void loss() {

	}

	public void addSalary() {
		calc.add();
	}

	public static void main(String[] args) throws InterruptedException {
//		Banking b = new Banking();
//		b.addSalary();
		FirefoxDriver frx = new FirefoxDriver();
		frx.get("https://google.com");
//		Thread.sleep(555);
		frx.close();
	}

}
