package spring;

public class ProfesorHemije implements Profesor {
	
	private Predmet predmet;
	
	public Predmet getPredmet() {
		return predmet;
	}

	public void setPredmet(Predmet predmet) {
		this.predmet = predmet;
	}

	@Override
	public String pozdrav() {
		return "Pozdrav od Mendeljejeva!";
	}

	@Override
	public String predmetKojiPredajem() {
		return predmet.mojPredmet(" organska hemija");
	}

}
