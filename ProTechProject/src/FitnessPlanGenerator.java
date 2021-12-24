import java.awt.event.ActionEvent;

public class FitnessPlanGenerator extends GUITG {
	
	
	
	protected static int trainingsTage;
	protected static String trainingsZiel;
	protected static String trainingsOrt;
	
	

	public FitnessPlanGenerator(int trainingsTage, String trainingsZiel, String traningsOrt) {
		super();
		this.trainingsTage = trainingsTage;
		this.trainingsZiel = trainingsZiel;
		this.trainingsOrt = traningsOrt;
	}


	public void bSpeichern_ActionPerformed(ActionEvent evt) {
	    int trainingsTage = Integer.parseInt(EGTrainingstage.getText());
	    String trainingsZiel = EGTrainingsziel.getText();
	    String trainingsOrt = EGTrainingsort.getText();
	    FitnessPlanGenerator p1 = new FitnessPlanGenerator(trainingsTage, trainingsZiel, trainingsOrt);
	}
	
	public void bErstellen_ActionPerformed(ActionEvent evt) {
		if(trainingsTage == 1 && trainingsZiel.equals("Muskelaufbau") && trainingsOrt.equals("Gym")) {
			System.out.println("Tage 1: Ganzkörpertraining");
		
		}
		
		else {
			System.out.println("Falsche Eingabe");
		}
	    
	  }

	public static void main(String[] args) {
		Trainingsplan t1 = new Trainingsplan(1, "Muskelaufbau", "Gym");
		if(trainingsTage == 1 && trainingsZiel.equals("Muskelaufbau") && trainingsOrt.equals("Gym")) {
			System.out.println("Tage 1: Ganzkörpertraining");
			t1.gkGym();
		}
		
		else {
			System.out.println("Falsche Eingabe");
		}
		
	}
}

