package top.fomeiherz.impl;

import com.alibaba.dubbo.config.annotation.Service;
import top.fomeiherz.model.People;
import top.fomeiherz.SpeakApi;

@Service
public class SpeakApiImpl implements SpeakApi {

    public String speak(People people) {
        return String.format("This people's age is %s.", people.getAge());
    }

}
