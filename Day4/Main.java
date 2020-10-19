class Matrix {
  private int[][] matrix;

  private Matrix(int[][] matrix) {
    this.matrix = matrix;
  }

  public static Matrix init(int[][] list) {
    int noOfRows = list.length;
    int noOfCols = list[0].length;
    int[][] matrix = new int[noOfRows][noOfCols];
    for (int rowId = 0; rowId < noOfRows; rowId++) {
      for (int colId = 0; colId < noOfCols; colId++) {
        matrix[rowId][colId] = list[rowId][colId];
      }
    }
    return new Matrix(matrix);
  }

  public void print() {
    for (int rowId = 0; rowId < this.matrix.length; rowId++) {
      for (int colId = 0; colId < this.matrix[rowId].length; colId++) {
        System.out.printf("%d ", this.matrix[rowId][colId]);
      }
      System.out.println();
    }
    System.out.println();
  }

  private boolean isMatrixSizeEqual(Matrix other) {
    return (
      this.matrix.length == other.matrix.length &&
      this.matrix[0].length == other.matrix[0].length
    );
  }

  public Matrix add(Matrix other) {
    if (!isMatrixSizeEqual(other)) {
      return null;
    }
    int noOfRows = other.matrix.length;
    int noOfCols = other.matrix[0].length;
    int[][] sumOfMatrix = new int[noOfRows][noOfCols];
    for (int rowId = 0; rowId < noOfRows; rowId++) {
      for (int colId = 0; colId < noOfCols; colId++) {
        sumOfMatrix[rowId][colId] =
          this.matrix[rowId][colId] + other.matrix[rowId][colId];
      }
    }
    return new Matrix(sumOfMatrix);
  }

  public Matrix sub(Matrix other) {
    if (!isMatrixSizeEqual(other)) {
      return null;
    }
    int noOfRows = other.matrix.length;
    int noOfCols = other.matrix[0].length;
    int[][] sumOfMatrix = new int[noOfRows][noOfCols];
    for (int rowId = 0; rowId < noOfRows; rowId++) {
      for (int colId = 0; colId < noOfCols; colId++) {
        sumOfMatrix[rowId][colId] =
          this.matrix[rowId][colId] - other.matrix[rowId][colId];
      }
    }
    return new Matrix(sumOfMatrix);
  }

  public Matrix multiply(Matrix other) {
    int noOfRows1 = this.matrix.length;
    int noOfCols1 = this.matrix[0].length;
    int noOfCols2 = other.matrix[0].length;
    int noOfRows2 = other.matrix.length;
    int[][] productOfMatrix = new int[noOfRows1][noOfCols2];
    for (int rowId1 = 0; rowId1 < noOfRows1; rowId1++) {
      for (int colId2 = 0; colId2 < noOfCols2; colId2++) {
        for (
          int rowId2 = 0;
          rowId2 < Math.min(noOfRows2, noOfCols1);
          rowId2++
        ) {
          productOfMatrix[rowId1][colId2] +=
            this.matrix[rowId1][rowId2] * other.matrix[rowId2][colId2];
        }
      }
    }
    return new Matrix(productOfMatrix);
  }

  private Matrix getCofactor(int factorIdx) {
    int size = this.matrix.length;
    int[][] cofactor = new int[size - 1][size - 1];

    for (int rowId = 1; rowId < size; rowId++) {
      for (int colId = 0; colId < size; colId++) {
        if (colId < factorIdx) {
          cofactor[rowId - 1][colId] = matrix[rowId][colId];
        }
        if (colId > factorIdx) {
          cofactor[rowId - 1][colId - 1] = matrix[rowId][colId];
        }
      }
    }
    return new Matrix(cofactor);
  }

  public int determinant() {
    int size = this.matrix.length;
    if (size == 1) {
      return this.matrix[0][0];
    }

    if (size == 2) {
      return (
        this.matrix[0][0] *
        this.matrix[1][1] -
        this.matrix[0][1] *
        this.matrix[1][0]
      );
    }

    int determinant = 0;
    int sign = 1;
    for (int factorIdx = 0; factorIdx < size; factorIdx++) {
      Matrix cofactor = getCofactor(factorIdx);
      determinant += sign * matrix[0][factorIdx] * cofactor.determinant();
      sign = -sign;
    }
    return determinant;
  }
}

public class Main {

  public static void main(String[] args) {
    int[][] list1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    int[][] list2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
    // int[][] list1 = {
    //   { 4, 3, 2, 2 },
    //   { 0, 1, -3, 3 },
    //   { 0, -1, 3, 3 },
    //   { 0, 3, 1, 1 },
    // };

    Matrix matrix1 = Matrix.init(list1);
    Matrix matrix2 = Matrix.init(list2);
    // matrix1.print();
    // matrix2.print();

    Matrix sumOfMatrix = matrix1.add(matrix2);
    // sumOfMatrix.print();

    Matrix differenceOfMatrix = matrix1.sub(matrix2);
    // differenceOfMatrix.print();

    int[][] list3 = { { 1, 1, 1 } };
    int[][] list4 = { { 1, 1, 1, 1 }, { 2, 2, 2, 2 }, { 3, 3, 3, 3 } };
    Matrix matrix3 = Matrix.init(list3);
    Matrix matrix4 = Matrix.init(list4);
    Matrix productOfMatrix = matrix3.multiply(matrix4);
    // productOfMatrix.print();
    int determinant = matrix1.determinant();
    System.out.println("determinant " + determinant);
  }
}
