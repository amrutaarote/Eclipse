package Emp;

public class Statement {
	public static void main (String[] args)	{
	//int myScore = 400;
	//	if (myScore < 5000 && myScore > 1000){
	//	System.out.println("Your score is greater than 1000 but less than 5000 ");
	//	} else if (myScore<1000) {
	//	System.out.println("Your score is less than 1000");
	//}    else 
	//{
	//	System.out.println("Got here");
	//}
		boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

	
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim ", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob ", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Percy ", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert ", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Louise ", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Carol ", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Frank ", highScorePosition);
	}
	
	public static void displayHighScorePosition  (String playerName, int highScorePosition) {
	 System.out.println(playerName+ "Managed to get into position "
			 +highScorePosition+ " on the high score table");
		

	}
	public static int calculateHighScorePosition (int playerScore) {
		if (playerScore>1000) {
			return 1;
		}
		if 	(playerScore>500 && playerScore >1000) {
			return 2;
	}
		if 	(playerScore>100 && playerScore <500) {
			return 3;
		}
			else {
				return 4;
			}
	}

	
	
	
	
	public static int calculateScore(boolean gameover, int score, int bonus, int levelcompleted) {
		
		
			if (gameover) {
				int finalscore= score +(levelcompleted*bonus);
				finalscore+=2000;
				return finalscore;
		}
				return -1;
}
}