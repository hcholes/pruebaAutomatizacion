package co.com.sofka.certificacion.utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.logging.Level;

public class RobotUtil {
	static Robot bot;

	private RobotUtil() {

	}

	public static void fnBotEnter() {

		try {
			bot = new Robot();
			bot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
		} catch (AWTException e) {

			MyException.logger().log(Level.INFO, MyException.EXCEP_LOG, e);
		} catch (InterruptedException e) {

			MyException.logger().log(Level.WARNING, "Interrupted", e);
			Thread.currentThread().interrupt();
		}

	}

	public static void fnBotSuprimir() {
		try {

			bot = new Robot();
			bot.keyPress(KeyEvent.VK_DELETE);
		} catch (AWTException e) {

			MyException.logger().log(Level.INFO, MyException.EXCEP_LOG, e);
		}
	}
	
	public static void fnDelete() {
		try {

			bot = new Robot();
			bot.keyPress(KeyEvent.VK_CLEAR);
		} catch (AWTException e) {

			MyException.logger().log(Level.INFO, MyException.EXCEP_LOG, e);
		}
	}

	public static void fnBotTab() {
		try {

			bot = new Robot();
			bot.keyPress(KeyEvent.VK_TAB);
		} catch (AWTException e) {

			MyException.logger().log(Level.INFO, MyException.EXCEP_LOG, e);
		}

	}

	public static void fnBotAvPag() {
		try {

			bot = new Robot();
			bot.keyPress(KeyEvent.VK_PAGE_DOWN);
		} catch (AWTException e) {

			MyException.logger().log(Level.INFO, MyException.EXCEP_LOG, e);
		}

	}

	public static void fnBotDown() {
		try {

			bot = new Robot();
			bot.keyPress(KeyEvent.VK_DOWN);
		} catch (AWTException e) {

			MyException.logger().log(Level.INFO, MyException.EXCEP_LOG, e);
		}

	}
	
	public static void fnBotSpace() {
		try {
			
			bot = new Robot();
			bot.keyPress(KeyEvent.VK_ESCAPE);				
		} catch (AWTException e) {

			MyException.logger().log(Level.INFO,MyException.EXCEP_LOG,e);
		}
		
	
	}

	
	

	

}
