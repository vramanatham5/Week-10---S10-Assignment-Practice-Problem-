# Week 10 - S10 Assignment Practice Problems

Java solutions for the assignment practice problems. Each question is in its
own folder and includes the `.java` source file and compiled `.class` file.

## Solutions

| Folder | Problem | Approach | Time | Additional space |
| --- | --- | --- | --- | --- |
| `question 1` | Second-Best Score | Track the highest and second-highest distinct scores in one pass. | O(n) | O(1) |
| `question 2` | Exam Score Band Counter | Use lower-bound and upper-bound binary searches on the sorted scores. | O(log n) per query | O(1) |
| `question 3` | Duty Roster Rotation | Reduce `k` modulo the roster length and place each name in its rotated position. | O(n) | O(n) |
| `question 4` | Class Attendance Tracker | Count present days and update the current and longest streak in one pass. | O(n) | O(1) |
| `question 5` | Busiest Bus Row | Sum each row and retain the first row with the largest total. | O(r × c) | O(1) |

The row index returned by `busiestRow` is zero-based. The extra space values
exclude fixed-size result arrays.

## Compile and run

Run these commands from the repository root, replacing `N` with a question
number:

```sh
javac "question N/QuestionN.java"
java -cp "question N" QuestionN
```
