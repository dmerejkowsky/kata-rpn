# kata-rpn
Reverse Polish Notation Kata

## RPN Notation

The reverse polish notation allow to write mathematical expressions without the need for parenthesis.

A RPN expression contains either

* A number
* A sequence E1 E2 OP where E1 and E2 are expressions and OP an operator (hence the name, operator
  comes *after* the operands)

To evaluate a RPN expression, we use the following algorithm:

* Keep a list of values (called a "stack")
* If the expression is a number, push it to the stack
* If the expression is an operator, pop two values from the stack and push the result to the stack

Examples:

```
20 2 +
[20], [20, 2], [22]

4 2 + 3 -
[4], [4,2], [6], [6, 3], [3]
```

## Rules

Write the code that can evaluate an expression (as a string) and return a result
as an int.

Follow the TDD rules as close as possible and try to make the smallest possible cycles.

Notes:
* You can assume the expression is well formed : only natural numbers, all tokens separated by space
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
