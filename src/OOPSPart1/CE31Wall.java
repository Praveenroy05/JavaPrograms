package OOPSPart1;

public class CE31Wall {

    private double width, height;

    public CE31Wall() {

    }

    public CE31Wall(double width, double height) {
        setHeight(height);
        setWidth(width);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;

        }

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;

        }
    }

    public double getArea() {
        return height * width;
    }

    public static void main(String[] args) {
        CE31Wall wall = new CE31Wall(-5, -4);
        System.out.println(wall.getArea());
        System.out.println(wall.getHeight());
        System.out.println(wall.getWidth());

        wall.setHeight(-1.5);
        System.out.println(wall.getArea());
        System.out.println(wall.getHeight());
        System.out.println(wall.getWidth());
    }
}
