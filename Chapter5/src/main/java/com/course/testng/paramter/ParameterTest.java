package com.course.testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @Author: Jalyn
 * @Date: 2020/1/2 13:46
 */
public class ParameterTest {

    @Test
    @Parameters({"name","age"})
    public void paramTest1(String name, int age){
        System.out.println("name = "+name+",age="+age);
    }

}
