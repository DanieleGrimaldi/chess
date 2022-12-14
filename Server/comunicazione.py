import logging
import threading
import time
import scrittura


def thread_comunicazione(conn,id,gestione):
    try:
        connesso = True
        while connesso:
            dati = conn.recv(1500)#ricevo
            messaggi=dati.decode('UTF-8').lower().splitlines()
            
            for mess in messaggi:
                if(mess.startswith("mossa")):
                    print("mossa")
                elif(mess.startswith("utenti")):
                    gestione.utenti(id)
                elif(mess.startswith("disconnetti")):
                    connesso=False
                elif(mess.startswith("partita")):
                    print("partita")
                else:
                    print(mess)
                
    finally:
        gestione.elimina(id)
 
            
        #conn.sendall(b'restituisco dati ricevuti:'+dati)#trasmetto
        