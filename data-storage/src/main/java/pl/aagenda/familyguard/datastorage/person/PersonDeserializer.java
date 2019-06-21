package pl.aagenda.familyguard.datastorage.person;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

public class PersonDeserializer extends JsonDeserializer<Person> {
    @Override
    public Person deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        return Person.builder()
                .id(p.getLongValue())
                .build();
    }
}
