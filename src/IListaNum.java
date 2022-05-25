public interface IListaNum {
    boolean vazia();
    void inserePrimeiro(int info);
    void insereDepois(No no, int info);
    void insereUltimo(int info);
    No removePrimeiro();
    No removeUltimo();
    No remove(No no);
    void mostrar();   
}
