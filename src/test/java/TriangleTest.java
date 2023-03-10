import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    @Test
    public void test1(){
        Triangle myTriangle = new Triangle();
        assertEquals("Isosceles triangle", myTriangle.checkTriangle(1,100,100));
    }

    @Test
    public void test2(){
        Triangle myTriangle = new Triangle();
        assertEquals("Isosceles triangle", myTriangle.checkTriangle(2,100,100));
    }

    @Test
    public void test3(){
        Triangle myTriangle = new Triangle();
        assertEquals("Isosceles triangle", myTriangle.checkTriangle(199,100,100));
    }

    @Test
    public void test4(){
        Triangle myTriangle = new Triangle();
        assertEquals("Not a triangle", myTriangle.checkTriangle(200,100,100));
    }

    @Test
    public void test5(){
        Triangle myTriangle = new Triangle();
        assertEquals("Equilateral triangle", myTriangle.checkTriangle(100,100,100));
    }

    @Test
    public void test6(){
        Triangle myTriangle = new Triangle();
        assertEquals("Isosceles triangle", myTriangle.checkTriangle(100,1,100));
    }

    @Test
    public void test7(){
        Triangle myTriangle = new Triangle();
        assertEquals("Isosceles triangle", myTriangle.checkTriangle(100,2,100));
    }

    @Test
    public void test8(){
        Triangle myTriangle = new Triangle();
        assertEquals("Isosceles triangle", myTriangle.checkTriangle(100,199,100));
    }

    @Test
    public void test9(){
        Triangle myTriangle = new Triangle();
        assertEquals("Not a triangle", myTriangle.checkTriangle(100,200,100));
    }

    @Test
    public void test10(){
        Triangle myTriangle = new Triangle();
        assertEquals("Isosceles triangle", myTriangle.checkTriangle(100,100,1));
    }

    @Test
    public void test11(){
        Triangle myTriangle = new Triangle();
        assertEquals("Isosceles triangle", myTriangle.checkTriangle(100,100,2));
    }

    @Test
    public void test12(){
        Triangle myTriangle = new Triangle();
        assertEquals("Isosceles triangle", myTriangle.checkTriangle(100,100,199));
    }

    @Test
    public void test13(){
        Triangle myTriangle = new Triangle();
        assertEquals("Not a triangle", myTriangle.checkTriangle(100,100,200));
    }

    @Test
    public void test14(){
        Triangle myTriangle = new Triangle();
        assertEquals("Scalene triangle", myTriangle.checkTriangle(99,37,124));
    }

    @Test
    public void test15(){
        Triangle myTriangle = new Triangle();
        assertEquals("Value not in range", myTriangle.checkTriangle(0,28,13));
    }

    @Test
    public void test16(){
        Triangle myTriangle = new Triangle();
        assertEquals("Value not in range", myTriangle.checkTriangle(7,-1,8));
    }

    @Test
    public void test17(){
        Triangle myTriangle = new Triangle();
        assertEquals("Value not in range", myTriangle.checkTriangle(111,5,-55));
    }

    @Test
    public void test18(){
        Triangle myTriangle = new Triangle();
        assertEquals("Value not in range", myTriangle.checkTriangle(201,10,64));
    }

    @Test
    public void test19(){
        Triangle myTriangle = new Triangle();
        assertEquals("Value not in range", myTriangle.checkTriangle(7,333,8));
    }

    @Test
    public void test20(){
        Triangle myTriangle = new Triangle();
        assertEquals("Value not in range", myTriangle.checkTriangle(111,5,573));
    }

}