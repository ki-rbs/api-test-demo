package com.rbs.cpb.digital.apitest;

import org.junit.Assert;
import org.junit.Test;



public class BasicTest {

    @Test
    public void basicTest1(){
        Assert.assertTrue(this.getClass().getCanonicalName() == "");
    }
}
