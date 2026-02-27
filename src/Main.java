public class Human{
    public String name;
    public String surname;
    public int yearOfBirth;

    public Human(String name, String surname, int yearOfBirth){
        this.name= name;
        this.surname=surname;
        this.yearOfBirth=yearOfBirth;
    }
    public String toString(){
        return "Name: "+name+ " Surname: "+surname+" Year Of Birth: "+yearOfBirth;
    }
}
public class Teacher extends Human{
    public int TeacherID;
    public Teacher(String name, String surname, int yearOfBirth, int TeacherID){
        super(name,surname,yearOfBirth);
        this.TeacherID=TeacherID;
    }

    @Override
    public String toString() {
        return super.toString()+" Teacher ID: "+TeacherID;
    }
}


void main() {
    System.out.println("Hello Vistula");
    Human h1= new Human("Jan", "Kowalski", 2000);
    Teacher t1= new Teacher("Aleksandra","Dabrowska",1997,74759);
    System.out.println(h1.toString());
    System.out.println(t1.toString());
}
