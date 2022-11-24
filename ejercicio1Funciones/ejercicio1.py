'''1. Crea un programa que genere 100 números de forma aleatoria y que posteriormente
ofrezca al usuario la posibilidad de:
a. Conocer el mayor
b. Conocer el menor
c. Obtener la suma de todos los números
d. Obtener la media
e. Sustituir el valor de un elemento por otro número introducido por teclado
f. Mostrar todos los números'''


from random import randint

lista = []

for i in range(100):
    numero = randint(0, 1000)
    lista.append(numero)
    



'''Funciones'''

def mayor(lista):
    numMayor = lista[0]
    
    for i in range(len(lista)):
        if(lista[i] > numMayor):
            numMayor = lista[i]
    
    return numMayor


def menor(lista):
    numMenor = lista[0]
    
    for i in range(len(lista)):
        if(lista[i] < numMenor):
            numMenor = lista[i]
    
    return numMenor


def sumaTotal(lista):
    total = 0
    
    for i in range(len(lista)):
        total += lista[i]
    
    return total


def media(media):
    media = sumaTotal(lista) / len(lista)
    
    return media


def sustituir(lista):
    posicion = int(input("Posicion a cambiar:"))
    num = int(input("Numero nuevo:"))
    
    for i in range(len(lista)):
        if i == posicion:
            lista[i] = num
    
    return lista


def mostrar(lista):
    return lista






'''Menu'''

print('''a. Conocer el mayor
b. Conocer el menor
c. Obtener la suma de todos los números
d. Obtener la media
e. Sustituir el valor de un elemento por otro número introducido por teclado
f. Mostrar todos los números''')


opcion = input("Elija la opcion:")


while(opcion == "a" or opcion == "b" or opcion == "c" or opcion == "d" or opcion == "e" or opcion == "f"):
    if(opcion == "a"):
        print(mayor(lista))
    elif(opcion == "b"):
        print(menor(lista))
    elif(opcion == "c"):
        print(sumaTotal(lista))
    elif(opcion == "d"):
        print(media(lista))
    elif(opcion == "e"):
        print(sustituir(lista))
    elif(opcion == "f"):
        print(mostrar(lista))
    
    opcion = input("Elija la opcion:")





