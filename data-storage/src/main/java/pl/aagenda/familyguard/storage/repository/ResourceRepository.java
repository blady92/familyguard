package pl.aagenda.familyguard.storage.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.aagenda.familyguard.storage.domain.Resource;

@RepositoryRestResource
public interface ResourceRepository extends Neo4jRepository<Resource, Long> {
}
