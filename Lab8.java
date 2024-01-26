class Author{
    private String name;
    private String email;
    private char gender;
    public Author(String name, String email, char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public char getGender(){
        return gender;
    }
    public String toString(){
        return name+" "+email+" "+gender;
    }
}

class Book{
    private String name;
    private Author author;
    private double price;
    private int qtyInStock=0;
    public Book(String name, Author author, double price){
        this.name=name;
        this.author=author;
        this.price=price;
    }
    public Book(String name, Author author, double price, int qtyInStock){
        this.name=name;
        this.author=author;
        this.price=price;
        this.qtyInStock=qtyInStock;
    }
    public String getName(){
        return name;
    }
    public Author getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public int getQtyInStock(){
        return qtyInStock;
    }
    public void setQtyInStock(int qtyInStock){
        this.qtyInStock=qtyInStock;
    }
    public String getAuthorName(){
        String name=author.getName();
        return name;
    }
    public String getAuthorEmail(){
        String email=author.getEmail();
        return email;
    }
    public char getAuthorGender(){
        char gender=author.getGender();
        return gender;
    }
    public String toString(){
        return name+" "+author;
    }
}


class Person{
    private String firstname;
    private String lastname;
    private int age;
    public Person(String lastname, String firstname, int age){
        this.lastname=lastname;
        this.firstname=firstname;
        this.age=age;
    }
    public void displayPerson(){
        System.out.println(lastname+" "+firstname+" "+age);
    }
    public String getLast(){
        return lastname;
    }
    public String getFirst(){
        return firstname;
    }
    public int getAge(){
        return age;
    }
}
class PersonArray{
    private Person[] persons;
    private int nopersons;
    public PersonArray(int nopersons){
        this.nopersons=nopersons;
        this.persons=new Person[nopersons];
    }
    int k=0;
    public void insert(Person pers){
        persons[k++]=pers;
    }
    public void find(String searchName){
        int found=0;
        for(int i=0;i<nopersons;i++){
            if(persons[i].getLast().compareTo(searchName)==0){
                persons[i].displayPerson();
                found=1;
            }
        }
        if(found==0) System.out.println("Not found");
    }
    public boolean delete(String searchName){
        for(int i=0;i<nopersons;i++){
            if(persons[i].getLast().compareTo(searchName)==0){
                for(int j=i;j<nopersons-1;j++){
                    persons[j]=persons[j+1];
                }
                nopersons--;
                return true;
            }
        }
        return false;
    }
    public void displayArray(){
        for(int i=0;i<nopersons;i++){
            System.out.println(persons[i]);
        }
    }
}



class Lab8{
    public static void main(String[] args){
        Author anAuthor=new Author("Author", "Author@upb.ro", 'm');
        System.out.println(anAuthor.toString());
        anAuthor.setEmail("Author@fils.upb.ro");
        System.out.println(anAuthor.toString());


        Author anAuthor1=new Author("Student","student@upb.ro",'m');
        Book aBook=new Book("Java for dummies", anAuthor1, 19.95, 1000);
        System.out.println('\n'+aBook.toString());
        Book anotherBook=new Book("C for dummies", new Author("Teacher","teacher@upb.ro",'m'), 29.95, 999);
        System.out.println(anotherBook.toString());

        System.out.println('\n'+anAuthor1.getName());
        System.out.println(anAuthor1.getEmail());
        System.out.println(anotherBook.getAuthor().getName());
        System.out.println(anotherBook.getAuthor().getEmail());

        System.out.println('\n'+aBook.getAuthorName());
        System.out.println(aBook.getAuthorEmail());
        System.out.println(aBook.getAuthorGender());
        System.out.println(anotherBook.getAuthorName());
        System.out.println(anotherBook.getAuthorEmail());
        System.out.println(anotherBook.getAuthorGender());


        Person person1=new Person("Smith","John",30);
        Person person2=new Person("Daniel","Jack",35);
        Person person3=new Person("Klaus","Iohanis",50);
        PersonArray pa=new PersonArray(3);
        pa.insert(person1);
        pa.insert(person2);
        pa.insert(person3);
        pa.find("Smith");
        System.out.println(pa.delete("Smith"));
        pa.displayArray();
    }
}