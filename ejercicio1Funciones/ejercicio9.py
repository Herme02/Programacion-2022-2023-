'''9. Desarrolla un programa que a partir de una lista de números y un entero k, realice la
llamada a tres funciones: a) para devolver una lista de números con los menores de
k, b) otra con los mayores y c) otra con aquellos que son múltiplos de k.'''

lista = [1,2,3,4,5,6,7,8,9]

k = int(input("k ="))



def menores(lista):
    listaMenores = []
    
    for i in range(len(lista)):
        if(lista[i] < k):
            listaMenores.append(lista[i])
    
    return listaMenores


def mayores(lista):
    listaMayores = []
    
    for i in range(len(lista)):
        if(lista[i] > k):
            listaMayores.append(lista[i])
    
    return listaMayores


def multiplos(lista):
    listaMultiplo = []
    
    for i in range(len(lista)):
        if(k % lista[i] == 0):
            listaMultiplo.append(lista[i])
    
    return listaMultiplo


opcion = input("Opcion:")

print('''a) para devolver una lista de números con los menores de k
b) otra con los mayores 
c) otra con aquellos que son múltiplos de k.''')

while(opcion == "a" or opcion == "b" or opcion == "c"):
    if(opcion == "a"):
        print(menores(lista))
    elif(opcion == "b"):
        print(mayores(lista))
    else:
        print(multiplos(lista))
        
    opcion = input("Opcion:")
        
    
    
    
    
    