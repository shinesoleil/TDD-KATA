import org.junit.*;

import static org.junit.Assert.assertEquals;

public class BowlingGameTest {
    BowlingGame bowlingGame;

    @Before
    public void initialize() {
        bowlingGame = new BowlingGame();
    }

    @Test
    public void score_zero_when_no_pin_down() {
        for (int i = 0; i < 20; i++) {
            bowlingGame.roll(0);
        }
        assertEquals(0, bowlingGame.score());
    }

    @Test
    public void score_twenty_when_one_pin_down_every_roll() {
        for (int i = 0; i < 20; i++) {
            bowlingGame.roll(1);
        }
        assertEquals(20, bowlingGame.score());
    }

    @Test
    public void one_spare_happens_before_tenth_frame() {
        bowlingGame.roll(5);
        bowlingGame.roll(5);
        bowlingGame.roll(3);
        for (int i = 0; i < 17; i++) {
            bowlingGame.roll(0);
        }
        assertEquals(16, bowlingGame.score());
    }

    @Test
    public void one_strike_happens_before_tenth_frame() {
        bowlingGame.roll(10);
        bowlingGame.roll(3);
        bowlingGame.roll(4);
        for (int i = 0; i < 16; i++) {
            bowlingGame.roll(0);
        }
        assertEquals(24, bowlingGame.score());
    }


    @Test
    public void one_spare_happens_tenth_frame() {
        for (int i = 0; i < 18; i++) {
            bowlingGame.roll(0);
        }
        bowlingGame.roll(4);
        bowlingGame.roll(6);
        bowlingGame.roll(3);
        assertEquals(13, bowlingGame.score());
    }

    @Test
    public void perfectGame() {
        for (int i = 0; i < 11; i++) {
            bowlingGame.roll(10);
        }

        assertEquals(300, bowlingGame.score());
    }

    @Test
    public void additionalGame() {
        for (int i = 0; i < 6; i++) {
            bowlingGame.roll(0);
        }
        bowlingGame.roll(4);
        bowlingGame.roll(6);
        bowlingGame.roll(2);
        bowlingGame.roll(6);
        for (int i = 0; i < 8; i++) {
            bowlingGame.roll(0);
        }
        bowlingGame.roll(1);
        bowlingGame.roll(9);
        bowlingGame.roll(4);


        assertEquals(20 + 10 + 4, bowlingGame.score());
    }
}
