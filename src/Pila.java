public class Pila {
    private  NodoPilas ultimo;
    int tamanio;
    public  Pila(){
        ultimo = null ;
        tamanio =0;
    }
    public boolean empty(){
        return  ultimo == null;
    }
    public void push(int dato){
        NodoPilas nuevo = new NodoPilas(dato);
        nuevo.siguiente = ultimo;
        ultimo = nuevo;
        tamanio ++;
    }
    public void pop(){
        int temp =
    }
    public void peek(){}
    public void size(){}
    public  void  clear(){}

}
