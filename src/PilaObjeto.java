import  java.util.ArrayList;
public class PilaObjeto {
    private ArrayList<Object> pila = new ArrayList<>();

    public  void push(Object elemento){
            pila.add(elemento);
    }
    public  Object pop(){
        if (!pila.isEmpty()) {
            Object temporal = pila.get(pila.size()-1);
            pila.remove(pila.size()-1);
            return temporal;
        }else{
            return  null;
        }
    }
    public  boolean empty(){
        return  pila.isEmpty();
    }
}
