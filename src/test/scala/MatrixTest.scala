import org.scalatest.FunSuite

class MatrixTest extends FunSuite {
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

  val mat = Matrix(A, C)

  test("Multiplication of Scalar") {
    assert(mat.mulScalar(4) === Vector(
      Vector(4, 8, 12, 16, 20),
      Vector(16, 20, 24, 28, 32),
      Vector(36, 40, 44, 48, 52),
      Vector(36, 40, 44, 48, 52),
      Vector(56, 60, 64, 68, 72)
    ))
  }
  test("Multiplication of Matrices") {
    assert(
      mat.mulMatrix() === Vector(
        Vector(109, 124, 139, 154, 169),
        Vector(193, 223, 253, 283, 313),
        Vector(333, 388, 443, 498, 553),
        Vector(333, 388, 443, 498, 553),
        Vector(473, 553, 633, 713, 793)
      )
    )
  }
}
