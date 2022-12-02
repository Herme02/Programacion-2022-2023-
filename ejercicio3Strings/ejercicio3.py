'''3. Design a function called upperCaseInString that has a string of characters as parameter, the
method should return how many of those characters are upper case letters.'''

def upperCaseInString(cadena):
    contadorMay = 0
    for i in range(len(cadena)):
        if(cadena[i] == cadena[i].upper()):
            contadorMay += 1
    
    return contadorMay

print(upperCaseInString("EsTernoCLEIDOMASTOIDEO"))