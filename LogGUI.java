import java.util.Vector;

public class LogGUI {

  protected static LogGUI instance;

    /**
   * 
   * @element-type LogData
   */
  public Vector  logsAll;
    /**
   * 
   * @element-type LogData
   */
  public Vector  logsFiltered;

  public static LogGUI getInstance() {
  return null;
  }

  public void createWindow() {
  }

  public void loadLogDataArray(LogDataArray logs) {
  }

  public void sortByDate(Boolean ascending) {
  }

  public void sortByLogType(Boolean ascending) {
  }

  public void sortByMessage(Boolean ascending) {
  }

  public void sortByLogNum(Boolean ascending) {
  }

  public void filterLogs(LogType logType, string message, Integer logNum, Integer dateStart, Integer dateEnd) {
  }

}