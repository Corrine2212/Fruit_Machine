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
        assertEquals(9, fruitMachine.calculateWinnings([3, 3, 3]));
    }

}
