# Shortest Palindrome

## Problem Statement

Given a string, create the shortest length string that gives a palindrome by attaching the appropriate letters. If the given string is already a palindrome then no changes should be made and the string should be printes as is.

### Example

#### Inputs

    palin
    a
    ab
    aba

#### Outputs

    palinilap
    a
    aba
    aba

## How to use

    > cd path/to/dir/
    > javac *.java
    > java Main <input_string>

## Requirements

- Java 7+

## Notes and assumptions

Resultant palindrome is made by extension and not by insertion, i.e, only by adding a prefix or a suffix.

    eg: abb will give abba - added suffix
        aab will give baab - added prefix
        aba will give aba - no change
    but,
        abbc will give abbcbba whereas the shortest possible palindrome is acbbca or cabbac
