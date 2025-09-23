package quiz.quiz04;
/*
요구사항
	상속: EBook 생성, double fileSize 필드 추가.

오버라이딩(2곳):
	toString()을 오버라이드하여 멤버변수 fileSize 포함 반환.
	getFinalPrice()를 오버라이드하여 전자책은 10% 할인된 가격 반환.

오버로딩(2개, 반환/내용 필수):
	findBook(String title): 제목이 일치하는 책 반환, 없으면 null.
	findBook(double maxPrice): price와 maxPrice중 더 저렴한 책 반환
	
메인에서 객체생성해서 확인하기
*/
public class EBook extends Book {
    double fileSize;

    EBook(String title, String author,double price, double fileSize){
        super(title,author,price);
        this.fileSize = fileSize;
    }

    public String toString(){
        return "제목: " + title + ", 저자: " + author + ", 가격: " + price + "원"+ fileSize + "fileSize";
    }

    double getFinalPrice(){
        return price*0.9;
    }

    public String findBook(String title){
        if(title.equals(this.title)){
            return title;
        }
        else {
            return null;
        }
    }
    public double findBook(double maxPrice){
        return (price>=maxPrice)?price:maxPrice;
    }
}
