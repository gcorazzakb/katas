public enum GameResult {
    Player1Wins(-1),Player2Wins(1), Draw(0);
    int win;

    GameResult(int win) {
        this.win = win;
    }

    public int getWin() {
        return win;
    }

}
