package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Glavna {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Profesor profa = context.getBean("matematicar",Profesor.class);
		
		System.out.println(profa.pozdrav());
		System.out.println(profa.predmetKojiPredajem());

	}

}
