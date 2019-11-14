/*
 * Implementation of Doubly Linked List (DDL) on Java
 * 
 * Oleg Brezitskyy
 * Data Structures and Algorithms
 * 2º Ingeniería de la Salud
 * Universidad de Málaga
 * 
 */

package doublyLinkedList;

public class Test {

	public static void main(String[] args) {
		DDL<Integer> newList = new DDL<Integer>();
		newList.clear();
		newList.insert(1);
		newList.append(2);
		newList.append(3);
		newList.append(4);
		newList.append(5);
		System.out.println(newList.toString());
		
		newList.moveToEnd();
		newList.prev();
		System.out.println(newList.getValue());
		
		System.out.println(newList.isEmpty());
		
		newList.clear();
		System.out.println("Empty list:" + newList.toString());	
	}

}
