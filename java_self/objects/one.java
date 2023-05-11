class Pen {
    String color;
    String type;
      public void write(){
        System.out.println("XYZ");
    }
      public void colorrr(){
        System.out.println(this.color);
    }
}

public class one{
    public static void main(String[] args) {
        Pen A = new Pen();
        A.color = "blue";
        A.type = "gel";

        Pen B = new Pen();
        B.color = "Black";
        B.type = "Ball-pen" ;

        A.colorrr();
        B.colorrr();
    }
}