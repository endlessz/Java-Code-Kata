package com.wasut.kata;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FirstNonRepeatedCharacterTest {
    @Autowired
    private FirstNonRepeatedCharacter firstNonRepeat;

    @Test
    public void correct(){
        Assert.assertEquals("s", firstNonRepeat.findFirstNonRepeat("star"));
        Assert.assertEquals("t", firstNonRepeat.findFirstNonRepeat("steers"));
        Assert.assertEquals("h", firstNonRepeat.findFirstNonRepeat("tooth"));
        Assert.assertEquals("m", firstNonRepeat.findFirstNonRepeat("moon"));
        Assert.assertEquals("r", firstNonRepeat.findFirstNonRepeat("grootgy"));
    }
}