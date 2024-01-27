public class Main{
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(6, 9);
        System.out.println("area rettangolo : " + rettangolo.calcolaArea());
        Triangolo triangolo = new Triangolo(12, 7);
        System.out.println("area triangolo :" + triangolo.calcolaArea() );

    }
}
