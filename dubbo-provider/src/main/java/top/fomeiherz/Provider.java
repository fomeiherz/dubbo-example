package top.fomeiherz;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {

    public static void main(String[] args) {
        try {
            System.setProperty("java.net.preferIPv4Stack", "true");
            // Load spring configuration
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-*.xml");
            context.start();
        } catch (Exception exception) {
            throw new RuntimeException("Provider context start error: " + exception);
        }
        synchronized (Provider.class) {
            while (true) {
                try {
                    Provider.class.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException("synchronized error: " + e);
                }
            }
        }
    }

}
