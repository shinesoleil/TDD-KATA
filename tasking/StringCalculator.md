#String Calculator tasks:

1. Empty string as input, return 0
"" -> 0
2. Only one number as String, return number as integer
"1" -> 1
2. Two numbers as String delimited by comma, return sum of two numbers
"1,2" -> 3
3. Multiple numbers as String delimited by comma, return sum of the numbers
"1,2,3" -> 6
4. Accept "\n" as delimiter of the string
"1,2\n3" -> 6
5. Accept user-defined delimiter in the first line
"&\n1&2,3" -> 6
6. Accept user-defined delimiter of any length
"//[&&@]\n1&&@2**@3" -> 6
7. Accept several user-defined delimiter of any lenth
"//[&&@][^^$]\n1&&@2^^$3" -> 6
8. Display exception message when string contains negative number
"23;-2;3" -> "negatives not allowed - -2"
9. Display exception message when string contains several negative number
"23;-2;-3" -> "negatives not allowed - -2, -3"
10. Ignore numbers bigger than 1000
"4,1001,999" -> 1003
