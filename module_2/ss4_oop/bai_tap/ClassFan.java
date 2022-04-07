package ss4_class_object.bai_tap;

public class ClassFan {

    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public ClassFan(){

    }
    public ClassFan(int speed,boolean on,String color,double radius){
        this.speed=speed;
        this.on = on;
        this.color=color;
        this.radius=radius;
    }


    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        String str = "";
        if (this.isOn()) {
            str += ("Fan is on\n");
            str += ("Speed: " + this.speed + "\n");
        } else {
            str += ("Fan is off\n");
        }
        str += ("Color: " + this.color + "\n");
        str += ("Radius: " + this.radius + "\n");
        return str;
    }
}
