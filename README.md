### Stopwatch tasks by Tharit Pongsaneh (5910546406)(*)

I ran the tasks on a Macbook Pro, and got these results:

| Task | Time |
| --- | --- |
| `Append 50,000 chars to String` | 0.905555 sec |
| `Append 100,000 chars to String` | 2.020222 sec |
| `Append 100,000 chars to StringBuilder` | 0.002081 sec |
| `Add 1 billion double using array` | 1.455692 sec |
| `Add 1 billion Double using array` | 4.050768 sec |
| `Add 1 billion BigDecimal using array` | 7.468285 sec |

## Explanation of Results

>Why does appending 100,000 chars to a String take more than 2X the time to append 50,000 chars?I have no idea why the times are different.

Because When you append each char into the String, It's creating new Object. So Appending 100,000 mean 2x Object to create that why it's take 2x time.


>Why is appending to StringBuilder so much different than appending to String? What is happening to the String?

When you appending StringBuilder by default its will create an array of char which have 16 capacity to collect char, when you appending the char in StringBuilder it add those char to the available space in StringBuilder without creating the new Object(In Case It got enough capacity else it will create new StringBuilder with more capacity and clone the old one to its), which is much different to Appending String. When you Appending String, Each time you append it will create a new Object that why its take more time.

>Explain difference in time to sum double, Double, and BigDecimal. Which is faster and why?

Summation of double is the fastest cause when computer work with Primative variable, its using Register memory in the CPU which is much faster than using the memory, then the second place come to Double, because it's an Object which has attributes and method so it's take memory and using more time. In the Case of BigDecimal, BigDecimal is slower than Double Object because it's contain more useful method with its so its take more memory and more time to process.
