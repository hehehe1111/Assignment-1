
public interface BagInterface<T> {
	/**
	 * gets the current number of entries in this bag
	 * @return The Integer number of entries
	 */
	public int getCurrentSize();
	
	/**
	 * checks if the bag is empty
	 * @return true if the bag is empty, false if not
	 */
	public boolean isEmpty();
	
	/**
	 * Adds a new entry to this bag
	 * @param newEntry the object to be added
	 * @return true if the addition is successful, false if not
	 */
	public boolean add(T newEntry);
	
	/**
	 * removes one unspecified entry from this bag
	 * @return the removed entry, or null if removal was unsuccessful
	 */
	public T remove();
	
	/**
	 * removes all entries from the bag
	 */
	public void clear();
	
	/**
	 * counts the number of times a given entry occurs
	 * @param anENtry The entry to be counted
	 * @return The number of times anEntry appears in the bag
	 */
	public int getFrequencyOf(T anEntry);
	
	/**
	 * checks whether the bag contains a given entry
	 * @param anEntry The entry that is to be found in the bag
	 * return True if the bag contains the entry, false if it doesn't
	 */
	public boolean contains(T anEntry);
	
	/**
	 * Retrieves all the entries in the bag
	 * @return a newly allocated array if all entries, or returns an empty array if there are no entries
	 */
	public T[] toArray();

	boolean remove(T anEntry);


}
