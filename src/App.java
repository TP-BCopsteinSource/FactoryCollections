import java.util.Collection;

public class App {

	public static void main(String[] args) {
        CollectionFactory cf = CollectionFactory.getInstance();
        
        Collection<String> cs = cf.createInstance(1000); // O método infere o tipo pelo tipo da variável que recebe o retorno
        System.out.println(cs.getClass().getName());
        
        cs.add("Eca");
        for(Object o:cs) {
        	System.out.println(o.getClass().getName());
        }
        
        Collection<Integer> ci = cf.createInstance(CollectionFactory.Tipo.UNIQUE_ORDERED);
        System.out.println(ci.getClass().getName());
	}

}
