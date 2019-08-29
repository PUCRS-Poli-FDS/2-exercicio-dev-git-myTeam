package br.pucrs.marsrover;

import br.pucrs.marsrover.service.Rover;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MarsroverApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarsroverApplication.class, args);
        Rover rover = new Rover(0,0, "N");

        rover.posicao(4, 5);
        rover.move("LLLRM");

    }

}
