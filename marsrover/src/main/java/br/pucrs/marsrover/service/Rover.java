package br.pucrs.marsrover.service;

public class Rover {

    int x;
    int y;
    String orientacao;
    int graus;

    public Rover(int x, int y, String orientacao) {
        this.x = x;
        this.y = y;
        this.orientacao = orientacao;
    }

    public void posicao(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.print(this.x+" "+this.y+" "+getCardeais(graus));
    }

    public void move(String orientacao) {
        for(char c: orientacao.toCharArray()) {
            switch(c) {
                case 'L':
                    if(graus == 0) {
                        graus = 360;
                        graus -= 90;
                    } else {
                        graus -= 90;
                    }
                    System.out.print(x+" "+y+" "+getCardeais(graus));
                    break;
                case 'R':
                    if(graus == 360) {
                        graus = 0;
                        graus += 90;
                    } else {
                        graus = graus+90;
                    }
                    System.out.print(x+" "+y+" "+getCardeais(graus));
                    break;
                case 'M':
                    y += 1;
                    System.out.print(x+" "+y+" "+getCardeais(graus));
                    break;
                default:
                    System.out.println("Orientação inválida!");
            }
        }
    }

    private String getCardeais(int grau) {
        String pontoCardeal = "";
        switch (grau) {
            case 0:
                pontoCardeal = "Norte\n";
                break;
            case 90:
                pontoCardeal = "Leste\n";
                break;
            case 180:
                pontoCardeal = "Sul\n";
                break;
            case 270:
                pontoCardeal = "Oeste\n";
                break;
            case 360:
                pontoCardeal = "Norte\n";
                break;
            default:
                pontoCardeal = "Ponto inexistente\n";
                break;
        }
        return pontoCardeal;
    }
}
