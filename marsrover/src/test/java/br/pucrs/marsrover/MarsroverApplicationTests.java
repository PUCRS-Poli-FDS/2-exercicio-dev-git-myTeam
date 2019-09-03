package br.pucrs.marsrover;

import br.pucrs.marsrover.service.Rover;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.springframework.test.util.AssertionErrors.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MarsroverApplicationTests {

    Rover rover1;
    Rover rover2;
    Rover rover3;
    Rover rover4;

    @Before
    public void setup() {
        rover1 = new Rover(0,0, "N");
        rover2 = new Rover(0,0, "N");
        rover3 = new Rover(0,0, "N");
        rover4 = new Rover(0,0, "N");
    }

    @Test
    public void testeMoverRover() {
        String retornoEsperado = "2 4 Leste";
        rover1.posicao(2, 4);
        assertEquals("Deu ruim", retornoEsperado, rover1.move("LLL"));
    }

    @Test
    public void contextLoads() {
    }

}
