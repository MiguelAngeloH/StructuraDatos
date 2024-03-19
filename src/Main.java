//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Pila pila= new Pila();
       pila.push(0);
       pila.push(4);
       pila.push(45);
       pila.push(45);
       pila.push(120);
       pila.push(85);
       pila.push(100);
       while(!pila.empty()){
           System.out.println("pila.pop() = " + pila.pop());
       }
    }
}