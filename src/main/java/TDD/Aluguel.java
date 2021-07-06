package TDD;

import java.util.List;

public class Aluguel {

    public float calcularAluguel(List<Filme> filmes) {

        float total = 0;

        for (int i=0; i < filmes.size(); i++) {

            if (i == 6 || i > 6) {
                total += filmes.get(i).getValor() * 1;
            }

                else if (i == 5) {
                    total += filmes.get(i).getValor() * 0.00;
                }

                    else if (i == 4) {
                        total += filmes.get(i).getValor() * 0.75;
                    }

                        else if (i == 3) {
                            total += filmes.get(i).getValor() * 0.50;
                        }

                            else if (i == 2) {
                                total += filmes.get(i).getValor() * 0.75;
                            }

                                else {
                                    total += filmes.get(i).getValor();
                                }
        }
        return total;
    }
}