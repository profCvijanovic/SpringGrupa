package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Glavna {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
			Profesor profa = context.getBean("hemicar",Profesor.class);
			Profesor profaNovi = context.getBean("hemicarNovi",Profesor.class);
			
			System.out.println(profa.pozdrav());
			System.out.println(profa.predmetKojiPredajem());
			
			System.out.println(profaNovi.pozdrav());
			System.out.println(profaNovi.predmetKojiPredajem());
		
		context.close();

	}

}
