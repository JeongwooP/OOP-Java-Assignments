class Circle implements Shape{
    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("반지름이 " + radius + "인 원입니다.");
    }

    @Override
    public double getArea() {
        return radius * radius * PI;
    }
}

class Oval implements Shape{
    private int shortAxis, longAxis;

    public Oval(int shortAxis, int longAxis){
        this.shortAxis = shortAxis;
        this.longAxis = longAxis;
    }

    @Override
    public void draw() {
        System.out.println(shortAxis + "x" + longAxis + "에 내접하는 타원입니다.");
    }

    @Override
    public double getArea() {
        return PI * shortAxis * longAxis;
    }
}

class Rect implements Shape{
    private int width, height;

    public Rect(int width, int height){
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println(width + "x" + height + "크기의 사각형 입니다.");//부연설명
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

public class Ch5_14 {
    public static void main(String[] args) {
        Shape[] list = new Shape[3];
        list[0] = new Circle(10);
        list[1] = new Oval(20, 30);
        list[2] = new Rect(10, 40);

        for(int i = 0; i < list.length; i++) list[i].redraw();
        for(int i = 0; i < list.length; i++) System.out.println("면적은 " + list[i].getArea());
    }
}
