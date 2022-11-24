'''2. Realiza un programa que lea 10 números, los imprima separados por coma y a
continuación los desplace una posición (y los muestre por pantalla desplazados), de
tal forma que el último pase a la primera posición, el primero a la segunda, el
segundo a la tercera, y así sucesivamente.'''

'''Opcional: Añade un parámetro (D/I) a la función para que el controle el sentido del
desplazamiento (a derechas/izquierdas) y otro que indique el número de posiciones
a desplazar (0: quedaría igual, 1: desplaza una posición, etc.).'''


lista = []




for i in range(10):
    num = int(input("Dime un numero:"))
    lista.append(num)
    
    
#OPCION FACIL
    
'''

lista2 = []

def opciones(lista):
    opcion = input("Opcion(D/I):")
    if(opcion == "D"):
        print(derecha(lista2))
        print("-------------------")
    elif(opcion == "I"):
        print(izquierda(lista2))
        print("-------------------")
    else:
        print("ERROR")
    
    return lista


def derecha(lista2):
    lista2.append(lista[len(lista)-1])

    for j in range(len(lista)-1):
        lista2.append(lista[j])
    
    return lista2
        
        
def izquierda(lista2):
    for j in range(len(lista)-1):
        lista2.append(lista[j+1])
    
    lista2.append(lista[0])
    
    return lista2


print(opciones(lista))

'''
    
#OPCION DIFICIL
    
print(lista)

opcion = input("Opcion(D/I):")

if(opcion == "D"):

    numAntiguo = lista[0]
    numCambio = 0
    
    lista[0] = lista[len(lista)-1]
    
    for i in range(1,len(lista)):
        numCambio = lista[i]
        lista[i] = numAntiguo
        numAntiguo = numCambio
        
    print(lista)
    
elif(opcion == "I"):
    
    numAntiguo = lista[0]
    
    
    for i in range(len(lista)-1):
        lista[i] = lista[i+1]
    
    lista[len(lista)-1] = numAntiguo
    
    print(lista)



