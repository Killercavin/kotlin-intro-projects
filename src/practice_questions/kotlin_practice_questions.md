# Kotlin Practice Questions
## Functions, Control Statements, Conditional Statements, and Collections

---

## 1. FUNCTIONS

### Easy Level

1. **Function Basics**: Write a function called `greet` that takes a name as a parameter and returns "Hello, [name]!"

2. **Default Parameters**: Create a function `calculateArea` that calculates the area of a rectangle. Give default values of 1.0 to both length and width parameters.

3. **Unit Function**: Write a function `printNumbers` that takes an integer and prints numbers from 1 to that integer.

4. **Single Expression Function**: Convert this function to a single-expression function:
   ```kotlin
   fun double(x: Int): Int {
       return x * 2
   }
   ```

5. **Named Arguments**: Create a function `createUser` with parameters: name, age, email, and city. Call it using named arguments in different orders.

### Medium Level

6. **Higher-Order Functions**: Write a function `operateOnNumbers` that takes two integers and a function parameter, then applies that function to the integers.

7. **Extension Functions**: Create an extension function for String called `isPalindrome` that checks if a string reads the same forwards and backwards.

8. **Vararg Parameters**: Write a function `findMaximum` that accepts a variable number of integers and returns the maximum value.

9. **Infix Functions**: Create an infix function called `power` that calculates x to the power of y (x power y).

10. **Function Overloading**: Create multiple versions of a `sum` function that can handle different parameter combinations (2 ints, 3 ints, list of ints).

11. **Recursive Functions**: Write a recursive function to calculate the factorial of a number.

12. **Lambda Expressions**: Create a lambda expression that takes two strings and returns the longer one. Store it in a variable and use it.

### Hard Level

13. **Scope Functions**: Write a function that demonstrates the use of `let`, `run`, `with`, `apply`, and `also` scope functions with practical examples.

14. **Inline Functions**: Create an inline function `measureTime` that measures the execution time of a given lambda function.

15. **Reified Type Parameters**: Write a generic inline function `castTo` with reified type parameters that safely casts an object to a specified type.

16. **Tail Recursion**: Implement a tail-recursive function to calculate Fibonacci numbers and compare its performance with a regular recursive approach.

17. **Function Composition**: Create a function composition system where you can chain multiple functions together.

18. **Currying**: Implement function currying - transform a function with multiple parameters into a sequence of functions each taking a single parameter.

---

## 2. CONTROL STATEMENTS

### Easy Level

19. **For Loops**: Write a program that prints multiplication table for a given number using a for loop.

20. **While Loop**: Create a program that finds the first 10 even numbers using a while loop.

21. **Do-While Loop**: Write a program that simulates rolling a dice until you get a 6, using a do-while loop.

22. **Break Statement**: Create a program that searches for a specific element in an array and breaks when found.

23. **Continue Statement**: Write a program that prints numbers 1 to 20 but skips multiples of 3.

### Medium Level

24. **Nested Loops**: Create a program that prints a multiplication table from 1 to 10 using nested loops.

25. **Loop with Ranges**: Use different types of ranges (ascending, descending, with steps) in for loops to solve various problems.

26. **Labeled Break/Continue**: Write a program with nested loops that uses labeled break and continue statements.

27. **For Loop with Indices**: Create a program that iterates through a list and prints both index and value for elements that meet certain criteria.

28. **While with Complex Conditions**: Write a number guessing game using while loops with multiple conditions.

### Hard Level

29. **Loop Optimization**: Compare the performance of different loop types (for, while, forEach) for large datasets and explain when to use each.

30. **Complex Loop Logic**: Create a program that finds all prime numbers up to a given limit using the Sieve of Eratosthenes algorithm.

31. **State Machine**: Implement a simple state machine using loops and control statements to simulate a traffic light system.

32. **Advanced Break/Continue**: Create a complex nested loop structure that processes a 2D matrix with sophisticated break/continue logic.

---

## 3. CONDITIONAL STATEMENTS

### Easy Level

33. **If-Else Basics**: Write a program that checks if a number is positive, negative, or zero.

34. **Grade Calculator**: Create a program that converts numerical grades to letter grades using if-else statements.

35. **Even/Odd Checker**: Write a function that determines if a number is even or odd.

36. **Age Category**: Create a program that categorizes age into child, teen, adult, or senior.

37. **Simple Validation**: Write a function that validates if an email contains '@' symbol using if statements.

