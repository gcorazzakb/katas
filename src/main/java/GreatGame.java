public class GreatGame {
    public static String whoIsWinner(String team1, String team2) {
        if (!isValidGame(team1))
            return null;
        if (!isValidGame(team2))
            return null;
        if (team1.length() != team2.length())
            return null;


        int points = 0;
        int games = team1.length() / 2;

        for (int i = 0; i < games; i++) {
            Symbol symbolP1 = getSymbol(team1.substring(i * 2, i * 2 + 2));
            Symbol symbolP2 = getSymbol(team2.substring(i * 2, i * 2 + 2));
            points+=whoWins(symbolP1, symbolP2).getWin();
        }

        if (points==0){
            return "TIE";
        }

        int playerWhoWins=0;
        if(points<0)
            playerWhoWins=1;
        if(points>0)
            playerWhoWins=2;

        return "TEAM "+playerWhoWins+" WINS";

    }

    public static Symbol getSymbol(String s) {
        for (Symbol symbol : Symbol.values())
            if (s.equals(symbol.getDisplay())) return symbol;
        return null;
    }

    public static boolean isValidGame(String game) {
        return game.matches("(8<|\\(\\)|\\[\\])+");
    }

    public static GameResult whoWins(Symbol ssp1, Symbol ssp2) {
        switch (ssp1) {
            case Paper: {
                if (ssp2 == Symbol.Rock) {
                    return GameResult.Player1Wins;
                }
                if (ssp2 == Symbol.Sciccors) {
                    return GameResult.Player2Wins;
                }
                return GameResult.Draw;
            }
            case Rock: {
                if (ssp2 == Symbol.Sciccors) {
                    return GameResult.Player1Wins;
                }
                if (ssp2 == Symbol.Paper) {
                    return GameResult.Player2Wins;
                }
                return GameResult.Draw;
            }
            case Sciccors: {
                if (ssp2 == Symbol.Paper) {
                    return GameResult.Player1Wins;
                }
                if (ssp2 == Symbol.Rock) {
                    return GameResult.Player2Wins;
                }
                return GameResult.Draw;
            }
        }
        return GameResult.Draw;
    }
}
