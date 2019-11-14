/*
 * Implementation of Doubly Linked List (DDL) on Java
 * 
 * Oleg Brezitskyy
 * Data Structures and Algorithms
 * 2� Ingenier�a de la Salud
 * Universidad de M�laga
 * 
 */

package doublyLinkedList;

// List interface defined by Dr. Carlos Cotta

public interface List<E> {

	// Elimina todos los elementos de la lista
	public void clear();
	
	// Inserta un elemento en la posici�n actual
	public boolean insert (E item);
	
	// Agrega un elemento al final de la lista
	public boolean append (E item);
	
	// Elimina (y devuelve) el elemento actual
	public E remove();
	
	// Mueve la posici�n actual al principio de la lista
	public void moveToStart();
	
	// Mueve la posici�n actual al final de la lista
	public void moveToEnd();
	
	// Mueve la posici�n actual a la anterior
	public void prev();
	
	// Mueve la posici�n actual a la siguiente
	public void next();
	
	// Devuelve la longitud de la lista
	public int length();
	
	// Devuelve el �ndice de la posici�n actual
	public int currPos();
	
	// Mueve la posici�n actual a la indicada
	public boolean moveToPos(int pos);
	
	// Devuelve el elemento actual
	public E getValue ();
	
	// Indica si la posici�n actual es la �ltima
	public boolean isAtEnd ();
	
	// Indica si la lista est� vac�a o no
	public boolean isEmpty ();

}
