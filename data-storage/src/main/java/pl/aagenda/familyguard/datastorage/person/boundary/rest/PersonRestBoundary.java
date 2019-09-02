package pl.aagenda.familyguard.datastorage.person.boundary.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.aagenda.familyguard.datastorage.person.boundary.PersonBoundary;
import pl.aagenda.familyguard.datastorage.person.control.PersonControl;
import pl.aagenda.familyguard.datastorage.person.entity.PersonEntity;

import javax.validation.Valid;

import static pl.aagenda.familyguard.datastorage.constants.ResourcePath.Api.API_V1_PATH;
import static pl.aagenda.familyguard.datastorage.constants.ResourcePath.ID_PATH_VARIABLE;
import static pl.aagenda.familyguard.datastorage.constants.ResourcePath.PEOPLE_PATH;

@RestController
@RequestMapping(path = API_V1_PATH + PEOPLE_PATH)
@RequiredArgsConstructor
public class PersonRestBoundary implements PersonBoundary {
    private final PersonControl personControl;

    @GetMapping
    public Iterable<PersonEntity> getPeople(@PageableDefault Pageable pageable) {
        return getPeople(pageable.getPageNumber(), pageable.getPageSize());
    }

    @Override
    @PostMapping
    public PersonEntity savePerson(@RequestBody @Valid PersonEntity person) {
        return personControl.savePerson(person);
    }

    @Override
    public Iterable<PersonEntity> getPeople(int pageNumber, int pageSize) {
        return personControl.getPeople(pageNumber, pageSize);
    }

    @Override
    @GetMapping(ID_PATH_VARIABLE)
    public PersonEntity getPerson(@PathVariable long id) {
        return personControl.getPerson(id);
    }

    @Override
    @DeleteMapping(ID_PATH_VARIABLE)
    public void deletePerson(long id) {
        personControl.deletePerson(id);
    }
}
