package abstractClasses_11;

public abstract class GameCalculator {
	public abstract void calculate (int correctAnswer) ;
	
	public final void gameOver () {
		System.out.println("Oyun bitti...");
	}
}
