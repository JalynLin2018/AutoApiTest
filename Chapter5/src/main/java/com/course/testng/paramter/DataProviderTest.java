package com.course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @Author: Jalyn
 * @Date: 2020/1/2 14:04
 */
public class DataProviderTest {

    @Test(dataProvider = "data")
    public void testDataProvider(String name, int age){
        System.out.println("name="+name+"; age="+age);
    }

    @DataProvider(name = "data")
    public Object[][] providerData(){
        Object[][] o = new Object[][] {
                {"zhangsan",10},
                {"lisi",24}
        };
        return o;
    }

    @Test(dataProvider = "")
    public void test1(String name, int age){
        System.out.println("test111方法name="+name+";age="+age);
    }
}
