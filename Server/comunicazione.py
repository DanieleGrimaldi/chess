import logging
import threading
import time

def thread_comunicazione(conn):
    dati = conn.recv(1500)#ricevo
    #conn.sendall(b'restituisco dati ricevuti:'+dati)#trasmetto
    print(dati)