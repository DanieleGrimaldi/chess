class ClassScrivi:
   
    def __init__(self,dizUtenti):
        self.dizUtenti = dizUtenti
        
    def scrivi(self,idDestinatario,messaggio):
        flusso=self.dizUtenti[idDestinatario]
        flusso.send(messaggio)
        
    def utenti(self,idDestinatario):
        flusso=self.dizUtenti[idDestinatario]
        messaggio=""
        for utente in self.dizUtenti.keys():
            if(utente!=idDestinatario):
                messaggio+=utente+";"
                
        flusso.send(messaggio)
        
    def elimina(Id):
        del self.dizUtenti[id]
        
        
        