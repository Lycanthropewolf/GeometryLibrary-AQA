package org.example;

public class Sphere {
    private double rad;

    public Sphere(double rad) {
        this.rad = rad;
    }

    public double square() {
        return Math.PI * 4 * (rad * rad);
    }
}
