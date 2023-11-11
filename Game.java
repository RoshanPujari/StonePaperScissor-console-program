public class Game{
    ComputerText cT = new ComputerText();
    String computerMove = cT.choosing();

    String playerMove = Reader.read();

    public String Run(){
        String winner;
        if (computerMove == "Scissor"){
            Scissor scissor = new Scissor(playerMove);
            winner = scissor.ScissorWins();
        }else if(computerMove == "Rock"){
            Rock rock = new Rock(playerMove);
            winner = rock.RockWins();
        }else if(computerMove == "Stone"){
            Paper paper = new Paper(playerMove);
            winner = paper.PaperWins();
        }else{
            winner = "";
        }

        System.out.println("Computer choose: "+ computerMove);
        System.out.println(winner);
        return winner;
    }
}
