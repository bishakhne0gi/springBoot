package com.ne0gi02.learner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:custom.properties")
public class MyFirstService {

    private final MyFirstClass myFirstClass;

    public MyFirstService(
            @Qualifier("Bean2") MyFirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;
    }

    public String tellAStory() {
        return ">> The dependency is saying: " + myFirstClass.sayHello();
    }

    private Environment environment;

    public Environment getEnvironment() {
        return environment;
    }

    @Autowired
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    public String getJavaVersion() {
        return environment.getProperty("java.version");
    }

    public String getOSName() {
        return environment.getProperty("os.name");
    }

    public String getcustomProperty() {
        return environment.getProperty("my.custom.property");
    }

    @Value("${my.prop}")
    private String customPropertyFromAnotherFile;

    public String getCustomPropertyFromAnotherFile() {
        return customPropertyFromAnotherFile;
    }

    public MyFirstClass getMyFirstClass() {
        return myFirstClass;
    }

}
