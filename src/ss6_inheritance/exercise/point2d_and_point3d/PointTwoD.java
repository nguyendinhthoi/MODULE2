package ss6_inheritance.exercise.point2d_and_point3d;

import javax.naming.PartialResultException;
import java.util.Arrays;

public class PointTwoD {
    private float x = 0.0f;
    private float y = 0.0f;

    public PointTwoD() {
    }

    public PointTwoD(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] arr = new float[2];
        arr[0] = x;
        arr[1] = y;
        return arr;
    }

    @Override
    public String toString() {
        return "2D = "+Arrays.toString(getXY());
    }
}
