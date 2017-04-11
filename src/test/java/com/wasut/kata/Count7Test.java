package com.wasut.kata;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Wasut on 11/4/2560.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Count7Test {
    @Autowired
    private Count7 count7;

    @Test
    public void correct(){
        Assert.assertEquals(1, count7.count(171));
        Assert.assertEquals(2, count7.count(177));
        Assert.assertEquals(3, count7.count(777));
        Assert.assertEquals(4, count7.count(17372797));
        Assert.assertEquals(5, count7.count(7017777));
        Assert.assertEquals(6, count7.count(17777779));
    }
}
