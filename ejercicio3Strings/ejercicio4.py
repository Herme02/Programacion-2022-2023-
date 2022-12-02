'''4. Design a function called numberInString that has a string of characters as parameter, the
method should return how many of those characters are numbers.'''

def numberInString(cadena):
    numeros = "123456789"
    contadorNum = 0
    for i in range(len(cadena)):
        for j in range(len(numeros)):
            if(cadena[i] == numeros[j]):
                contadorNum += 1
    
    return contadorNum

print(numberInString("EsTernoCLEIDOMASTOIDEO1"))