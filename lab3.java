public class lab3{
    private int length;
    private int breadth;
    public lab3(int l, int b)
 {
        this.length = l;
        this.breadth = b;
    }
    public void Area() {
        System.out.println(length * breadth);
    }
    public static void main(String[] args) {
        lab3 ap = new lab3(2, 3);
        ap.Area();
    }
}
