package quiz.quiz09;

public class running {
    public static void main(String args[]){
        Market mk = new Market();
        Radio r = new Radio("삼성라디오",5000);
        Tv t = new Tv("삼성TV",10000);

        mk.barcode(r);
        mk.barcode(t);
        mk.barcode(r);
        mk.printAll();
    }
}
