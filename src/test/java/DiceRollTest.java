import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import week5.DiceRoll;

public class DiceRollTest {

    @Test
    void testRollSetsValuesInRange() {
        DiceRoll dice = new DiceRoll();
        dice.roll();
        assertTrue(dice.getDie1() >= 1 && dice.getDie1() <= 6);
        assertTrue(dice.getDie2() >= 1 && dice.getDie2() <= 6);
    }

    @Test
    void TestIdDoubleTrueWhenEqual() {
        DiceRoll dice = new DiceRoll();
        boolean foundDouble = false;
        for (int i = 0; i < 100; i++) {
            dice.roll();
            if (dice.isDouble()) {
                foundDouble = true;
                break;
            }
        }
        assertTrue(foundDouble, "Should roll a double within 100 tries");
    }

    @Test
    void testRollUntilDoubleReturnsPositiveCount() {
        DiceRoll dice = new DiceRoll();
        int count = dice.rollUntilDouble();
        assertTrue(count >= 1);
        assertTrue(dice.isDouble());
    }
}
