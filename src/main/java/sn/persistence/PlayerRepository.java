package sn.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sn.domain.Player;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Long> {

}
