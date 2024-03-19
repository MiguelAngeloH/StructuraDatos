//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PilaObjeto pilaObjeto = new PilaObjeto();
        pilaObjeto.push("Mikel");
        pilaObjeto.push(true);
        pilaObjeto.push(false);
        pilaObjeto.push(2.2f);
        pilaObjeto.push(10000000000000f);
        pilaObjeto.pop();
        while (!pilaObjeto.empty()){
            System.out.println("pilaObjeto = " + pilaObjeto.pop());
        }
    }
}