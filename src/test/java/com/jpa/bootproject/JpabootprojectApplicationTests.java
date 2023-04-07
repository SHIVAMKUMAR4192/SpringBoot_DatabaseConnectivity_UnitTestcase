package com.jpa.bootproject;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class JpabootprojectApplicationTests {

    @LocalServerPort
    private int port;

    @Autowired
    public TestH2Repository testH2Repository;

    private String baseUrl="http://localhost";

    private static RestTemplate restTemplate;

    @BeforeAll
    public static void init(){
        restTemplate=new RestTemplate();
    }

    @BeforeEach
    public void urlForm(){
        baseUrl = baseUrl.concat(":").concat(port+"/");
    }

    @Test
    public void testCreateUser(){
        User user = new User();
        user.setUserId(1234);
        user.setUserName("Gagan");
        user.setUserDept("Software");
        user.setUserSalary((double)897666875);

        User responseUser = restTemplate.postForObject(baseUrl+"createUser",user,User.class);
        assertEquals("Gagan",responseUser.getUserName());
        assertEquals(1,testH2Repository.findAll().size());
        assertEquals(1,testH2Repository.fetchSizeOfTable());

        List<User> allData = testH2Repository.getAllData();
        for(User i : allData){
            System.out.println(i.getUserName());
            System.out.println(i.getUserDept());
            System.out.println(i.getUserSalary());
        }

    }



//    private Calculator c =new Calculator();
//    @Test
//    void contextLoads() {
//    }
//    @Test
//    void testSum()
//    {
//        //expected
//        int expectedResult=30;
//
//        //actualresult
//        int actualResult = c.doSum(10, 8, 12);
////        assertThat(actualResult).isEqualTo(expectedResult);
//        assertThat(actualResult).isEqualTo(expectedResult);
//    }
//    @Test
//    void testProduct()
//    {
//        // expected
//        int expectedResult=10;
//        //actualResult
//        int actualResult=c.doProduct(5,2);
//        assertThat(actualResult).isEqualTo(expectedResult);
//    }
//
//    @Test
//    void testCompareNums(){
//        Boolean actualResult=c.compareTwoNums(3,3);
//        assertThat(actualResult).isTrue();
//    }




}
