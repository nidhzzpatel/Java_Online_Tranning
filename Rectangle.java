class Area {
    private int length;
    private int breadth;

    public void setDim(int l, int b) {
        length = l;
        breadth = b;
    }

    public int getArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Area rectangle = new Area();
        rectangle.setDim(5, 10);
        System.out.println("The area of the rectangle is: " + rectangle.getArea());
    }
}