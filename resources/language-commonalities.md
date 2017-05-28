## Things that most programming languages can do
While programming languages differ widely in syntax, most of them share these logical constructs or tools. This means that the same problems can be solved in multiple languages, often with the same steps)!
*Note that all code examples are structured pseudocode and not meant to be any particular language*

### Arithmetic operations
This involves typing expressions like `1 + 2` and getting the answer `3` as an output. The operators `+`, `-`, `*` and `/` are common (universal?), while programming languages also tend to have other operators like `**` (exponential power, e.g. `2 ** 3` returns `8`) or `%` (modulo, e.g. `14 % 4` returns `2`).

### 'Simple' data types
These are different kinds of values that can be used while programming. Languages have different types of values, but most have a variety of the following:
- Numerical types
  - `integer`, `long` - represent whole numbers, like `1` or `324`
  - `float`, `double` - represent decimal numbers, like `3.14`
- `character` - represent single characters, like `a` or `$`
- `boolean` - these include the values `true` and `false`

### Booleans and comparison
Programming languages use the concept of `true` and `false`, which are called 'boolean' values. Among other uses, these are important for comparing values with other values, using operators like `>`, `<`, `>=`, `<=`, or `==`. Using these operators, we can type expressions like `1 + 2 > 4` (answer: `false`) or `(2 ** 3 == 8) == true` (answer: `true`).  

### Variable assignment
This means assigning a value to a variable and using the variable later on. For example:
```
variable = 3 // We assign the value 3 to 'variable'
return variable + 4 // We add 4 to 'variable' - the computer will interpret 'variable' to be 3 and return 7
```

Variables can assign all kinds of things - integers (`3` in the above example), strings, objects, functions, and others.

### 'Composite' data types
These are things that can contain other values. 
- `array`, `list`
  - This could be something like `[1, 2, 3]`, which is an array containing three integers.
  - An array could also contain `float`s, `string`s, other `array`s, etc.
  - Usually we can access values inside an array by referring to the array and an `index`, which represents a place in the array. For example:
  ```
  random_array = [5, 2, 6, 4, 1]
  return random_array[2]
  // returns 6
  ```

- `string` 
  - This is a collection of characters, like 'hello' or 'This is a complete sentence!'
- `dictionary`, `hash` 
  - This contains other values in key-value pairs. For example, the hash `{'bicycle': 2, 'car': 4}` includes a key of `bicycle` that is associated with a value of `2`.
  - Usually we can access a value inside a hash by referring to the hash and the key associated with the value. For example:
  ```
  transport_wheel_count = {'bicycle': 2, 'car': 4}
  return transportation_wheel_count['car']
  // returns 4
  ```

### Conditional statements
Conditional statmements use words like `if` and `else` (among others) to execute different pieces of code depending on different conditions. This often uses booleans and comparisons as described above. For example:
```
count_of_ducks = {a number grabbed from user earlier in the code}

if count_of_ducks > 5:
  return "You need a pond!"
else:
  return "Just use your bathtub"
```

### Loops/Iteration
Loops execute one piece of code multiple times, usually with a condition describing when the loop should stop. The most common types of loops are `for`, `while`, and `do-while`.
```
sum_of_nums_under_10 = 0
num = 1

while num < 10:
  sum_of_nums_under_10 = sum_of_nums_under_10 + num
  num = num + 1
```

This is often used with data structures like arrays, when we want to perform the same action on every item inside an array. In languages that don't use loops, there is usually another way to execute the same action for multiple things, like 'map', and to gather many values into one value, like 'reduce'.

### Functions
When a piece of code is used in multiple places, we can define the code as a function and use it later on instead of repeating the code. Functions are defined with a name, what inputs are needed (`parameters`), the code that should execute when the function is called, and may be defined with an output. For example:
```
define function sum_of_nums_under(integer max_num):
  sum_of_nums = 0
  num = 1

  while num < max_num:
    sum_of_nums = sum_of_nums + num
    num = num + 1

  return num

// Using the function:
sum_of_nums_under(4) // 10
sum_of_nums_under(6) // 21
```

