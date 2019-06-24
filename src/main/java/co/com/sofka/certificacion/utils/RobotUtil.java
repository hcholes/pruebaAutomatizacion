package co.com.sofka.certificacion.utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.logging.Level;

public class RobotUtil {
	static Robot bot;

	private RobotUtil() {

	}

	public static void fnBotTab() {
		try {

			bot = new Robot();
			bot.keyPress(KeyEvent.VK_TAB);
		} catch (AWTException e) {

			MyException.logger().log(Level.INFO, MyException.EXCEP_LOG, e);
		}

	}

}
