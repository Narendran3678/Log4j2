import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class AppClass {
	private static Logger logger = LogManager.getLogger("App-log");
	public static void printLog() {
		logger.info("AppClass Log");
	}
}

public class ConsoleFileAppender {
	private static Logger logger = LogManager.getLogger("commons-log");
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++)
			logger.debug("ConsoleFileAppender Log [" + i + "]");
		AppClass.printLog();
	}
}
