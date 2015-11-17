import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aop.core.BusinessService;

public class TestAOP {
	
	
	public static void main(String[] args) throws Exception{
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/aop/config/spring.xml");
		
		BusinessService service = (BusinessService)ctx.getBean("businessService");
		
		service.coreServiceBefore();
		
		System.out.println("---------------------------");
		
		service.coreServiceAfterReturn();
		
		System.out.println("---------------------------");
		
		service.businessMethod();
		
	}

	
	
}
