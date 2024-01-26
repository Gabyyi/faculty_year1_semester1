import java.lang.Math;
//-----Exercise 1-----

class Rectangle{
    private float width;
    private float height;
    public Rectangle(float width, float height){
        this.width=width;
        this.height=height;
    }
    public float Area(){
        float area=this.width*this.height;
        return area;
    }
    public float Perimeter(){
        float perimeter=2*this.width+2*this.height;
        return perimeter;
    }
}

//-----Exercise 2-----

class Circle{
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public double Area(){
        double area=Math.pow(this.radius,2)*Math.PI;
        return area;
    }
    public double Circumference(){
        double circumference=2*this.radius*Math.PI;
        return circumference;
    }
}

//-----Exercise 3-----

class Book{
    private String title;
    private String author;
    private int year;
    private String category;
    public Book(String title, String author, int year, String category) {
        this.title=title;
        this.author=author;
        this.year=year;
        this.category=category;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getYear(){
        return year;
    }
    public String getCategory(){
        return category;
    }
}
class Library{
    private String nameOfLibrary;
    private String address;
    private int noBooks;
    private Book[] books;
    public Library(String nameOfLibrary, String address, int noBooks){
        this.nameOfLibrary=nameOfLibrary;
        this.address=address;
        this.noBooks=noBooks;
        this.books=new Book[noBooks];
    }
    int b=0;
    public void addBook(Book book){    
        if(b<noBooks){
            books[b]=book;
            b++;
        }
    }
    public void booksUntil(int year){
        for(int i=0;i<noBooks;i++) {
            if(books[i].getYear()<=year){
                System.out.println(books[i].getTitle());
            }
        }
    }

    public void booksCategory(String category){
        int k=0;
        for (int i=0;i<noBooks;i++) {
            if (books[i].getCategory().equals(category)){
                k++;
                System.out.println(books[i].getTitle());
            }
        }
        System.out.println("There are "+k+" books in the '"+category+"' category");
    }

}

//-----Exercise 4-----

//     A class is a template for objects that defines object properties.
//     An object is a member of a class.

//-----Exercise 5-----

//     Encapsulation in Java is an object-oriented procedure of combining the data members 
//     and data methods of the class inside the user-defined class.
//     It is important to declare this class as private.

class HW5{
    public static void main(String[] args){
        //Exercise 1
        System.out.println("Exercise 1");
        Rectangle r=new Rectangle(12,5);
        System.out.println("The area of the rectangle is "+r.Area());
        System.out.println("The perimeter of the rectangle is "+r.Perimeter());

        //Exercise 2
        System.out.println("\nExercise 2");
        Circle c=new Circle(10);
        System.out.println("The area of the circle is "+c.Area());
        System.out.println("The circumference of the circle is "+c.Circumference());

        //Exercise 3
        System.out.println("\nExercise 3");
        Book book1=new Book("A Journey to the Center of the Earth","Jules Verne",1864,"Science Fiction");
        Book book2=new Book("The War of the Worlds","H.G. Wells",1898,"Science Fiction");
        Book book3=new Book("The World of Ice and Fire","George R. R. Martin",1996,"Fantasy");
        Book book4=new Book("The Colour of Magic","Terry Pratchett",1983,"Fantasy");
        Book book5=new Book("Against All Odds","Alex Kershaw",2022,"History");
        Book book6=new Book("The Forgotten 500","Gregory A. Freeman",2007,"History");
        Book book7=new Book("The Yellow House","Sarah M. Broom",2019,"Memoir");
        Book book8=new Book("In The Darkroom","Susan Faludi",2016,"Memoir");
        Book book9=new Book("The Adventures of Huckleberry Finn","Mark Twain",1884,"Adventure");
        Book book10=new Book("Gulliver's Travels","Jonathan Swift",1726,"Adventure");
        Library library=new Library("Politehnica Library", "University Street", 10);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        library.addBook(book7);
        library.addBook(book8);
        library.addBook(book9);
        library.addBook(book10);
        System.out.println("The books that were published before 1950:");
        library.booksUntil(1950);
        System.out.println("\nThe books in the 'Adventure' category:");
        library.booksCategory("Adventure");
    }
}