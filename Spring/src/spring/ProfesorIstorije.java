package spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//ukoliko ne dodamo id u zagradu, po default-u id je isti kao ime klase, samo samalim pocetnim slovom
@Component
@Scope("prototype")
public class ProfesorIstorije implements Profesor {
	
	@Autowired
	private PredmetAnotacije predmet;
	
	@Override
	public String pozdrav() {
		return "Pozdrav od Herodota!";
	}

	@Override
	public String predmetKojiPredajem() {
		return predmet.mojPredmet(" klasicna istorija");
	}
	
	@PostConstruct
	public void initMetoda() {
		System.out.println("Ja sam init");
	}
	
	@PreDestroy
	public void destroyMetoda() {
		System.out.println("Ja sam destroy");
	}

}
