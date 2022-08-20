import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test the Mood analyser program
 */

public class MoodAnalyseTest {
/*
test for sad mood
 */
    @Test
    public void givenSadMoodShopuldreturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String result = moodAnalyser.analyseMood("I am in sad mood");
        assertEquals("Sad",result);
    }
/*
test for any mood
 */
    @Test
    public void givenAnyMoodShopuldreturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String result = moodAnalyser.analyseMood("I am in any mood");
        assertEquals("Happy",result);
    }
/*
test for Happy mood
 */
    @Test
    public void givenHappyMoodShopuldreturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String result = moodAnalyser.analyseMood("I am in Happy mood");
        assertEquals("Happy",result);
    }
}
