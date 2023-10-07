/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.Grafo.Grafico;

/**
 *
 * @author cehernandez
 */

public class MiArrayList<T> {
    private T[] elementos;
    private int size;

    public MiArrayList() {
        elementos = (T[]) new Object[10];
        size = 0;
    }

    public void add(T elemento) {
        if (size == elementos.length) {
            T[] nuevoArray = (T[]) new Object[elementos.length * 2];
            System.arraycopy(elementos, 0, nuevoArray, 0, size);
            elementos = nuevoArray;
        }
        elementos[size] = elemento;
        size++;
    }

    public T get(int index) {
        if (index >= size || index < 0) {
            return null;
        }
        return elementos[index];
    }

    public int size() {
        return size;
    }
}
        
        
//EXPLICACIÓN DEL CÓDIGO:

//1. `package proyecto.Grafos.Grafico;` - Define el paquete en el que se encuentra tu clase.
//2. `public class MiArrayList<T> {...}` - Define la clase pública `MiArrayList` que es una implementación de una 
//lista dinámica genérica.
//3. `private T[] elementos;` - Declara un array genérico `elementos` para almacenar los elementos de la lista.
//4. `private int size;` - Declara una variable privada `size` para llevar un registro del tamaño actual de la 
//lista.
//5. `public MiArrayList() {...}` - Define el constructor de la clase que inicializa el array con una 
//capacidad inicial de 10 y establece el tamaño en 0.
//6. `public void add(T elemento) {...}` - Define un método para agregar un elemento a la lista. 
//Si la lista está llena, crea un nuevo array con el doble de capacidad, copia los elementos existentes 
//al nuevo array y luego agrega el nuevo elemento.
//7. `public T get(int index) {...}` - Define un método para obtener un elemento en un índice específico 
//de la lista. Si el índice está fuera de los límites, retorna null.
//8. `public int size() {...}` - Define un método para obtener el tamaño actual de la lista.

