import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FruitMachineTest {

    FruitMachine fruitMachine;

    ArrayList<Integer> reels;

    @Before
    public void before() {
        fruitMachine = new FruitMachine(3);
        reels = new ArrayList<>();
    }

    @Test
    public void reelsStartEmpty() {
        assertEquals(0, fruitMachine.getReels().size());
    }

    @Test
    public void canSpinReels() {
        fruitMachine.spin();
        assertEquals(3, fruitMachine.getReels().size());
    }

    @Test
    public void canCalculateWin() {
        reels.add(3);
        reels.add(3);
        reels.add(3);
        assertEquals(9, fruitMachine.calculateWinnings(reels),0.0);
    }

}
