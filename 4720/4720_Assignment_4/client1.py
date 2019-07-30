import socket

#socket()
sock=socket.socket()

#connect()
sock.connect(('127.0.0.1', 12345))
#write()

n="twohundred"
m=100

request=str(n)+" "+str(m)

sock.sendall(request.encode())
sock.shutdown(1)    # signal the server we're sending no more data

bytes=sock.recv(2048)
response=""

while len(bytes)>0:
    response+=bytes.decode()
    bytes = sock.recv(2048)

print(response)

sock.close()

#read()

#close()