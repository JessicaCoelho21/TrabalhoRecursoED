package structures;

import exceptions.EmptyCollectionException;

public interface HeapADT<T> extends BinaryTreeADT<T> {
    /**
     * Adds the specified object to this heap
     * @param obj the element to be added to this heap
     */
    public void addElement(T obj);
    
    /**
     * Removes element with the lowest value from this heap
     * @return the element with the lowest value from this heap
     * @throws exceptions.EmptyCollectionException
     */
    public T removeMin() throws EmptyCollectionException;
    
    /**
     * Returns a reference to the element with the lowest value in this heap
     * @return a reference to the element with the lowest value in this heap
     * @throws exceptions.EmptyCollectionException
     */
    public T findMin() throws EmptyCollectionException;
}
