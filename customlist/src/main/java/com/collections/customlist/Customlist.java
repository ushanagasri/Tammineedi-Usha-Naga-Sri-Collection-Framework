package com.collections.customlist;
import java.util.AbstractList;
import java.util.Arrays;

public @SuppressWarnings("serial") class Customlist<T> extends AbstractList<T>implements java.io.Serializable{
	private int size = 0;
	private static final int DEFAULT_CAPACITY = 10;
	private Object [] list;

	    Customlist() {
	        list =new Object[DEFAULT_CAPACITY];
	    }
	    public boolean add(T t) {
	        if (size == list.length) {
	            ensureCapacity();
	        }
	        list[size++] = t;
			return true;
	    }
	    
	    @SuppressWarnings("unchecked")
		public T get(int position) {
	        if (position >= size || position< 0) {
	            throw new IndexOutOfBoundsException("Index: " + position + ", Size " + position);
	        }
	        return (T) list[position];
	    }
	    @SuppressWarnings("unchecked")
		public T remove(int position) {
	        if (position >= size || position < 0) {
	            throw new IndexOutOfBoundsException("Index: " + position + ", Size " + position);
	        }
	        Object item = list[position];
	        int numofelements = list.length - ( position + 1 ) ;
	        System.arraycopy( list, position + 1, list, position, numofelements ) ;
	        size--;
	        return (T) item;
	    }
	    public int size() {
	        return size;
	    }
	    public String toString() 
	    {
	         StringBuilder str = new StringBuilder();
	         str.append('[');
	         for(int i = 0; i < size ;i++) {
	             str.append(list[i].toString());
	             if(i<size-1){
	                 str.append(",");
	             }
	         }
	         str.append(']');
	         return str.toString();
	    }
	    private void ensureCapacity() {
	        int newSize = list.length * 2;
	        list = Arrays.copyOf(list, newSize);
	    }
}
