'''8. Realiza un programa que añada números enteros a una lista hasta que se
introduzca un número negativo. Haciendo uso de esta lista, elabora funciones que
devuelvan:
a. una lista con todos los que sean primos.
b. el sumatorio
c. el promedio de los valores.
d. una lista con el factorial de cada uno de esos números.'''

lista = []

num = int(input("Dime un numero"))

while(num >= 0):
    lista.append(num)
    num = int(input("Dime un numero"))

print("-----------------------")
print('''a. una lista con todos los que sean primos.
b. el sumatorio
c. el promedio de los valores.
d. una lista con el factorial de cada uno de esos números.''')
print("-----------------------")




def sumatorio(lista):
    sumaTotal = 0
    for i in range(len(lista)):
        sumaTotal += lista[i]
    
    return sumaTotal

def media(lista):
    media = sumatorio(lista) / len(lista)
    
    return media

def factorial(lista):
    listaFactorial = []
    
    for i in range(len(lista)):
        
        factorial = 1
    
        contador = lista[i]
        
        if(lista[i] > 1):    
            while(contador >= 1):
                factorial *= contador
                contador -= 1
        
        listaFactorial.append(factorial)
    
    return listaFactorial

def primos(lista):
    listaPrimos = []
    contador = 1
    contadorNoPrimos = 0
    
    for i in range(len(lista)):
        contador = 1
        while contador <= lista[i]:
            if(contador != 1 and contador != lista[i]):
                if(lista[i] % contador == 0):
                    contadorNoPrimos += 1
            contador += 1
            
        if(contadorNoPrimos == 0):
            listaPrimos.append(lista[i])
    
    return listaPrimos



opcion = input("Dime una opcion:")

while(opcion == "a" or opcion == "b" or opcion == "c" or opcion == "d"):
    
    if(opcion == "a"):
        print(primos(lista))
    elif(opcion == "b"):
        print(sumatorio(lista))
    elif(opcion == "c"):
        print(media(lista))
    else:
        print(factorial(lista))
        
    opcion = input("Dime una opcion:")

