import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by mtumilowicz on 2018-09-26.
 */
public class BitOperatorsTest {
    @Test
    public void complement_positive() {
        int i = 0b10111101;
        assertThat(i, is(189));
        
        int complementedI = ~i;
        
        assertThat(Integer.toBinaryString(complementedI), is("11111111111111111111111101000010"));
        assertThat(complementedI, is(-190));
    }

    @Test
    public void complement_negative() {
        int i = 0b11111111111111111111111111111111;
        assertThat(i, is(-1));

        int complementedI = ~i;

        assertThat(Integer.toBinaryString(complementedI), is("0"));
        assertThat(complementedI, is(0));
    }

    @Test
    public void signedLeftShift_positive() {
        int i = 0b10_111101;
        assertThat(i, is(189));

        int leftShiftedI = i << 2;

        assertThat(Integer.toBinaryString(leftShiftedI), is("1011110100")); // 10111101_00
        assertThat(leftShiftedI, is(756));
    }

    @Test
    public void signedLeftShift_negative() {
        int i = 0b1_00_01000110010100110101110000101;
        assertThat(i, is(-2_000_000_123));

        int leftShiftedI = i << 2;

        assertThat(Integer.toBinaryString(leftShiftedI), is("100011001010011010111000010100")); // 100011001010011010111000010100_00
        assertThat(leftShiftedI, is(589934100));
    }

    @Test
    public void unsignedRightShift_positive() {
        int i = 0b101111_01;
        assertThat(i, is(189));

        int rightShiftedI = i >>> 2;

        assertThat(Integer.toBinaryString(rightShiftedI), is("101111"));
        assertThat(rightShiftedI, is(47));
    }

    @Test
    public void unsignedRightShift_negative() {
        int i = 0b100010001100101001101011100001_01;
        assertThat(i, is(-2_000_000_123));

        int rightShiftedI = i >>> 2;

        assertThat(Integer.toBinaryString(rightShiftedI), is("100010001100101001101011100001"));
        assertThat(rightShiftedI, is(573741793));
    }
    
    @Test
    public void and() {
        int x = 0b10010;
        int y = 0b100011;
        
        int and = x & y;
        
        assertThat(Integer.toBinaryString(and), is ("10"));
        assertThat(and, is(2));
    }

    @Test
    public void exclusiveOr() {
        int x = 0b10010;
        int y = 0b100011;

        int or = x ^ y;

        assertThat(Integer.toBinaryString(or), is ("110001"));
        assertThat(or, is(49));
    }

    @Test
    public void inclusiveOr() {
        int x = 0b10010;
        int y = 0b100011;

        int or = x | y;

        assertThat(Integer.toBinaryString(or), is ("110011"));
        assertThat(or, is(51));
    }
}
