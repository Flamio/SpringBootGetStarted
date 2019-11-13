package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestClass {

    @Autowired
    private ISource source;

    public String test()
    {
        String data = source.getData();
        return data + "_hello";
    }
}
