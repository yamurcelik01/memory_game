package memory_game;

public class card {
	
	private char value;
	private boolean prediction= false;
	
	public card(char valur) {
		this.value=value;
	}

	public char getValue() {
		return value;
	}

	public void setValue(char value) {
		this.value = value;
	}

	public boolean isPrediction() {
		return prediction;
	}

	public void setPrediction(boolean prediction) {
		this.prediction = prediction;
	}
	
	

}
