package hello;
import org.joda.time.LocalTime;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
public class HelloWorld {
  private static Logger logger = LogManager.getLogger(HelloWorld.class);
  public static void main(String[] args) {

    LocalTime currentTime = new LocalTime();
    logger.debug("The current local time is: " + currentTime);
    logger.info("The current local time is: " + currentTime);
    logger.error("The current local time is: " + currentTime);
  }
}
