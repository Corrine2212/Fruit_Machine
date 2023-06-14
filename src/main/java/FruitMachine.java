import java.util.ArrayList;

public class FruitMachine {

    private ArrayList<Integer> reels;
    private double amountSpent;

    private double winnings;

    private int noOfSpins;
    private int noOfReels;

    public FruitMachine(int noOfReels) {
        this.reels = new ArrayList<>();
        this.amountSpent = 0.00;
        this.winnings = 0.00;
        this.noOfSpins = 0;
        this.noOfReels = noOfReels;
    }

    public ArrayList<Integer> getReels() {
        return reels;
    }

    public void setReels(ArrayList<Integer> reels) {
        this.reels = reels;
    }

    public int getNoOfReels() {
        return noOfReels;
    }

    public void setNoOfReels(int noOfReels) {
        this.noOfReels = noOfReels;
    }

    public double getAmountSpent() {
        return amountSpent;
    }

    public void setAmountSpent(double amountSpent) {
        this.amountSpent = amountSpent;
    }

    public double getWinnings() {
        return winnings;
    }

    public void setWinnings(double winnings) {
        this.winnings = winnings;
    }

    public int getNoOfSpins() {
        return noOfSpins;
    }

    public void setNoOfSpins(int noOfSpins) {
        this.noOfSpins = noOfSpins;
    }

    public int selectRandom(){
        int index = (int)(Math.random()*(Symbols.values().length));
        int value = Symbols.values()[index].getValue();
        return value;
    }

    public ArrayList<Integer> spin() {
        for (int i = 0; i < noOfReels; i++){
            this.reels.add(selectRandom());
        }
        return reels;
    }

    public double calculateWinnings(ArrayList<Integer> reels){

    }
}
