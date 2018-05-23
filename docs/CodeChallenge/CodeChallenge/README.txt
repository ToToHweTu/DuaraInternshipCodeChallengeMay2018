Mercy Salome 
Duara Challenge
Task 2_ Recursion_Division by Subtraction

Recursive division by subtraction would only work if the function takes in positive integers in its argument. So in the case of negative numbers, you'd first modify the integers before passing them as parameters as shown in my program, then modify what is returned as well.

The other thing is that my function only works for integers. I tried with decimal numbers but then I think that would not be possible; unless
you first modify the decimal numbers by casting, since decimal division doesn't naturally lend itself to recursion the way integer division does.