object Main extends App {
  type Row = Vector[Int]
  type MatrixT = Vector[Row]

  val A: MatrixT = Vector(
    Vector(1, 2, 3, 4, 5),
    Vector(4, 5, 6, 7, 8),
    Vector(9, 10, 11, 12, 13),
    Vector(9, 10, 11, 12, 13),
    Vector(14, 15, 16, 17, 18)
  )
  val C: MatrixT = Vector(
    Vector(1, 2, 3, 4, 5),
    Vector(3, 4, 5, 6, 7),
    Vector(5, 6, 7, 8, 9),
    Vector(8, 9, 10, 11, 12),
    Vector(11, 12, 13, 14, 15)
  )

  try {
    val mat = Matrix(A, C)

    println("Transpose of matrix C:\n")
    mat display C.transpose

    println("\n\nMultiplication of Matrix by Matrix:\n")
    mat display mat.mulMatrix

    println("\n\nMultiplication of Matrix by its transpose:\n")
    val tr = Matrix(A, A.transpose)
    tr display tr.mulMatrix

    println("\n\nMultiplication of a Matrix by a Scalar\n")
    val sc = Matrix(A)
    sc.display(sc.mulMatrix(4))
  } catch {
    case e: AssertionError => println(e
      + "\nCheck for multiplication of matrices\nPlease provide multiply able matrices")
    case _: Throwable => println("An error occurred")
  }
}