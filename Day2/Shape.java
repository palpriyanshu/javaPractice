class Triangle{
  private float side1;
  private float side2;
  private float side3;
  final private String EQUILATERAL = "equilateral";
  final private String ISOSCELES = "isosceles";
  final private String SCALENE = "scalene";

  Triangle(float side1, float side2, float side3){
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }

  public String type(){
    if(this.side1 == this.side2 && this.side2 == this.side3){
      return this.EQUILATERAL;
    }
    if(this.side1 != this.side2 && this.side1 != this.side3 && this.side2 != this.side3){
      return this.ISOSCELES;
    } 
    return this.SCALENE;
  }

  public float perimeter(){
    return this.side1 + this.side2 + this.side3;
  }

  public double area(){
    final double semiPerimeter = perimeter()/2;
    return Math.pow(semiPerimeter*(semiPerimeter-side1)*(semiPerimeter-side2)*(semiPerimeter-side3), 0.5);
  }

  @Override
  public boolean equals(Object other){
    if(this == other){
      return true;
    }

    if(!(other instanceof Triangle)){
      return false;
    }

    Triangle otherTriangle = (Triangle)other;
    
    return this.side1 == otherTriangle.side1
       && this.side2 == otherTriangle.side2
       && this.side3 == otherTriangle.side3;
  }
}

public class Shape{
  public static void main(String[] args){
    final float side1 = Integer.parseInt(args[0]);
    final float side2 = Integer.parseInt(args[1]);
    final float side3 = Integer.parseInt(args[2]);
    Triangle triangle1 = new Triangle(side1, side2, side3);
    Triangle triangle2 = new Triangle(5, 6, 4);
    final String type = String.format("type of triangle is " + triangle1.type());

    System.out.println(type);
    System.out.println("perimeter of triangle is " + triangle1.perimeter());
    System.out.println(triangle1.area());
    System.out.println(triangle1.equals(triangle2));
  }
}