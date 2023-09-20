package edu.wgu.d387_sample_code.internationalization;

import java.util.Locale;
import java.util.ResourceBundle;

public class WelcomeMessage implements Runnable {

    Locale locale;

    // Constructor
    public WelcomeMessage(Locale locale) {
        this.locale = locale;
    }

    public String getWelcomeMessage() {
        ResourceBundle bundle = ResourceBundle.getBundle("translation",locale);
        return bundle.getString("welcome");
    }

    @Override
    public void run() {
        System.out.println( "Thread verification: " + getWelcomeMessage() + ", ThreadID: " + Thread.currentThread().getId() );
    }
}
