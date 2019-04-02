package top.fomeiherz;

import com.alibaba.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import top.fomeiherz.model.People;

@Component
public class Consumer {

    private static Logger logger = LoggerFactory.getLogger(Consumer.class);

    @Reference
    SpeakApi speakApi;

    public void speak() {
        // Set properties
        People people = new People();
        people.setAge(7);
        logger.info(speakApi.speak(people));
    }

}
