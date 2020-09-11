interface Polygon {

    public float area();
  }
  
class Rectangle implements Polygon {
    private float length, breadth;
    Rectangle(float length, float breadth){
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    public float area() {
        return this.length*this.breadth;

    }
}
class Square implements Polygon {
    private float side;
    Square(float side)
    {
        this.side = side;
    }
    @Override
    public float area() {
       
        return this.side*this.side;

    }
}
class Circle implements Polygon {
    private float radius;
    Circle(float radius)
    {
        this.radius = radius;
    }
    @Override
    public float area() {
        return (float) (3.14 * this.radius * this.radius);

    }
}
class  Area{
    public static void main(String[] args) {
     
    }
}