'''2. Design a function called lowCaseInString that has a string of characters as parameter, the
method should return how many of those characters are lowcase letters.'''

def lowCaseInString(cadena):
    contadorMin = 0
    for i in range(len(cadena)):
        if(cadena[i] == cadena[i].lower()):
            contadorMin += 1
    
    return contadorMin

print(lowCaseInString("EsTernoCLIDOMASTOIDEO"))