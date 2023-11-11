import java.util.Random;

public class ComputerText {

    public String choosing(){

        String choosen;
        Random rand = new Random();
        int i = rand.nextInt(3)+1;
        if (i == 1){
            choosen = "Stone";
        }else if (i == 2){
            choosen = "Paper";
        }else{
            choosen = "Scissor";
        }
        return choosen;
    }
}
