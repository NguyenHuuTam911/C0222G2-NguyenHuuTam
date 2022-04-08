package ss6_inheritance.bai_tap;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {

    }

    public Point3D(float x, float y, float z) {
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
        super.setXY();
        this.z = z;

    }

    public float[] getXYZ() {
        float[] array3D = new float[3];
        array3D[0] = getX();
        array3D[1] = getY();
        array3D[2] = z;
        return array3D;

    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                " which is a subclass of "
                + super.toString()
                ;
    }
}
