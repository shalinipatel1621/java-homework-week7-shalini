package homework_week7;

/**
 * Wall Area
 */

public class Programme_15_WallArea {
    //2 instance variables declared
    double width;
    double height;

    //constructor with no parameters
    public Programme_15_WallArea() {
        this.width = 0.0;
        this.height = 0.0;
    }

    //constructor with parameters of width and height
    public Programme_15_WallArea(double width, double height) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getArea() {
        return this.width * this.height;
    }


    public static void main(String[] args) {
        Programme_15_WallArea wall = new Programme_15_WallArea(5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}

