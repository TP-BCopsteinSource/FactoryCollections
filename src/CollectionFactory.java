import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class CollectionFactory {
	public enum Tipo {NOT_UNIQUE,UNIQUE_UNORDERED,UNIQUE_ORDERED}
	
    private static CollectionFactory cf = null;
    
	private CollectionFactory() {
	}
	
	public static CollectionFactory getInstance() {
		if (cf == null) {
			return new CollectionFactory();
		}
		return cf;
	}
	
	public <T> Collection<T> createInstance(int size) {
		return new ArrayList<T>(size);
	}
	
	public <T> Collection<T> createInstance(Tipo tipo){
		switch(tipo) {
		case NOT_UNIQUE:
			return new LinkedList<T>();
		case UNIQUE_UNORDERED:
			return new HashSet<T>();
		case UNIQUE_ORDERED:
			return new TreeSet<T>();
		default:
			return null;
		}
	}
}
