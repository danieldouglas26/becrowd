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
Trilhos - EX 14

Há uma famosa estação de trem na cidade PopPush. Esta cidade fica em um país incrivelmente acidentado e a estação foi criada no último século. Infelizmente os fundos eram extremamente limitados naquela época. Foi possível construir somente uma pista. Além disso, devido a problemas de espaço, foi feita uma pista apenas até a estação (veja figura abaixo).
 
A tradição local é que todos os comboios que chegam vindo da direção A continuam na direção B com os vagões  reorganizados, de alguma forma. Suponha que o trem que está chegando da direção A tem N <= 1000 vagões numerados sempre em ordem crescente 1,2, ..., N. O primeiro que chega é o 1 e o último que chega é o N. Existe um chefe de reorganizações de trens que quer saber se é possível reorganizar os vagões para que os mesmos saiam na direção B na ordem a1, a2, an..

O  chefe pode utilizar qualquer estratégia para obter a saída desejada. No caso do desenho ilustrado acima, por exemplo, basta o chefe deixar todos os vagões entrarem na estação (do 1 ao 5) e depois retirar um a um: retira o 5, retira o 4, retira o 3, retira o 2 e por último retira o 1.  Desta forma, se o chefe quer saber se a saída 5,4,3,2,1 é possível em B, a resposta seria Yes. Vagão que entra na estação só pode sair para a direção B e é possível incluir quantos forem necessários para retirar o primeiro vagão desejado.

Entrada
O arquivo de entrada consiste de um bloco de linhas, cada bloco, com exceção do último, descreve um trem e possivelmente mais do que uma requisição de reorganização. Na primeira linha de cada bloco há um inteiro N que é a quantidade de vagões. Em cada uma das próximas linhas de entrada haverá uma permutação dos valores 1,2, …, N. A última linha de cada bloco contém apenas 0. Um bloco iniciando com zero (0) indica o final da entrada.

Saída
O arquivo de saída contém a quantidade de linhas correspondente às linhas com permutações no arquivo de entrada. Cada linha de saída deve ser Yes se for possível organizar os vagões da forma solicitada e No, caso contrário. Há também uma linha em branco após cada bloco de entrada. No exemplo abaixo,  O primeiro caso de teste tem 3 permutações para 5 vagões. O ultimo zero dos testes de entrada não devem ser processados.
*/

package lista1;
import java.io.IOException;
import java.util.*;
import java.io.*;

/**
 *
 * @author Daniel Douglas <danieldouglas26@outlook.com>
 * @date 28/02/2024
 * @brief Class Ex14
 */
public class Ex14 {

     public static class ArrayStack implements Stack

  {

    private int top;

    private int[] storage;

 

    ArrayStack(int capacity)

    {

      if (capacity <= 0)

        throw new IllegalArgumentException

                  ("Stack's capacity must be positive");

      storage = new int[capacity];

      top = -1;

    }

 

    public void push(int value)

    {

      if (top == storage.length)

        throw new

          StackException("Stack's underlying storage is overflow");

      top++;

      storage[top] = value;

    }

       

    public int peek()

    {

      if (top == -1)

        throw new StackException("Stack is empty");

      return storage[top];

    }

 

    public void pop()

    {

      if (top == -1)

        throw new StackException("Stack is empty");

      top--;

    }

 

    public boolean isEmpty()

    {

      return (top == -1);

    }

 

    public class StackException extends RuntimeException

    {

      public StackException(String message)

      {

        super(message);

      }

    }

  }

 

  public interface Stack

  {

    void push(int value);

    int peek();

    void pop();

    boolean isEmpty();

  }
 
    public static void main(String[] args) throws IOException {
 
      
    BufferedReader in =

      new BufferedReader(new InputStreamReader(System.in));

    String Line;

    while(!(Line = in.readLine()).equals("0"))

    {

      int n = Integer.parseInt(Line);       

      int cur, ok;

      String Line1;

      while(!(Line1 = in.readLine()).equals("0"))

      {

        StringTokenizer st = new StringTokenizer(Line1);

        int x = Integer.parseInt(st.nextToken());       

        cur = ok = 1;

       

        ArrayStack s = new ArrayStack(2000);

        for(int i = 1; i < n; i++)

        {

          for(; cur <= x; cur++) s.push(cur);

          if (s.peek() != x) ok = 0;

          s.pop();

          x = Integer.parseInt(st.nextToken());

        }

        String Answer = (ok == 1) ? "Yes" : "No";

        System.out.println(Answer);

      }

      System.out.println("");   

    }

  }

}
