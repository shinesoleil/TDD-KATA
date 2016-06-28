#String Calculator tasks:

1. Empty string as input, return 0  
"" -> 0  
Estimate: 10 min  
Real: 5 min (9:08 - 9:13) 

2. Only one number as String, return number as integer  
"1" -> 1 
Estimate: 3 min  
Real:  3 min (9:14 - 9:17)

2. Two numbers as String delimited by comma, return sum of two numbers  
"1,2" -> 3 
Estimate: 3 min  
Real:  4 min (9:20 - 9:24)

3. Multiple numbers as String delimited by comma, return sum of the numbers  
"1,2,3" -> 6 
Estimate: 5 min  
Real:  1 min (9:24 - 9:25)

4. Accept "\n" as delimiter of the string  
"1,2\n3" -> 6 
Estimate: 1 min  
Real:  1 min (9:23 - 9:26)

5. Accept user-defined delimiter in the first line  
"&\n1&2,3" -> 6 wrong
"&\n1&2&3" -> 6 
Estimate: 15 min  
Real:  35 min (9:30 - 10:05)
Reason

6. Accept user-defined delimiter of any length  
"//[&&@]\n1&&@2**@3" -> 6 
Estimate: 5 min  
Real:  

7. Accept several user-defined delimiter of any lenth  
"//[&&@][^^$]\n1&&@2^^$3" -> 6 
Estimate: 10 min  
Real:  

8. Display exception message when string contains negative number  
"23;-2;3" -> "negatives not allowed - -2" 
Estimate: 5 min  
Real:  

9. Display exception message when string contains several negative number  
"23;-2;-3" -> "negatives not allowed - -2, -3" 
Estimate: 3 min  
Real:  

10. Ignore numbers bigger than 1000  
"4,1001,999" -> 1003 
Estimate: 2 min  
Real:  

