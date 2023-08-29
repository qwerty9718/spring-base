package uz.zaripov.mvc.dao;

import org.springframework.stereotype.Component;
import uz.zaripov.mvc.model.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {

    private static int PEOPLE_COUNT = 1;
    private List<Person> people;

    {
        people = new ArrayList<>();

        people.add(new Person(PEOPLE_COUNT++, "Tom","tom@mail.ru",25));
        people.add(new Person(PEOPLE_COUNT++, "Mariya","mariya@mail.ru",23));
        people.add(new Person(PEOPLE_COUNT++, "Ivan","ivan@mail.ru",30));
        people.add(new Person(PEOPLE_COUNT++, "Ekaterina","katya@mail.ru",27));
        people.add(new Person(PEOPLE_COUNT++, "Petr","petr@mail.ru",19));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {

        Person person;

        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getId() == id) {
                person = people.get(i);
                return person;
            }
        }

        return null;

    }


    public void save(Person person){
        person.setId(PEOPLE_COUNT++);
        people.add(person);
    }

    public void update(int id, Person person){
        Person currentPerson = show(id);
        currentPerson.setName(person.getName());
        currentPerson.setEmail(person.getEmail());
        currentPerson.setAge(person.getAge());
    }

    public void delete(int id){
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getId() == id){
                people.remove(people.get(i));
            }
        }
    }

}