### Medium Level

38. **When Expression**: Rewrite a complex if-else chain using when expressions for better readability.

39. **When with Ranges**: Use when expressions with ranges to create a temperature classification system.

40. **When with Type Checking**: Create a function that handles different data types using when expression with type checking.

41. **Nested Conditionals**: Write a program that determines shipping cost based on weight, distance, and priority level.

42. **Elvis Operator**: Use the Elvis operator in various scenarios for null handling.

43. **Conditional Assignment**: Use if expressions for conditional assignment in different contexts.

### Hard Level

44. **Pattern Matching**: Create a sophisticated pattern matching system using when expressions with custom conditions.

45. **Safe Calls Chain**: Build a complex safe call chain with multiple null checks and conditional operations.

46. **Smart Casting**: Demonstrate smart casting in complex conditional scenarios with inheritance hierarchies.

47. **Sealed Classes with When**: Create a sealed class hierarchy and use exhaustive when expressions to handle all cases.

48. **Conditional Logic Optimization**: Optimize complex conditional logic for better performance and readability.

---

## 4. COLLECTIONS

### Easy Level

49. **List Basics**: Create a mutable list of strings, add elements, remove elements, and print the final list.

50. **Array Operations**: Create an array of integers and perform basic operations like finding sum, average, and maximum.

51. **Set Operations**: Create two sets of numbers and find their intersection, union, and difference.

52. **Map Basics**: Create a map of student names to their grades and perform basic CRUD operations.

53. **List Iteration**: Iterate through a list using different methods (for loop, forEach, iterator).

### Medium Level

54. **Collection Transformations**: Use `map`, `filter`, and `reduce` functions to transform a list of numbers.

55. **Grouping and Partitioning**: Group a list of people by age groups and partition them based on certain criteria.

56. **Sorting**: Sort a list of custom objects using different criteria (single field, multiple fields, custom comparator).

57. **Collection Aggregations**: Use functions like `sum`, `average`, `count`, `maxBy`, `minBy` on collections.

58. **Nested Collections**: Work with nested collections (list of lists, map of lists) and perform operations on them.

59. **Collection Conversion**: Convert between different collection types (List to Set, Array to List, etc.).

60. **Sequence vs Collection**: Compare the performance and use cases of Sequences vs Collections for large datasets.

### Hard Level

61. **Custom Collection Operations**: Create custom extension functions for collections that solve specific business problems.

62. **Lazy Evaluation**: Implement lazy evaluation patterns using sequences for memory-efficient processing of large datasets.

63. **Collection Pipelines**: Build complex data processing pipelines using chained collection operations.

64. **Parallel Processing**: Implement parallel processing of collections for CPU-intensive operations.

65. **Custom Comparators**: Create sophisticated custom comparators for complex sorting requirements.

66. **Memory Optimization**: Optimize collection usage for memory-constrained environments.

67. **Collection Algorithms**: Implement classic algorithms (binary search, merge sort, etc.) using Kotlin collections.

68. **Immutable Collections**: Work with immutable collections and understand their benefits and trade-offs.

---

## BONUS CHALLENGES (Mix of All Topics)

### Integration Challenges

69. **Calculator App**: Create a calculator that uses functions for operations, conditionals for validation, loops for continuous operation, and collections to store history.

70. **Student Management System**: Build a system that manages student records using all four concepts together.

71. **Text Analyzer**: Create a program that analyzes text files using functions for processing, loops for iteration, conditionals for logic, and collections for data storage.

72. **Game Logic**: Implement a simple game (like Tic-Tac-Toe) that incorporates all four topics.

73. **Data Processing Pipeline**: Build a data processing system that reads, transforms, and analyzes data using all concepts.

## Practice Tips

1. **Start Simple**: Begin with easy questions and gradually move to harder ones
2. **Code Quality**: Focus on writing clean, readable code
3. **Performance**: Consider time and space complexity for harder problems
4. **Testing**: Write test cases for your functions
5. **Documentation**: Add meaningful comments to complex logic
6. **Refactoring**: Try to improve your initial solutions
7. **Multiple Solutions**: For each problem, try to find alternative approaches

## Additional Resources

- Practice implementing each solution in multiple ways
- Use Kotlin Playground for quick testing
- Refer to Kotlin documentation for advanced features
- Join Kotlin communities for discussions and code reviews

Happy Coding! 🚀