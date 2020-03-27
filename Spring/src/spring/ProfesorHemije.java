package spring;

public class ProfesorHemije implements Profesor {
	
	private String ime;
	private Predmet predmet;
	
	public Predmet getPredmet() {
		return predmet;
	}

	public void setPredmet(Predmet predmet) {
		this.predmet = predmet;
	}
	
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	@Override
	public String pozdrav() {
		return "Pozdrav od " + this.ime;
	}

	@Override
	public String predmetKojiPredajem() {
		return predmet.mojPredmet();
	}
	
	public void metodZaInit() {
		System.out.println("Ovde pisem sve metode za inicijalizaciju!");
	}
	
	public void metodZaDestroy() {
		System.out.println("Ovde pisem sve metode za unistenje!");
	}

}
