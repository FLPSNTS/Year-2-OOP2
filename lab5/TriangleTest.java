import org.junit.jupiter.api.*;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

class TriangleTest {


    @BeforeEach
    void setUp() {

        Triangle triangle = new Triangle();

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
        t.setSides(3, 5, 5);
        Assertions.assertTrue(t.isIsosceles());
    }

    @Test
    void testSetSides1() {
        Triangle t = new Triangle();
        t.setSides(5);
        Assertions.assertEquals(15, t.getPerimeter());

    }

    @Test
    void testSetSides2() {
        Triangle t = new Triangle();
        t.setSides(5,2);
        Assertions.assertEquals(12, t.getPerimeter());
    }

    @Test
    void testCopy(){
        Triangle t = new Triangle();
        Triangle copy = t.copy();
        Assertions.assertEquals(t.getPerimeter(), copy.getPerimeter());
        Assertions.assertEquals(t.getAverageLength(), copy.getAverageLength());
        Assertions.assertNotSame(t, copy); //not same object

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
        Assertions.assertEquals(3, t.getPerimeter());
    }

    @Test
    void testTriangle2() {
        Triangle t = new Triangle(3,5,2);
        Assertions.assertEquals(10, t.getPerimeter());
    }

    @Test
    void testTriangle3() {
        Triangle t = new Triangle(1);
        Assertions.assertEquals(3, t.getPerimeter());
    }

    @RepeatedTest(5)
    void repeatedSetSidesTest(org.junit.jupiter.api.RepetitionInfo repetitionInfo) {
        Triangle t = new Triangle();
        t.setSides(repetitionInfo.getCurrentRepetition());
        assertTrue(t.isEquilateral());
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 5, 10, 99})
    void testEquilateralParameterized(int length) {
        Triangle t = new Triangle(length);

        assertTrue(t.isEquilateral());
    }

}

