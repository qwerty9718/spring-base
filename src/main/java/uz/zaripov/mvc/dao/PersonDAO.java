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

        people.add(new Person(PEOPLE_COUNT++, "Tom"));
        people.add(new Person(PEOPLE_COUNT++, "Mariya"));
        people.add(new Person(PEOPLE_COUNT++, "Ivan"));
        people.add(new Person(PEOPLE_COUNT++, "Ekaterina"));
        people.add(new Person(PEOPLE_COUNT++, "Petr"));
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
    }

    public void delete(int id){
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getId() == id){
                people.remove(people.get(i));
            }
        }
    }

}
