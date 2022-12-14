import socket
import comunicazione
import threading
import scrittura

print ('avvio server')
HOST = '127.0.0.1' 
PORT = 8080
s = socket.socket() #senza parametri protocollo tcp-ip
s.bind((HOST, PORT))
flag=True
dizUtenti = {}
id=0
gestione =  scrittura.ClassScrivi(dizUtenti)
while flag:
    s.listen()
    conn, addr = s.accept()
    dizUtenti[id]=conn
    x = threading.Thread(target=comunicazione.thread_comunicazione, args=(conn,id,gestione))
    id+=1
    x.start()
        
s.close()    
print('Fine programma')