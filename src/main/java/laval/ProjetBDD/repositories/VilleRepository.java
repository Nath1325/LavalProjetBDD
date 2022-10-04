package laval.ProjetBDD.repositories;

import laval.ProjetBDD.models.Ville;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VilleRepository extends MongoRepository<Ville,String> {
}
