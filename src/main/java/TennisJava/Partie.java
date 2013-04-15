package TennisJava;

public class Partie {

	public String score() {
		if (pointsJoueur1 == pointsJoueur2 && égalitéPossible()) {
			return "Egalité";
		}
		if (pointsJoueur1 >= pointsJoueur2 + 2 && unJoueurPeutGagner()) {
			return "Joueur 1 vainqueur";
		}
		if (pointsJoueur1 == pointsJoueur2 + 1 && égalitéPossible()) {
			return "Avantage Joueur 1";
		}
		if (pointsJoueur2 >= pointsJoueur1 + 2 && unJoueurPeutGagner()) {
			return "Joueur 2 vainqueur";
		}
		if (pointsJoueur2 == pointsJoueur1 + 1 && égalitéPossible()) {
			return "Avantage Joueur 2";
		}
		return scoreAvantEgalitéPossible();
	}

	private boolean unJoueurPeutGagner() {
		return pointsJoueur1 >= 4 || pointsJoueur2 >= 4;
	}

	private boolean égalitéPossible() {
		return pointsJoueur1 >= 3;
	}

	private String scoreAvantEgalitéPossible() {
		return String.format("%s - %s", pointsEnScore(pointsJoueur1), pointsEnScore(pointsJoueur2));
	}

	private String pointsEnScore(int points) {
		return correspondancesPointsScore[points];
	}

	public void leJoueur1Marque() {
		pointsJoueur1++;
	}

	public void leJoueur2Marque() {
		pointsJoueur2++;
	}

	private static String[] correspondancesPointsScore = new String[]{"0", "15", "30", "40"};

	private int pointsJoueur1;
	private int pointsJoueur2;
}
