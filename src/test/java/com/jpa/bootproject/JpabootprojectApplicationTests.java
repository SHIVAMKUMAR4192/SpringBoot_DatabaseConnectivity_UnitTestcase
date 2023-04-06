package com.jpa.bootproject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class JpabootprojectApplicationTests {
    private Calculator c =new Calculator();
    @Test
    void contextLoads() {
    }
    @Test
    void testSum()
    {
        //expected
        int expectedResult=30;

        //actualresult
        int actualResult = c.doSum(10, 8, 12);
//        assertThat(actualResult).isEqualTo(expectedResult);
        assertThat(actualResult).isEqualTo(expectedResult);
    }
    @Test
    void testProduct()
    {
        // expected
        int expectedResult=10;
        //actualResult
        int actualResult=c.doProduct(5,2);
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void testCompareNums(){
        Boolean actualResult=c.compareTwoNums(3,3);
        assertThat(actualResult).isTrue();
    }




}
