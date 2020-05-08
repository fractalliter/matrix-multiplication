# Multiplication of two matrices in Scala language
Recently I took Linear Algebra class on [MIT open course-wares](https://ocw.mit.edu/courses/mathematics/18-06-linear-algebra-spring-2010/) and since I really like Scala I've tried to write some of the matrix operations with Scala.
This is multiplication of two matrices in Scala

## prerequisites
You need to have [JDK](https://openjdk.java.net/install/) 8 or higher and [SBT](https://www.scala-sbt.org/index.html) build tool installed on your machine

check Java by:

`java -version`

you might see something like this:

```
openjdk version "1.8.0_222"
OpenJDK Runtime Environment (build 1.8.0_222-8u222-b10-1ubuntu1~18.04.1-b10)
OpenJDK 64-Bit Server VM (build 25.222-b10, mixed mode)
```
for installing sbt visit [sbt reference manual](https://www.scala-sbt.org/1.x/docs/Setup.html)

About program
I know there are many Apache packages out there to do matrix multiplication and beyond that but I was learning linear algebra for machine learning and Deep learning then I've started to implementing those courses in Scala.

how to run project
clone:

`git clone https://github.com/fractalliter/matrix-multiplication.git`

go to project folder:

`cd matrix-multiplication/`

run sbt:

`sbt`

and then write following commands in sbt-shell:


```
test # for testing project

run # run project
```

then you must have the output as follow:

```
Transpose of matrix C:

1, 3, 5, 8, 11
2, 4, 6, 9, 12
3, 5, 7, 10, 13
4, 6, 8, 11, 14
5, 7, 9, 12, 15

Multiplication of two matrices:

109, 124, 139, 154, 169
193, 223, 253, 283, 313
333, 388, 443, 498, 553
333, 388, 443, 498, 553
473, 553, 633, 713, 793

Multiplication of Matrix by its transpose:

55, 100, 175, 175, 250
100, 190, 340, 340, 490
175, 340, 615, 615, 890
175, 340, 615, 615, 890
250, 490, 890, 890, 1290

Multiplication of a Matrix by a Scalar

4, 8, 12, 16, 20
16, 20, 24, 28, 32
36, 40, 44, 48, 52
36, 40, 44, 48, 52
56, 60, 64, 68, 72
```