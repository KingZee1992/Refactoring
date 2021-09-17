
public class TennisGame2 implements TennisGame
{
    //2nd commit and push...
    public int P1point = 0;
    public int P2point = 0;
    
    public String P1res = "";
    public String P2res = "";
    private String player1Name;
    private String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore(){
        String score = "";
        String[] scoreTitle = new String[]{"Love", "Fifteen", "Thirty", "Forty"};

        if (P1point == P2point && P1point < 4)
        {
            score = scoreTitle[P1point] + "-All";
        }
        if (P1point==P2point && P1point>=3)
            score = "Deuce";
        
        if (P1point > 0 && P2point==0)
        {
            P2res = "Love";
            score = scoreTitle[P1point] + "-" + P2res;
        }
        if (P2point > 0 && P1point==0)
        {
            P1res = "Love";
            score = P1res + "-" + scoreTitle[P2point];
        }
        
        if (P1point>P2point && P1point < 4)
        {
            score = scoreTitle[P1point] + "-" + scoreTitle[P2point];
        }
        if (P2point>P1point && P2point < 4)
        {
            score = scoreTitle[P1point] + "-" + scoreTitle[P2point];
        }
        
        if (P1point > P2point && P2point >= 3)
        {
            score = "Advantage player1";
        }
        
        if (P2point > P1point && P1point >= 3)
        {
            score = "Advantage player2";
        }
        
        if (P1point>=4 && P2point>=0 && (P1point-P2point)>=2)
        {
            score = "Win for player1";
        }
        if (P2point>=4 && P1point>=0 && (P2point-P1point)>=2)
        {
            score = "Win for player2";
        }
        return score;
    }
    
    public void SetP1Score(int number){
        
        for (int i = 0; i < number; i++)
        {
        	P1point++;
        }
            
    }
    
    public void SetP2Score(int number){
        
        for (int i = 0; i < number; i++)
        {
        	P2point++;
        }
            
    }
    

    public void wonPoint(String player) {
        if (player == "player1")
        	P1point++;
        else
        	P2point++;
    }
}
