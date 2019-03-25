package top.fomeiherz.impl;

import org.springframework.stereotype.Component;
import top.fomeiherz.model.People;
import top.fomeiherz.SpeakApi;

@Component("speakApi")
public class SpeakApiImpl implements SpeakApi {

    public String speak(People people) {
        return String.format("This people's age is %s.", people.getAge());
    }

}
