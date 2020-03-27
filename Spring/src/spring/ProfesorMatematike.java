package spring;

public class ProfesorMatematike implements Profesor {
	
	private Predmet predmet;
	
	//prazan konstruktor
	public ProfesorMatematike(){
		
	}
	//konstruktor sa predmetom
	public ProfesorMatematike(Predmet predmet) {
		this.predmet = predmet;
	}


	@Override
	public String pozdrav() {
		return "Pozdrav od Pitagore!";
	}


	@Override
	public String predmetKojiPredajem() {
		return predmet.mojPredmet(" algebra");
	}
	
	

}
