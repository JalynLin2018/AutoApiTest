package com.course.testng;

import org.testng.annotations.Test;

/**
 * @Author: Jalyn
 * @Date: 2020/1/2 15:16
 */
public class TimeOutTest {
    @Test(timeOut = 3000)
    public void testSucess() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Test(timeOut = 3000)
    public void testFailed() throws InterruptedException {
        Thread.sleep(4000);
    }

    }

