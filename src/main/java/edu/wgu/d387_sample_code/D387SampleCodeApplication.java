package edu.wgu.d387_sample_code;

import edu.wgu.d387_sample_code.internationalization.TZConvert;
import edu.wgu.d387_sample_code.internationalization.TZConvertController;
import edu.wgu.d387_sample_code.internationalization.WelcomeMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.ClassPathResource;

import java.io.InputStream;
import java.util.Locale;
import java.util.Properties;

@SpringBootApplication
public class D387SampleCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(D387SampleCodeApplication.class, args);

		// Create threads for the Welcome Message in French and English
		WelcomeMessage welcomeMessageEnglish = new WelcomeMessage(Locale.US);
		Thread englishWelcomeThread = new Thread(welcomeMessageEnglish);
		englishWelcomeThread.start();

		WelcomeMessage welcomeMessageFrench = new WelcomeMessage(Locale.CANADA_FRENCH);
		Thread frenchWelcomeThread = new Thread(welcomeMessageFrench);
		frenchWelcomeThread.start();

		// Test time conversion
		System.out.println("Testing time conversion: " + TZConvert.getTime());
	}

}
