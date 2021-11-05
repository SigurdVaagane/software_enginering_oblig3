import sigurd.oblig.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class Test_if_leap_year {

    @Test
    public void test_divisible_by_four_but_not_hundred_is_true() {
        assertTrue(Main.isLeapYear(1));
        assertTrue(Main.isLeapYear(4));
        assertTrue(Main.isLeapYear(8));
        assertTrue(Main.isLeapYear(12));
        assertTrue(Main.isLeapYear(16));
        assertTrue(Main.isLeapYear(20));
        assertTrue(Main.isLeapYear(24));
        assertTrue(Main.isLeapYear(28));
        assertTrue(Main.isLeapYear(32));
        assertTrue(Main.isLeapYear(36));
        assertTrue(Main.isLeapYear(40));
        assertTrue(Main.isLeapYear(44));
        assertTrue(Main.isLeapYear(48));
        assertTrue(Main.isLeapYear(52));
        assertTrue(Main.isLeapYear(2020));
        assertTrue(Main.isLeapYear(2024));
    }

    @Test
    public void test_divisible_by_four_hundred_is_true() {
        assertTrue(Main.isLeapYear(0));
        assertTrue(Main.isLeapYear(400));
        assertTrue(Main.isLeapYear(800));
        assertTrue(Main.isLeapYear(1200));
        assertTrue(Main.isLeapYear(1600));
        assertTrue(Main.isLeapYear(2000));
        assertTrue(Main.isLeapYear(2400));
        assertTrue(Main.isLeapYear(2800));
        assertTrue(Main.isLeapYear(3200));
        assertTrue(Main.isLeapYear(3600));
    }

    @Test
    public void test_not_divisible_by_four_is_false() {
        assertFalse(Main.isLeapYear(1));
        assertFalse(Main.isLeapYear(2));
        assertFalse(Main.isLeapYear(3));
        assertFalse(Main.isLeapYear(5));
        assertFalse(Main.isLeapYear(6));
        assertFalse(Main.isLeapYear(7));
        assertFalse(Main.isLeapYear(9));
        assertFalse(Main.isLeapYear(10));
        assertFalse(Main.isLeapYear(11));
        assertFalse(Main.isLeapYear(13));
        assertFalse(Main.isLeapYear(14));
        assertFalse(Main.isLeapYear(15));
        assertFalse(Main.isLeapYear(2021));
    }

    @Test
    public void test_divisible_by_hundred_but_not_four_hundred_is_false() {
        assertFalse(Main.isLeapYear(100));
        assertFalse(Main.isLeapYear(200));
        assertFalse(Main.isLeapYear(300));
        assertFalse(Main.isLeapYear(500));
        assertFalse(Main.isLeapYear(600));
        assertFalse(Main.isLeapYear(700));
        assertFalse(Main.isLeapYear(900));
        assertFalse(Main.isLeapYear(1000));
        assertFalse(Main.isLeapYear(1100));
        assertFalse(Main.isLeapYear(1300));
        assertFalse(Main.isLeapYear(1400));
        assertFalse(Main.isLeapYear(1500));
        assertFalse(Main.isLeapYear(1700));
        assertFalse(Main.isLeapYear(1800));
        assertFalse(Main.isLeapYear(1900));
        assertFalse(Main.isLeapYear(2100));
    }
}
