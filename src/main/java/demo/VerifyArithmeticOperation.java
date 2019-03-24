package demo;

public class VerifyArithmeticOperation {

 private int x;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int quotient()
    {
        return x/y;
    }

    public int remainder()
    {
        return x%y;
    }


    public int product() throws Exception{
        return x*y;
    }

}
