package src.reflectorAOP;

import java.util.Date;
import src.reflectorAOP.Level;

public class Logger {
	/**
     * 根据等级记录日志
     * @param level
     * @param context
     */
	public static void logging(Level level, String context) {
	    if (level.equals(Level.INFO)) {
	        System.out.println(new Date().toLocaleString() + " " + context);
	    }
	    if (level.equals(Level.DEBUGE)) {
	        System.err.println(new Date() + " " + context);
	    }
	}
}
