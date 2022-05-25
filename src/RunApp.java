import java.util.Scanner;

public class RunApp {

    public static void main(String[] args) {
        
        ListaNum listaEncadeada = new ListaNum();
        Scanner scan = new Scanner(System.in);

        System.out.println("Testando Método: vazia()");
        System.out.println(listaEncadeada.vazia());
        System.out.println("\nClique para continuar");
        scan.nextLine();

        System.out.println("Testando Método: inserePrimeiro(40)");
        listaEncadeada.inserePrimeiro(40);
        listaEncadeada.mostrar();
        System.out.println("\nClique para continuar");
        scan.nextLine();

      
        System.out.println("Testando Método: inserePrimeiro(50)");
        listaEncadeada.inserePrimeiro(50);
        listaEncadeada.mostrar();
        System.out.println("\nClique para continuar");
        scan.nextLine();

        System.out.println("Testando Método: insereDepois(No no, 36)");
        No noAnteriorTeste1 = listaEncadeada.GetNoByValor(50);
        listaEncadeada.insereDepois(noAnteriorTeste1, 36);
        listaEncadeada.mostrar();
        System.out.println("\nClique para continuar");
        scan.nextLine();
        
        System.out.println("Testando Método: insereDepois(No no, 47)");
        No noAnteriorTeste2 = listaEncadeada.GetNoByValor(50);
        listaEncadeada.insereDepois(noAnteriorTeste2, 47);
        listaEncadeada.mostrar();
        System.out.println("\nClique para continuar");
        scan.nextLine();

        System.out.println("Testando Método: insereUltimo(13)");
        listaEncadeada.insereUltimo(13);
        listaEncadeada.mostrar();
        System.out.println("\nClique para continuar");
        scan.nextLine();

        System.out.println("Testando Método: insereUltimo(28)");
        listaEncadeada.insereUltimo(28);
        listaEncadeada.mostrar();
        System.out.println("\nClique para continuar");
        scan.nextLine();

        System.out.println("Testando Método: removePrimeiro()");
        listaEncadeada.removePrimeiro();
        listaEncadeada.mostrar();
        System.out.println("\nClique para continuar");
        scan.nextLine();

        System.out.println("Testando Método: removeUltimo()");
        listaEncadeada.removeUltimo();
        listaEncadeada.mostrar();
        System.out.println("\nClique para continuar");
        scan.nextLine();

        System.out.println("Testando Método: remove(No no)");
        No noAnteriorTeste3 = listaEncadeada.GetNoByValor(36);
        listaEncadeada.remove(noAnteriorTeste3);
        listaEncadeada.mostrar();
        System.out.println("\nClique para continuar");
        scan.nextLine();
        scan.close();
    }
}
