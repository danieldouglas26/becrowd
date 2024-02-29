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

Divisores I - EX 8

Ler um número inteiro N e calcular todos os seus divisores.

Entrada
O arquivo de entrada contém um valor inteiro.

Saída
Escreva todos os divisores positivos de N, um valor por linha.
*/

package lista1;
import java.util.Scanner;
/**
 *
 * @author Daniel Douglas <danieldouglas26@outlook.com>
 * @date 28/02/2024
 * @brief Class Ex8
 */
public class Ex8 {

    public static void main(String[] args) {
        
Scanner scanner = new Scanner (System.in);
      int N = scanner.nextInt();
      
      for (int i = 1; i <= N; i ++) {
          if (N % i == 0) {
              System.out.println(i);
          }
      }
    
    }
 
}