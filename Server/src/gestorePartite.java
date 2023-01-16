public class gestorePartite {
    List<Partite> ListPartite = new ArrayList<Partite>();
    int cont = 0;
    public gestorePartite(){

    }
    public synchronized int crea(Socket socket){
        ListPartite[cont]=new partita(socket);
        return cont;
    }
    public void unisciti(Integer id ,Socket socket){
        if(cont<=id){
            ListPartite[id].aggingiti(socket);
            avvia(id);
        }

    }
    public void avvia(Int id){
        ListPartite[id].start();
    }
}
