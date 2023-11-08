# kata-rpn

Reverse Polish Notation Kata

## RPN Notation

The reverse polish notation allow to write mathematical expressions without the need for parenthesis.

A RPN expression contains either

* A number
* A sequence E1 E2 OP where E1 and E2 are expressions and OP an operator (hence the name, operator
  comes *after* the operands)

To evaluate a RPN expression, use the following algorithm:

* Keep a list of values (called a *stack*)
* Split the input string on the spaces to get a list of *tokens*
* For each token:
  * If the token can be parsed as a number, push it to the stack
  * Otherwise, pop two values from the stack, compute the result of the operation and push it to the stack

Examples:

For input: `20 2 +`

|step|token|stack|
|----|-----|-----|
|0|     | [ ]    |
|1|  20 | [20]   |
|2|  2  | [20, 2]|
|3|  +  | [22]   |

For input: `4 2 + 3 -`

|step|token|stack|
|--|---|-------|
|0 |   | [ ]   |
|1 | 4 | [4]   |
|2 | 2 |[4, 2] |
|3 | + | [6]   |
|4 | 3 | [6, 3]|
|5 | - | [3]   |


## Instructions

Write the code that can evaluate an expression (as a string) and return a result
as an int.

Note that for your first implementation:

* You can assume the expression is well formed : only natural numbers, all tokens separated by exactly one space, and so on ...
* You can assume that the "stack" only contain one element at the end


## Going further

* Implement different arities, like `sqrt`:

```
9 sqrt
3
```

or `max`:

```
12 10 14 9 max
14
```

* Allow integer and floats as expression

* Handle all possible errors, with nice error messages

```
> 3 +
Error: expecting two arguments for `+`, got one (3)
```

* Handle complex numbers
