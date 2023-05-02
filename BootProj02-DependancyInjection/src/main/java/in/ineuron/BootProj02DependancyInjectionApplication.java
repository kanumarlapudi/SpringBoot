package in.ineuron;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import in.ineuron.comp.WishMessageGenerator;

@SpringBootApplication
public class BootProj02DependancyInjectionApplication {
	
	static {
		System.out.println("BootProj02DependancyInjectionApplication.class file is loading");
	}

	public BootProj02DependancyInjectionApplication() {
		System.out.println("BootProj02DependancyInjectionApplication :: zero parameter constructor");
	}
	
	@Bean
	public LocalDateTime createObj() {
		System.out.println("BootProj02DependancyInjectionApplication.createObj()");
		return LocalDateTime.now();
	}
	
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootProj02DependancyInjectionApplication.class, args);
		
		WishMessageGenerator wmg = context.getBean(WishMessageGenerator.class);
		System.out.println(wmg);
		
		String msg = wmg.greetUser("Harish");
		System.out.println(msg);
		
		((ConfigurableApplicationContext) context).close();
	}

}
