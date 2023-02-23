package org.example;

public class Vector2D {
    private int xCords;
    private int yCords;

    public Vector2D(int xcords, int ycords) {
        this.xCords = xcords;
        this.yCords = ycords;
    }

    public double distanceCalculation(Vector2D start, Vector2D end ){
        return Math.sqrt(Math.pow(end.getxCords() - start.getxCords(), 2) + Math.pow(end.yCords-start.getyCords(), 2));
    }

    public int getxCords() {
        return xCords;
    }

    public void setXcords(int xcords) {
        xCords = xcords;
    }

    public int getyCords() {
        return yCords;
    }

    public void setyCords(int ycords) {
        yCords = ycords;
    }
}
