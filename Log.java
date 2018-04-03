public class Log {

  private static Log instance;

  protected void Log() {
  }

  public static Log getInstance() {
  return null;
  }

  public static void log(LogType logType, String message, Integer logNum) {
  }

  public static void error(String message) {
  }

  public static void error(String message, Integer logNum) {
  }

  public static void warning(String message) {
  }

  public static void warning(String message, Integer logNum) {
  }

  public static void info(String message) {
  }

  public static void info(String message, Integer logNum) {
  }

  public static void performance(String message) {
  }

  public static void performance(String message, Integer logNum) {
  }

  public static void delay(String message) {
  }

  public static void delay(String message, Integer logNum) {
  }

}