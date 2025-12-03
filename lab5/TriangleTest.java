import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TriangleTest {


    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {}

    @Test
    void testisIsosceles() {
        Triangle t = new Triangle(1,2,2);
        assertTrue(t.isIsosceles());

    }

    @Test
    void testisEquilateral() {
        Triangle t = new Triangle(1,1,1);
        assertTrue(t.isEquilateral());
    }

    @Test
    void testisScalene() {
        Triangle t = new Triangle(1,2,3);
        assertTrue(t.isScalene());
    }

    @Test
    void testSetSides3() {
        Triangle t = new Triangle();
        t.setSides(3, 4, 5);
        //how to assert?
    }

    @Test
    void testSetSides1() {
        Triangle t = new Triangle();
        t.setSides(5);
            //how to assert?
    }

    @Test
    void testSetSides2() {
        Triangle t = new Triangle();
        t.setSides(5,2);
        //how to assert?
    }

    @Test
    void testCopy(){
        Triangle t = new Triangle();
        t.copy();
        //how to assert?
    }


    @Test
    void testGetPerimeter() {
        Triangle t = new Triangle(1,2,3);
        Assertions.assertEquals(6, t.getPerimeter());
    }

    @Test
    void testGetAverageLength() {
        Triangle t = new Triangle(1,2,3);
        Assertions.assertEquals(2, t.getAverageLength());
    }

    @Test
    void testTriangle() {
        Triangle t = new Triangle();
        assertTrue(triangle.isEquilateral());
    }
}
