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
Fórmula de Bhaskara - EX 3

Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de numero negativo.

Entrada
Leia três valores de ponto flutuante (double) A, B e C.

Saída
Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular". Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem correspondente conforme exemplo abaixo. Imprima sempre o final de linha após cada mensagem.
 */
package lista1;

import java.util.Scanner;

/**
 *
 * @author Daniel Douglas <danieldouglas26@outlook.com>
 * @date 28/02/2024
 * @brief Class Ex3
 */
public class Ex3 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double A, B, C, DELTA, Bas1, Bas2;

        A = ler.nextDouble();
        B = ler.nextDouble();
        C = ler.nextDouble();

        DELTA = Math.pow(B, 2) - 4 * A * C;

        Bas1 = ((-1 * B) + Math.sqrt(DELTA)) / 2 * A;

        Bas2 = ((-1 * B) - Math.sqrt(DELTA)) / 2 * A;

        if (A == 0 || DELTA < 0) {
            System.out.println("Impossivel calcular");
        } else {
            Bas1 = (-B + Math.sqrt(DELTA)) / (2 * A);
            Bas2 = (-B - Math.sqrt(DELTA)) / (2 * A);

            System.out.printf("R1 = %.5f%n", Bas1);
            System.out.printf("R2 = %.5f%n", Bas2);
        }

    }

}
