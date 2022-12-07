import socket
print ('avvio server')
HOST = '127.0.0.1' 
PORT = 60001
s = socket.socket() #senza parametri protocollo tcp-ip
s.bind((HOST, PORT))
s.listen()
conn, addr = s.accept()
print('Connesso ad IP: ', addr)
while True:
    dati = conn.recv(1024)
    if not dati:
        break
    conn.sendall(b'restituisco dati ricevuti:'+dati)
    print('dati ricevuti: ',dati)
s.close()    
print('Fine programma')