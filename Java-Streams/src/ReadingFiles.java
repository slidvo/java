import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadingFiles {

	public static void main(String[] args) throws Throwable {
		String userDir = System.getProperty("user.dir");
		File f = new File(userDir + "/files/file1.txt");
		FileReader fr = new FileReader(f);
		BufferedReader reader = new BufferedReader(fr);
		String str = null;
		while ((str = reader.readLine()) != null) {
			System.out.println(str);
			Thread.sleep(500);
		}
		reader.close();

	}

}
