public class lab5 {
    int num = 10;
    public lab5() {
    System.out.println("Inside constructor");
    }
    public lab5(int num) { 
    this();   
    this.num = num;
    }
    void display() {
    this.show();
    System.out.println(" num: "+ this.num);
    }  
    void show() {
    System.out.println("Inside show method");
    }
    public static void main(String[] args){
    lab5 obj = new lab5(200);
    obj.display();
    }
    }
