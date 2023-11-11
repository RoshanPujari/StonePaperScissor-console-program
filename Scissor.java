public class Scissor {
    String other;

    Scissor(String other){
        this.other = other;
    }


    public String ScissorWins(){

        String b = switch (other) {
            case "Paper" -> "Computer wins";
            case "Rock" -> "Player Wins";
            case "Scissor" -> "Draw";
            default -> "";
        };

        return b;
    }
}
