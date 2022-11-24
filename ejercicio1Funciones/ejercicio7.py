'''7. Escribir una función denominada encajan que indique si dos fichas de dominó
encajan o no. Las fichas son recibidas en dos cadenas de texto con el siguiente
formato [3,4] [2,5]'''

ficha1 = []
ficha2 = []
    
while(len(ficha1) < 2 and len(ficha2) < 2):
        
    num1 = int(input("Ficha 1:"))
    
    while(num1 > 6 or num1 < 1):
        print("Numero introducido para la ficha incorrecto, por favor vuelva introducirlo")
        num1 = int(input("Ficha 1:"))

    ficha1.append(num1)
        
    num2 = int(input("Ficha 2:"))
    
    while(num2 > 6 or num2 < 1):
        print("Numero introducido para la ficha incorrecto, por favor vuelva introducirlo")
        num2 = int(input("Ficha 2:"))
    
    ficha2.append(num2)
        
print(ficha1)
print(ficha2)



def encajan (ficha1,ficha2):
        
    encajanFichas = False
    
    for i in range(len(ficha1)):
        for j in range(len(ficha2)):
            if(ficha1[i] == ficha2[j]):
                encajanFichas = True
    
    return encajanFichas


print(encajan(ficha1,ficha2))


