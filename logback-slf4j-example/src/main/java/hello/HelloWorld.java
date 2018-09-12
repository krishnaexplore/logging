package hello;
import org.joda.time.LocalTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import ch.qos.logback.classic.PatternLayout;
import ch.qos.logback.core.ConsoleAppender;

public class HelloWorld {
  //private static final 

  public static void main(String[] args) {
    Logger logger = LoggerFactory.getLogger(HelloWorld.class);
    MDC.put("somekey", "somevalue");
    LocalTime currentTime = new LocalTime();
    logger.debug("The current local time is: " + currentTime);
    logger.info("The current local time is: " + currentTime);
    logger.error("The current local time is: " + currentTime);
    
    
 // print internal state
    //LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
    //StatusPrinter.print(lc);

  }
}
