/**
 * 
 */
package posfixcalc;

/**
 * @author moises.alonso
 * @param <T>
 *
 */
public interface IStack<T> {

	void push(T value);
	
	T pull();
	
	T peek();
	
	int count();
	
	boolean isEmpty();
}