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
    public int pop(){
        int temp =ultimo.dato;
        ultimo = ultimo.siguiente;
        tamanio --;
        return temp;
    }
    public int peek(){
        return  ultimo.dato;
    }
    public int size(){
        return tamanio;
    }
    public  void  clear(){
        while(!empty()){
            pop();
        }
    }

}
