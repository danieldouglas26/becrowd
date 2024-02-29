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

Quadrante - EX 7

Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

Entrada
A entrada contém vários casos de teste. Cada caso de teste contém 2 valores inteiros.

Saída
Para cada caso de teste mostre em qual quadrante do sistema cartesiano se encontra a coordenada lida, conforme o exemplo.
 */
package lista1;

import java.util.Scanner;

/**
 *
 * @author Daniel Douglas <danieldouglas26@outlook.com>
 * @date 28/02/2024
 * @brief Class Ex7
 */
public class Ex7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (x == 0 || y == 0) {
                break;
            }

            String quadrante;

            if (x > 0 && y > 0) {
                quadrante = "primeiro";
            } else if (x < 0 && y > 0) {
                quadrante = "segundo";
            } else if (x < 0 && y < 0) {
                quadrante = "terceiro";
            } else {
                quadrante = "quarto";
            }

            System.out.println(quadrante);
        }

    }

}
