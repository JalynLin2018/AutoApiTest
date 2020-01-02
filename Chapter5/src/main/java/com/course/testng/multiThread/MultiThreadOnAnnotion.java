package com.course.testng.multiThread;

import org.testng.annotations.Test;

/**
 * @Author: Jalyn
 * @Date: 2020/1/2 14:50
 */
public class MultiThreadOnAnnotion {
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test(){
        System.out.println(1);
        System.out.printf("Thread Id : %s%n", Thread.currentThread().getId());
    }
}
