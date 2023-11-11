public class Rock {
    String other;

    Rock(String other){
        this.other = other;
    }


    public String RockWins(){

        String b = switch (other) {
            case "Paper" -> "Player wins";
            case "Rock" -> "Draw";
            case "Scissor" -> "Computer wins";
            default -> "";
        };

        return b;
    }
}
