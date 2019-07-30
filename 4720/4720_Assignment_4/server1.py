import socket
import logging

port=12345

def multiply1 (a, b):
    return a*b;

logging.basicConfig(level=logging.ERROR)

#socket()
listener=socket.socket()
#bind(): Ip address with port number
listener.bind(('127.0.0.1',port))
#listen()
listener.listen(0)
#accept()

while True:
    (sock,addr)=listener.accept()  ## waits for a connection request
    # when successful, returns a socket
    # to use to communicate with the client
    #read()
    logging.debug("Server connected to:"+str(addr))
    bytes=sock.recv(2048)

    client_data=""
    # get data from the client
    while len(bytes)>0:
        client_data+=bytes.decode()
        bytes=sock.recv(2048)

    # parse and process the data from the client
    list_of_parts=client_data.split(' ')
    # "12 6"  ["12", "6"]
    # "12  6" ["12", "", "6"]
    # "twelve six" ["twelve", "six"]
    if len(list_of_parts) !=2:
        # signal an error
        # error response
        response_status = 'E'
        response_message= 'Incorrect number of parameter values'
        logging.error(response_message)
    else:
        try:
            # try to convert the two value to int
            # compute them and create a correct response
            result = multiply1(int(list_of_parts[0]), int(list_of_parts[1]))
            response_status='B'
            response_message=str(result)
        except:
            # signal a conversion or computation problem
            # error response
            response_status = 'E'
            response_message = 'Conversion or computation problem '
            logging.error(response_message)

        #write()
    message=response_status+response_message
    response_bytes=message.encode()
    sock.sendall(response_bytes)
    sock.shutdown(1)  #signal close of the writing the socket




#close()

sock.close()