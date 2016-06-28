#Bowling Game

1. No pins knocked down for every roll
loop roll(0) for 20 times  -> score 0
Estimate: 10 min  
Real: 8 min 

2. Only one pin knocked down for every roll
loop roll(1) for 20 times  -> score 20
Estimate: 5 min  
Real: 2 min 

3. Spare happens once but not for the tenth frame
roll(5), roll(5), roll(3), then loop roll(0) for 17 times  -> score 16
Estimate: 15 min  
Real:  18 min

4. Strike happens once but not for the tenth frame
roll(10), roll(3), roll(4), then loop roll(0) for 16 times -> score 24
Estimate: 10 min  
Real:  20 min

5. Spare happens for the tenth frame
loop roll(0) for 18 times, roll(4), roll(6), roll(9)  -> score 19
Estimate: 10 min  
Real:  40 min
Reason: blocked by wrong design, remove 6 task; Refactor

~~6. Strike happens for the tenth frame
loop roll(0) for 18 times, roll(10), roll(3), roll(5)  -> score 18
Estimate: 5 min  
Real:  ~~
