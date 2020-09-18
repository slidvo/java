
public class TrycatchDemo {
	public static void tryCatchMethodDemo() {
		try {
			System.out.println(10 / 0);
		} catch (Exception e) {
//			System.out.println("Error occurred");
//			System.out.println(e);
			e.printStackTrace();

		}finally {
			System.out.println("Block finally is runs always");
		}
		System.out.println("The end.");
		
//		Thread.sleep(1000); Unhandled exception
		try {
			Thread.sleep(1000);
		} catch(Throwable t){
			System.out.println(t.getMessage());
		} finally {
			System.out.println("End of Thread.sleep trycatch block");
		}
		
		
	}

}
