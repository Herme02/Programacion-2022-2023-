'''6. Diseña una función llamada estaOrdenada que reciba una lista de elementos y
devuelva True si está ordenada o False en caso contrario.'''

lista = [1,2,3,4,5]

def estaOrdenada(lista):
    validacion = True
    
    numAnterior = lista[0]
    
    opciones = input("El orden es de > o de < ?:")
    
    for i in range(1,len(lista)):
        
        if(opciones == "<"):
            
            if(lista[i] < numAnterior):
                validacion = False
            else:
                numAnterior = lista[i]
                
        elif(opciones == ">"):
            
            if(lista[i] > numAnterior):
                validacion = False
            else:
                numAnterior = lista[i]
                
        else:
            print("Opcion incorrecta")
            
    return validacion

print(estaOrdenada(lista))