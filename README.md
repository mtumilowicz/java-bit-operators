# java-bit-operators
The main goal of this project is to show bit operators in java.

_Reference_: https://docs.oracle.com/javase/specs/jls/se11/html/jls-15.html#jls-15.19  
_Reference_: https://javarevisited.blogspot.com/2015/02/difference-between-right-shift-and.html

|   |   |
|---|---|
|~   |Unary bitwise complement   |
|<<   |Signed left shift   |
|\>>   |Signed right shift   |
|\>>>   |Unsigned right shift   |
|&   |Bitwise AND   |
|^   |Bitwise exclusive OR   |
|&#124;   |Bitwise inclusive OR   |

# unsigned right shift
The value of `n >>> s` is n right-shifted s bit positions with 
zero-extension, where:
* If n is positive, then the result is the same as that of `n >> s`.
* If n is negative and the type of the left-hand operand is int, 
then the result is equal to that of the expression `(n >> s)` + `(2 << ~s)`.