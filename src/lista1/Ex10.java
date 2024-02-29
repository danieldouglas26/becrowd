/*
 * Copyright (C) 2024 Daniel Douglas <danieldouglas26@outlook.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

 /*

A Corrida de Lesmas - EX 10

A corrida de lesmas é um esporte que cresceu muito nos últimos anos, fazendo com que várias pessoas dediquem suas vidas tentando capturar lesmas velozes, e treina-las para faturar milhões em corridas pelo mundo. Porém a tarefa de capturar lesmas velozes não é uma tarefa muito fácil, pois praticamente todas as lesmas são muito lentas. Cada lesma é classificada em um nível dependendo de sua velocidade:


Nível 1: Se a velocidade é menor que 10 cm/h .
Nível 2: Se a velocidade é maior ou igual a 10 cm/h e menor que 20 cm/h .
Nível 3: Se a velocidade é maior ou igual a 20 cm/h .


Sua tarefa é identificar qual nível de velocidade da lesma mais veloz de um grupo de lesmas.

Entrada
A entrada consiste de múltiplos casos de teste, e cada um consiste em duas linhas: A primeira linha contém um inteiro L (1 ≤ L ≤ 500) representando o número de lesmas do grupo, e a segunda linha contém L inteiros Vi (1 ≤ Vi ≤ 50) representando as velocidades de cada lesma do grupo.

A entrada termina com o fim do arquivo (EOF).

Saída
Para cada caso de teste, imprima uma única linha indicando o nível de velocidade da lesma mais veloz do grupo.
 */
package lista1;

import java.util.Scanner;

/**
 *
 * @author Daniel Douglas <danieldouglas26@outlook.com>
 * @date 28/02/2024
 * @brief Class Ex10
 */
public class Ex10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Verificação de fim de arquivo
            if (!scanner.hasNext()) {
                break;
            }

            // Leitura do número de lesmas
            int l = scanner.nextInt();
            if (l == 0) {
                break;
            }

            // Leitura das velocidades das lesmas
            int[] velocidades = new int[l];
            for (int i = 0; i < l; i++) {
                // Verificação de disponibilidade de elemento
                if (!scanner.hasNextInt()) {
                    throw new RuntimeException("Entrada incompleta para o caso de teste " + (i + 1));
                }
                velocidades[i] = scanner.nextInt();
            }

            // Encontrar a velocidade máxima
            int velocidadeMaxima = Integer.MIN_VALUE;
            for (int velocidade : velocidades) {
                if (velocidade > velocidadeMaxima) {
                    velocidadeMaxima = velocidade;
                }
            }

            // Determinar o nível da lesma mais veloz
            int nivel = 1;
            if (velocidadeMaxima >= 20) {
                nivel = 3;
            } else if (velocidadeMaxima >= 10) {
                nivel = 2;
            }

            // Imprimir o nível da lesma mais veloz
            System.out.println(nivel);
        }
    }
}
