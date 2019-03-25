package top.fomeiherz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.fomeiherz.model.People;

public class Consumer {

    private static Logger logger = LoggerFactory.getLogger(Consumer.class);

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "spring-*.xml" });
        // Discover service
        SpeakApi speak = context.getBean("speakApi", SpeakApi.class);
        // Set properties
        People people = new People();
        people.setAge(7);
        logger.info(speak.speak(people));
    }

}
