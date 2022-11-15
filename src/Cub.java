public class Cub extends Shape{
    private double lenght;

    public Cub(double lenght) {
        this.lenght = lenght;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
    @Override
    public double getPerimeter() {
        return 12*lenght;
    }
}
