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

Sort Simples - EX 6

Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os valores em ordem crescente, uma linha em branco e em seguida, os valores na sequência como foram lidos.

Entrada
A entrada contem três números inteiros.

Saída
Imprima a saída conforme foi especificado.
 */
package lista1;

import java.util.Scanner;

/**
 *
 * @author Daniel Douglas <danieldouglas26@outlook.com>
 * @date 28/02/2024
 * @brief Class Ex6
 */
public class Ex6 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int a, b, c;

        a = ler.nextInt();
        b = ler.nextInt();
        c = ler.nextInt();

        if (a <= b && a <= c) {
            System.out.println(a);
            if (b <= c) {
                System.out.println(b);
                System.out.println(c);
            } else {
                System.out.println(c);
                System.out.println(b);
            }
        } else if (b <= a && b <= c) {
            System.out.println(b);
            if (a <= c) {
                System.out.println(a);
                System.out.println(c);
            } else {
                System.out.println(c);
                System.out.println(a);
            }
        } else {
            System.out.println(c);
            if (a <= b) {
                System.out.println(a);
                System.out.println(b);
            } else {
                System.out.println(b);
                System.out.println(a);
            }
        }

        System.out.println(); // Linha em branco

        // Imprime os valores na sequência como foram lidos
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

}
