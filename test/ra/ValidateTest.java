package ra;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateTest {
    Validate validate = new Validate();
    @Test
    public void test1(){
        // gias trị mong muốn : expected
        // giấ trị thực tế : actual
//        assertEquals(false,validate.isValidEmail("hung@gmail.com"));
        assertTrue(validate.isValidEmail("hung@gmail.com"));
    }
    @Test
    public void test2(){
        // gias trị mong muốn : expected
        // giấ trị thực tế : actual
        assertTrue(validate.isValidEmail("hung@yahoo.com"));
    }@Test
    public void test3(){
        // gias trị mong muốn : expected
        // giấ trị thực tế : actual
        assertTrue(validate.isValidEmail("hunghx@rikkeisoft.com"));
    }@Test
    public void test4(){
        // gias trị mong muốn : expected
        // giấ trị thực tế : actual
        assertTrue(validate.isValidEmail("hunghx@sis.hust.edu.vn"));
    }@Test
    public void test5(){
        // gias trị mong muốn : expected
        // giấ trị thực tế : actual
        assertTrue(validate.isValidEmail("hung@icloud.com"));
    }
}