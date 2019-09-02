package pl.aagenda.familyguard.datastorage.person.boundary;

import pl.aagenda.familyguard.datastorage.person.entity.PersonEntity;

public interface PersonBoundary {
    PersonEntity savePerson(PersonEntity person);

    Iterable<PersonEntity> getPeople(int pageNumber, int pageSize);

    PersonEntity getPerson(long id);

    void deletePerson(long id);
}
