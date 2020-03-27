package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GlavnaAnotacije {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springAnotacija.xml");
			Profesor profa = context.getBean("profesorIstorije",Profesor.class);
			
			System.out.println(profa.pozdrav());
			System.out.println(profa.predmetKojiPredajem());
		
		context.close();
		
		
		
		
	}

}
