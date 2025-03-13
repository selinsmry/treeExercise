# Tree Exercise - Expression Tree from Postfix Notation
This project demonstrates how to construct and visualize an expression tree from a given postfix mathematical expression using Java.

### Overview
The program reads a postfix expression (e.g., "43-12+*"), constructs an expression tree, and prints it level by level using Breadth-First Search (BFS).

### Features
- Builds an expression tree from a given postfix expression
- Uses a stack for constructing the tree
- Implements level-order traversal (BFS) to print the tree
- Supports basic mathematical operators (+, -, *, /) and single-digit numbers

### How It Works
**Tree Construction:**

- Reads each character from the postfix expression.
  - If the character is a digit, it creates a tree node and pushes it onto a stack.
  - If the character is an operator, it pops two nodes from the stack, makes them children, and pushes the new node back onto the stack.
**Tree Printing (BFS Traversal):**

- Prints nodes level by level using a queue.
**Example Execution**
**Input:**
*Postfix expression:* "43-12+*"



**Tree Structure Created:**

        *
       / \
      -   +
     / \  / \
    4   3 1  2
  
**Output (Level-Order Traversal):**

    *  
    - +  
    4 3 1 2
     

