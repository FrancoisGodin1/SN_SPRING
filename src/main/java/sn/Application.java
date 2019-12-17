package sn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sn.domain.Player;
import sn.domain.Team;
import sn.persistence.PlayerRepository;
import sn.persistence.TeamRepository;

import java.util.ArrayList;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    TeamRepository teamRepo;

    @Autowired
    PlayerRepository playerRepo;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Team yorkCity = new Team("YCFC","York City");

        Player diMaria = new Player("Di Maria","1997-01-01",11);
        Player mBappe = new Player("MBappe","1970-01-01",22);

        yorkCity.addPlayer(diMaria);
        yorkCity.addPlayer(mBappe);

        teamRepo.save(yorkCity);
        playerRepo.save(diMaria);
        playerRepo.save(mBappe);

        System.out.println(yorkCity.toString());
    }
}