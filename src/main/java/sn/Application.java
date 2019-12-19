package sn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import sn.domain.Player;
import sn.domain.Team;
import sn.persistence.PlayerRepository;
import sn.persistence.TeamRepository;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Optional;

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
        Team yorkCity = new Team("YCFC","York City",1,new ArrayList<Player>());

        Player diMaria = new Player("Di Maria",new SimpleDateFormat("yyyy-MM-dd").parse("1992-10-04"),11);
        Player mBappe = new Player("MBappe",new SimpleDateFormat("yyyy-MM-dd").parse("1992-10-04"),22);

        yorkCity.addPlayer(diMaria);
        yorkCity.addPlayer(mBappe);

        teamRepo.save(yorkCity);
        playerRepo.save(diMaria);
        playerRepo.save(mBappe);

        Optional<Player> firstPlayer = playerRepo.findById(diMaria.getPlayerId());

        System.out.println(yorkCity.toString());
    }

    @Bean
    public Jackson2ObjectMapperBuilder objectMapperBuilder() {
        Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder();
        builder.dateFormat(new SimpleDateFormat("dd/MM/yyyy"));
        return builder;
    }
}