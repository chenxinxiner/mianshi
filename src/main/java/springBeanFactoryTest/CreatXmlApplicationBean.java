package springBeanFactoryTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CreatXmlApplicationBean {
	public static void main(String[] args) {
		//使用spring容器
		ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = (Person)classPathXmlApplicationContext.getBean("person");
		System.out.println(person);
	}
}
