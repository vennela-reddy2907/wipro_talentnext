package live;

import music.string.Veena;
import music.wind.Saxophone;
import music.Playable;

public class Test {
	public static void main(String[] args) {

		Veena veena = new Veena();
		veena.play();
		Saxophone saxophone = new Saxophone();
		saxophone.play();
		Playable p;

		p = veena;
		p.play();

		p = saxophone;
		p.play();
	}
}