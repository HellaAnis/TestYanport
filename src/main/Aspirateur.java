package main;

public class Aspirateur {

    private int x;
    private int y;
    private char d; // direction de l'Aspirateur

    public Aspirateur(int x, int y, char d) {
        this.x = x;
        this.y = y;
        this.d = d;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public char getD() {
        return d;
    }

    public void setD(char d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Aspirateur{" +
                "x=" + x +
                ", y=" + y +
                ", direction=" + d +
                '}';
    }
}
