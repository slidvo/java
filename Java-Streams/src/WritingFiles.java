import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles {

	public static void main(String[] args) throws IOException {
		String userDir = System.getProperty("user.dir");
		File f = new File(userDir + "/files/file1.html");
		FileWriter fw = new FileWriter(f);
		BufferedWriter writer = new BufferedWriter(fw);

		writer.write("<html>"
				+ "<head>"
				+ "<title>Java Streams</title>"
				+ "</head>"
				+ "<body>"
				+ "<h1><span style='color:red;'>Learning Java</span> from way2automation!</h1>"
				+ "</body>"
				+ "</html>");
		
		//		writerInCycle(writer);

		// writer.write("First line");
//		writer.newLine();
//		writer.write("Russia");
//		writer.newLine();
//		writer.write("Way2Automation");

		writer.close();
		System.out.println("Information was recorded");
	}

	static void writerInCycle(BufferedWriter w) {
		try {
			w.write("=,=,=,=,=");
			w.newLine();
		} catch (Throwable t) {
			t.printStackTrace();
		}
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 4; j++) {
				int num = (int) (Math.random() * 100);
				try {
					w.write(num + ",");
				} catch (Throwable t) {
					t.printStackTrace();
				}
			}
			try {
				w.newLine();
			} catch (Throwable t) {
				t.printStackTrace();
			}
		}

	}

}
