package junit.tutorial;

public class Sleep {
	
	public void Sleep5mintues() {
		
		try {
			System.out.println("5秒停止します");
			Thread.sleep(5000);
			System.out.println("一時停止を終了します");
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
