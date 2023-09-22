import junit.framework.Assert;
import moodanalysis.MoodAnalyser;
import org.junit.Test;


public class TestMood {
    @Test
    public void  testCase(){

        Assert.assertEquals("Sad Mood.", MoodAnalyser.analyserMood("I am in Sad  Mood."));
        Assert.assertEquals("Happy Mood.",MoodAnalyser.analyserMood("I am in Any Mood"));
    }
}
