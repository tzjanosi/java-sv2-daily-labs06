package day02.numbers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PerfectNumbersMainTest {
    @Test
    public void Test(){
        //Given
        PerfectNumbers perfectNumbers = new PerfectNumbers();

        //When-Then
        boolean isPerfect=perfectNumbers.isPerfectNumber(6);
        assertEquals(true,isPerfect);
        isPerfect=perfectNumbers.isPerfectNumber(7);
        assertEquals(false,isPerfect);
        isPerfect=perfectNumbers.isPerfectNumber(8);
        assertEquals(false,isPerfect);



    }

}