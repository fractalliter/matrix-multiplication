case class Matrix(A: Vector[Vector[Int]], B: Vector[Vector[Int]]) {
  type Row = Vector[Int]
  type Matrix = Vector[Row]

  private def multipliable(mat: Matrix, row: Row): Boolean = mat.forall(_.length == row.length)

  private def mulVector(mat: Matrix, rw: Row): Row = {
    if (multipliable(mat, rw)) {
      val row = for{i <- mat.indices}
        yield for{j <- rw.indices} yield rw(j) * mat(i)(j)
      row.map(_.sum).toVector
    }
    else{
      Vector()
    }
  }
  /**
   * Product of the two matrix by multiplying first matrix rows
   */
  def mulMatrix(): Matrix = {
    val tr = B.transpose
    val mat = for{i <- A.indices}
      yield mulVector(A, tr(i))
    mat.toVector.transpose
  }

  def mulScalar(x: Int): Matrix = A.map(_.map(_*x))

  def display(x: Matrix) = print(x.map(_.mkString(", ")).mkString("\n"))
}