package talendCicd;
//https://search.maven.org/artifact/org.oxerr.spring.security/spring-security-wechat-core/0.0.2/jar
import org.slf4j.*;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
public class cicd_demo {
    public static void main(String[] args) {
    	System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");

        final org.slf4j.Logger log = LoggerFactory.getLogger(cicd_demo.class);

        log.trace("trace");
        log.debug("debug");
        log.info("info");
        log.warn("warning");
        log.error("error");

    	LocalTime currentTime = new LocalTime();
		LocalDateTime currentDateTime = new LocalDateTime();
        System.out.println("The current local time is: " + currentTime);
        System.out.println("The current local date is: " + currentDateTime);
		
		Greeter greeter = new Greeter();
		System.out.println(greeter.sayHello());

		Logger logger = LoggerFactory.getLogger(cicd_demo.class);
		logger.info("hello");
    }
}

