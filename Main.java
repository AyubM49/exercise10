import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        Contact contact1 = new Contact("Ayub", "Ayub@emailmail.com");
        BusinessInfo business1 = new BusinessInfo("Joe", "Joe@email.com", "6123456789");

        Store store1 = new Store();

        store1.addPerson(contact1);

        store1.addPerson(business1);

        for(Contact a : store1) {

            a.display();
        }



    }
}
class Contact {
    String name;
    String email;

    public Contact(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact Information{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public  void display() {
        System.out.println("The name of  this person is: " + name + " The email of " + name   + email );
    }
}

class BusinessInfo extends Contact {
    String Number;

    public BusinessInfo(String name, String email, String Number) {
        super(name, email);
        this.Number = Number;
    }

    @Override
    public String toString() {
        return "Business Information{" +
                "Number='" + Number + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public void display() {
        super.display();
        System.out.println("The business number you are looking for is: " + Number);
    }
}


class Store implements Iterable<Contact> {
    ArrayList<Contact> s = new ArrayList<>();

    public Store () {

    }


    public void addPerson(Contact a) {
        s.add(a);
    }

    @Override
    public String toString() {
        return "Storage{" +
                "s=" + s +
                '}';
    }

    @Override
    public Iterator<Contact> iterator() {
        return s.iterator();
    }
}