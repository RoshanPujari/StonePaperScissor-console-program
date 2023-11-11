public class Paper {
    String other;

    Paper(String other){
        this.other = other;
    }


    public String PaperWins(){

        String b = switch (other) {
            case "Rock" -> "Computer wins";
            case "Scissor" -> "Player Wins";
            case "Paper" -> "Draw";
            default -> "";
        };

        return b;
    }
}
