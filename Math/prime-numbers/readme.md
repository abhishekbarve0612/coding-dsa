# Primality Test

## Question:

Given a positive integer, check if the number is prime or not. A prime is a natural number greater than 1 that has no positive divisors other than 1 and itself. Examples of first few prime numbers are 2, 3, 5.

## Examples:

Input: n = 11
Output: true

Input: n = 15
Output: false

Input: n = 1
Output: false

## Used Two Approaches

1st one is to iterate till square root of a given number

<img src="./find-prime-square-root.png" />

2nd one is to use Sieve of Eratosthenes Approach

<img src="./find-prime-using-sieve.png" />

### Problem One

#### Source: https://practice.geeksforgeeks.org/problems/sieve-of-eratosthenes5242/1

Given a number N, calculate the prime numbers up to N using Sieve of Eratosthenes.

##### Example 1:

###### Input:

N = 10

###### Output:

2 3 5 7

###### Explanation:

Prime numbers less than equal to N
are 2 3 5 and 7.

##### Example 2:

###### Input:

N = 35

###### Output:

2 3 5 7 11 13 17 19 23 29 31

###### Explanation:

Prime numbers less than equal to 35 are
2 3 5 7 11 13 17 19 23 29 and 31.

###### Your Task:

You don't need to read input or print anything. Your task is to complete the function sieveOfEratosthenes() which takes an integer N as an input parameter and return the list of prime numbers less than equal to N.

Expected Time Complexity: O(NloglogN)
Expected Auxiliary Space: O(N)

Constraints:
1<= N <= 104
