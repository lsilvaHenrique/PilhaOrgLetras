package view;

import java.util.Collections;
import java.util.Stack;

public class PilhaTres {
    public PilhaTres() {
    }
    public static void main(String[] args) {
        Stack<Character> pilha = new Stack<>();
        pilha.push('W');
        pilha.push('L');
        pilha.push('H');
        pilha.push('B');
        pilha.push('R');
        pilha.push('G');
        pilha.push('J');

        Stack<Character> pilhaFinal = new Stack<>();
        char valor;
        valor = pilha.pop();
        while (valor != 'R') {
            valor = pilha.pop();
        }
        pilhaFinal.push(valor);

        valor = pilha.pop();
        while (valor != 'W') {
            pilhaFinal.push(valor);
            valor = pilha.pop();
        }
        pilhaFinal.push(valor);

        pilhaFinal.push('K');
        pilhaFinal.push('G');
        pilhaFinal.push('M');
        pilhaFinal.push('B');
        pilhaFinal.push('L');

        System.out.println("Console: " + pilhaFinal.pop() + ", " + pilhaFinal.pop());
        System.out.print("Pilha Final: [");
        while (!pilhaFinal.isEmpty()) {
            System.out.print(pilhaFinal.pop());
            if (!pilhaFinal.isEmpty()) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    }
    

