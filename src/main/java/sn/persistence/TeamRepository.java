package sn.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sn.domain.Team;

@Repository
public interface TeamRepository extends CrudRepository<Team, Long> {
}
