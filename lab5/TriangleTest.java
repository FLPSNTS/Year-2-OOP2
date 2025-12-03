import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class TriangleTest {

    private Triangle triangle;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {}

    @Test
    void isIsosceles() {
        Triangle t = new Triangle(1,2,2);
        assertTrue(t.isIsosceles());

    }

    @Test
    void isEquilateral() {
        Triangle t = new Triangle(1,1,1);
        assertTrue(t.isEquilateral());
    }

    @Test
    void isScalene() {
        Triangle t = new Triangle(1,2,3);
        assertTrue(t.isScalene());
    }

    @Test
    void setSides() {}

    @Test
    void testSetSides() {}

    @Test
    void testSetSides1() {}

    @Test
    void copy() {}

    @Test
    void getPerimeter() {}

    @Test
    void getAverageLength() {}
}
