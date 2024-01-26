class Video{
    private String title;
    private int length;
    private boolean available;
    public Video(String title){
        this.title=title;
        this.length=90;
        this.available=true;
    }
    public Video(String title, int length){
        this.title=title;
        this.length=length;
        this.available=true;
    }
    public void show(){
        System.out.println(title+" "+length+" "+available);
    }
}

class Movie extends Video{
    private String director;
    private String rating;
    public Movie(String title, int length, String director, String rating){
        super(title,length);
        this.director=director;
        this.rating=rating;
    }
    public void show(){
        super.show();
        System.out.println(director+" "+rating);
    }
}

abstract class Card{
    protected String recipient;
    public abstract void greeting();
}

class Holiday extends Card{
    public Holiday(String recipient){
        this.recipient=recipient;
    }
    public void greeting(){
        System.out.println("Dear "+recipient+", ");
        System.out.println("Season's Greetings!");
    }
}

class Birthday extends Card{
    private int age;
    public Birthday(String recipient, int age){
        this.recipient=recipient;
        this.age=age;
    }
    public void greeting(){
        System.out.println("Dear "+recipient+", ");
        System.out.println("Happy "+age+"th Birthday!");
    }
}

class Lab9{
    public static void main(String[] args){
        Video v1=new Video("videoclip");
        v1.show();
        Video v2=new Video("video",12);
        v2.show();
 
        Movie m=new Movie("vidwq",112,"ion","good");
        m.show();

        Card card1=new Holiday("John");
        card1.greeting();
        Card card2=new Birthday("Betty", 18);
        card2.greeting();
    }
}