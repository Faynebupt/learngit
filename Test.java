import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;

public class Test {
	
	 
	public void demo(){
		String xmlpath="applicationContext.xml";
		ApplicationContext applicationcontext=new ClassPathXmlApplicationContext(xmlpath);
		Service service=(Service) applicationcontext.getBean("service");
		service.transfer("jack", "rose", 100);
		
	}

}
ALL CHANGE
CHANGE AGAIN
