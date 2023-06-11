package ss6_inheritance.exercise.point2d_and_point3d;

import java.util.Arrays;

public class PointThreeD extends PointTwoD {
    private float z = 0.0f;

    public PointThreeD() {
    }

    public PointThreeD(float z) {
        this.z = z;
    }

    public PointThreeD(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setX(x);
        super.setY(y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] arr1 = new float[3];
        arr1[0] = super.getX();
        arr1[1] = super.getY();
        arr1[2] = z;
        return arr1;
    }

    @Override
    public String toString() {
        return "3D = " + Arrays.toString(getXYZ());
    }
}
