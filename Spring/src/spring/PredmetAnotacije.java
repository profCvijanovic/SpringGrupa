package spring;

import org.springframework.stereotype.Component;

@Component
public class PredmetAnotacije {
	
	public String mojPredmet(String predmetKojiPredajem) {
		return "Ja predajem "  + predmetKojiPredajem;
	}

}
