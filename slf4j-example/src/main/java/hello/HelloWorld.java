package hello;
import org.joda.time.LocalTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;


public class HelloWorld {
  private static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);

  public static void main(String[] args) {
    MDC.put("somekey", "somevalue");
    LocalTime currentTime = new LocalTime();
    logger.debug("The current local time is: " + currentTime);
    logger.info("The current local time is: " + currentTime);
    logger.error("The current local time is: " + currentTime);
  }
}
