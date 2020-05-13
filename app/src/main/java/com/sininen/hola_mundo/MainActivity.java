/******************************
 *
 *  HOLA MUNDO!
 *
 *  Antes que nada, deshabiliten el "TODO". Vayan a File -> Settings -> Editor -> TODO  y eliminen
 *  la linea del Todo.
 *
 *  todo (si ven esto azul es porque aun la tienen habilitada! se van a volver locos porque
 *  el "TODO" es de "TO DO" en inglés, pero pa nosotros no jaja)
 */


/* Lo siguient es el nombre de nuestro paquete. Veo que suelen empezar por "com" (Commercial?),
luego el nombre de la empresa, y luego el nombre del programa. Esto crea esos directorios en
el celular y todos los ejecutables, imágenes, sonidos y demás se cargan aca:

"/com/sininen/hola_mundo"

 */

package com.sininen.hola_mundo;


/* Acá van las librerías que usamos. Qué son librerías? partes de código ya programadas en el
lenguaje que podemos reutilizar. Las dos primeras es como que las necesitamos para utilizar lo de
los XML y demás. No darles mucha bola, pero siempre que necesiten una va con el "import"
 */

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

// Lo siguiente es como el "int main()" del C++. Bueno, no, pero hagan de cuenta que es eso! jajaja
// Ya lo veran cuando vean objetos, pero por ahora quedense con el "MainActivity" y relacionenlo
// con el "main" de C++

public class MainActivity extends AppCompatActivity {

    @Override  // No le den bola aun, pero dejenlo

    /* Lo siguiente es una función que se ejecuta cuando se crea el objeto. Esto no es propio
    de Java sino de Android. Lo de Protected va relacionado con objetos y lo de void es que
    la función no devuelve nada (se acuerdan que int main devolvía un "int" al sistema operativo?
    Bueno, esta no devuelve nada (void = vacio).
    */


    protected void onCreate(Bundle savedInstanceState)   // Esto es una función, tampoco le den bola
    {
        super.onCreate(savedInstanceState);       // No le den bola pero tiene que estar
        setContentView(R.layout.activity_main);  // Esto es lo que inicializa el XML con todo el layout

        // Acá va el código que necesitamos cuando se inicie la función, de momento take it easy
    }
}








