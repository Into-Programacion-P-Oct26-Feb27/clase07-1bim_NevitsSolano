
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplociclowhile;

/**
 *
 * @author SALASC
 */
public class Ejemplo15 {

    public static void main(String[] args) {

        int contador = 1;
        int limite = 1;
        while (contador <= limite) {
            System.out.printf("Valor %s\n", contador);
        }
    }
}

/* No ingresa nunca al ciclo porque el contador no es menor que el límite lo
cual será falso y el programa no se ejecutará.
*/
