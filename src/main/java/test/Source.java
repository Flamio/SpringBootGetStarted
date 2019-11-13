package test;

import org.springframework.stereotype.Component;

@Component
public class Source implements ISource {
    @Override
    public String getData() {
        return "asdasd";
    }
}
