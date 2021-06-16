import java.util.zip.ZipEntry;

public class Square extends Shape{
        public double side;

    public Square(double side, String name){
        super(name);
        this.side = side;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public double getPerimeter() {
        return this.side * 4;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == this.getClass()) {
            Square s = (Square) obj;
                return this.name.equals(s.name) && this.side == s.side;
            }
            return false;
    }

    @Override
    public String toString() {
        return this.name+":"+this.side;
    }
}
