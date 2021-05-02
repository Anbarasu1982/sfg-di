package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		I18NController i18nController = (I18NController) ctx.getBean("i18NController");

		System.out.println("Profile Based Injection---->>>");

		System.out.println(i18nController.sayHello());

		MyController myController = (MyController) ctx.getBean("myController");

		String greetings = myController.sayHello();

		System.out.println("Greetings from MyController::: " + greetings);

		System.out.println("Property ----->>>>");

		PropertyInjectedController controller = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

		System.out.println(controller.getGreeting());

		System.out.println("Setter ------>>>>");

		SetterInjectedController controller1 = (SetterInjectedController) ctx.getBean("setterInjectedController");

		System.out.println(controller1.getGreeting());

		System.out.println("Constructor --->>>>");

		ConstructorInjectedController controller2 = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

		System.out.println(controller2.getGreeting());
	}

}
