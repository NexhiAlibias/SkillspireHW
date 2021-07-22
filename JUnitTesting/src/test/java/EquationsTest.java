import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquationsTest {

    @Test
    void hypotenous() {
        assertEquals(7.0710678118654755,Equations.hypotenous(5,5));
    }

    @Test
    void areaOfTriangle() {
        assertEquals(8, Equations.areaOfTriangle(4,4));
    }

    @Test
    void circumferenceOfSphere() {
        //Originally i had put 18.85 but Java is very specific as i did use double.
        assertEquals(18.84955592153876,Equations.circumferenceOfSphere(3));
    }

}