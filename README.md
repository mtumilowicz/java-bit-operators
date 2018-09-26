# java-bit-operators
The main goal of this project is to show bit operators in java.

_Reference_: https://docs.oracle.com/javase/specs/jls/se11/html/jls-15.html#jls-15.19  
_Reference_: https://javarevisited.blogspot.com/2015/02/difference-between-right-shift-and.html

# summary

|   |   |
|---|---|
|~   |Unary bitwise complement   |
|<<   |Signed left shift   |
|\>>   |Signed right shift   |
|\>>>   |Unsigned right shift   |
|&   |Bitwise AND   |
|^   |Bitwise exclusive OR   |
|&#124;   |Bitwise inclusive OR   |

# description

## unary bitwise complement
The unary bitwise complement operator "~" inverts a bit pattern; 
it can be applied to any of the integral types, making every "0" 
a "1" and every "1" a "0".

## signed left shift
The value of `n << s` is n left-shifted s bit positions; this is 
equivalent (even if overflow occurs) to multiplication by two 
to the power s.

## signed right shift
The value of `n >> s` is n right-shifted s bit positions with 
sign-extension. The resulting value is `floor(n / 2s)`. For 
non-negative values of n, this is equivalent to truncating 
integer division, as computed by the integer division operator 
/, by two to the power s.
 
## unsigned right shift
The value of `n >>> s` is n right-shifted s bit positions with 
zero-extension, where:
* If n is positive, then the result is the same as that of `n >> s`.
* If n is negative and the type of the left-hand operand is int, 
then the result is equal to that of the expression `(n >> s)` + `(2 << ~s)`.

## shift operators remark
If the promoted type of the left-hand operand is int, then only the 
five lowest-order bits of the right-hand operand are used as the 
shift distance. It is as if the right-hand operand were subjected to a 
bitwise logical AND operator & (§15.22.1) with the mask value 0x1f 
(0b11111). The shift distance actually used is therefore always in the 
range 0 to 31, inclusive.

## bitwise AND, OR, XOR
Performs a bitwise AND, OR, XOR operations